package cl.duoc.prueba3.DTO;

public class Cliente extends Persona{
    private String comuna;
    private int telefono;

    public Cliente(int rut, String nombre, String direccion, String correo) {
        super(rut, nombre, direccion, correo);
    }

    public Cliente(String comuna, int telefono) {
        super();
        this.comuna = comuna;
        this.telefono = telefono;
    }
    
    public Cliente() {
        super();
        this.comuna = "";
        this.telefono = 0;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "El cliente "+ this.nombre+ ", ha sido agregado con exito";
    }
}
