package cl.duoc.prueba3.DTO;

public abstract class Persona {
    public int rut;
    public String nombre;
    public String direccion;
    public String correo;

    public Persona(int rut, String nombre, String direccion, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Persona() {
    this.rut = 0;
    this.nombre = "";
    this.direccion = "";
    this.correo = "";
    }
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public abstract String toString();
}
