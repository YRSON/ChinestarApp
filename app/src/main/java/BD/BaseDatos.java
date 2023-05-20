/*
package BD;

import android.content.Context;

import io.realm.RealmConfiguration;
import io.realm.gradle.Realm;

public class BaseDatos {

    private static BaseDatos instance=new BaseDatos();
    public static BaseDatos getInstance() { return instance; }

    private Realm con;
    private String nombre;

    public Realm conectar(Context context){
        if (con==null){
            Realm.init(context);
            String nombre = "chinestarbd";
            RealmConfiguration config = new RealmConfiguration.Builder().name(nombre).build();
            con = Realm.getInstance(config);
        }
        return con;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){ this.nombre = nombre; }
}
*/
