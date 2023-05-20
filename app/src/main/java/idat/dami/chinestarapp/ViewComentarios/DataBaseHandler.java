package idat.dami.chinestarapp.ViewComentarios;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    protected static final String DATABASE_NAME = "ComentatiosDatabase";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE comentarios" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "usuario TEXT, " +
                "comentario TEXT, " +
                "fecha TEXT )";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS comentarios";
        db.execSQL(sql);

        onCreate(db);
    }


}
