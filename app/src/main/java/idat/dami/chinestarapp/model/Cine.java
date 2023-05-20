package idat.dami.chinestarapp.model;

public class Cine {

    private String nombre;
    private String direccion;
    private String telefono;
    private int imagen;

    public Cine() {
    }

    public Cine(String nombre, String direccion, String telefono, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
