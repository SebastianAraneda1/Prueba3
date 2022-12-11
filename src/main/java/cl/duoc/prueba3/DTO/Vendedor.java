package cl.duoc.prueba3.DTO;

public class Vendedor extends Persona{
    public int fono;

    public Vendedor(int rut, String nombre, String direccion, String correo) {
        super(rut, nombre, direccion, correo);
    }

    public Vendedor(int fono) {
        super();
        this.fono = fono;
    }
    
    public Vendedor() {
        super();
        this.fono = 0;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    
    @Override
    public String toString() {
        return "El vendedor "+this.nombre+ " fue agregado correctamente.";
    }
    
}
