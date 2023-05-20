package modelo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Usuario extends RealmObject {

    @PrimaryKey
    private String correo;
    private String password;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
