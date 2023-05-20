package idat.dami.chinestarapp.ViewComentarios;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import idat.dami.chinestarapp.model.Comentario;

public class ComentarioTableController extends DataBaseHandler {

    public ComentarioTableController(Context context) {
        super(context);
    }

    public boolean create(Comentario comentario) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("usuario", comentario.getUsuario().toUpperCase(Locale.ROOT));
        contentValues.put("comentario", comentario.getComentario());
        contentValues.put("fecha", comentario.getFecha());


        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("comentarios", null, contentValues) > 0;
        db.close();

        return createSuccessful;
    }

    public int count() {
        String sql = "SELECT usuario FROM comentarios";

        SQLiteDatabase db = this.getReadableDatabase();

        int recordCount = db.rawQuery(sql, null).getCount();
        db.close();

        return recordCount;
    }

    public List<Comentario> read() {
        List<Comentario> recordList = new ArrayList<Comentario>();

        String sql = "SELECT id,usuario,comentario,fecha FROM comentarios ORDER BY id DESC";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
                String user = cursor.getString(cursor.getColumnIndex("usuario"));
                String coment = cursor.getString(cursor.getColumnIndex("comentario"));
                String date = cursor.getString(cursor.getColumnIndex("fecha"));

                Comentario comentario = new Comentario();
                comentario.setId(id);
                comentario.setUsuario(user);
                comentario.setComentario(coment);
                comentario.setFecha(date);

                recordList.add(comentario);

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return recordList;
    }

    public Comentario readSingleRecord(int comentarioId) {
        Comentario comentario = null;

        String sql = "SELECT id,usuario,comentario,fecha FROM comentarios WHERE id=" + comentarioId;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
            String user = cursor.getString(cursor.getColumnIndex("usuario"));
            String coment = cursor.getString(cursor.getColumnIndex("comentario"));
            String date = cursor.getString(cursor.getColumnIndex("fecha"));

            comentario = new Comentario();
            comentario.setId(id);
            comentario.setUsuario(user);
            comentario.setComentario(coment);
            comentario.setFecha(date);
        }

        cursor.close();
        db.close();

        return comentario;
    }

    public boolean update(Comentario comentario) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("usuario", comentario.getUsuario());
        contentValues.put("comentario", comentario.getComentario());
        contentValues.put("fecha", comentario.getFecha());

        String where = "id =?";

        String[] whereArgs = {Integer.toString(comentario.getId())};

        SQLiteDatabase db = this.getWritableDatabase();

        boolean updateSuccessful = db.update("comentarios", contentValues, where, whereArgs) > 0;
        db.close();

        return updateSuccessful;
    }

    public boolean delete(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        boolean deleteSuccessful = db.delete("comentarios", "id='" + id + "'", null) > 0;
        db.close();
        return deleteSuccessful;
    }


}
