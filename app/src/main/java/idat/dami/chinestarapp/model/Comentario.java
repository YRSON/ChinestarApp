package idat.dami.chinestarapp.model;

import java.util.Date;

public class Comentario {
    private int id;
    private String usuario;
    private String comentario;
    private String fecha;

    public Comentario() {
    }

    public Comentario(int id, String usuario, String comentario, String fecha) {
        this.id = id;
        this.usuario = usuario;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
