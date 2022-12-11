package cl.duoc.prueba3.DTO;

import java.time.LocalDate;

public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private LocalDate fechaEmbasado;
    private int precio;

    public Producto(int codigo, String nombre, int cantidad, LocalDate fechaEmbasado, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaEmbasado = fechaEmbasado;
        this.precio = precio;
    }
    
    public Producto() {
        this.codigo = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.fechaEmbasado = LocalDate.now();
        this.precio = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaEmbasado() {
        return fechaEmbasado;
    }

    public void setFechaEmbasado(LocalDate fechaEmbasado) {
        this.fechaEmbasado = fechaEmbasado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    public String toString(){
        return "Codigo: "+String.valueOf(this.codigo) + " cantidad: "+ this.cantidad + " fecha envasado: "+ this.fechaEmbasado;
    }
}
