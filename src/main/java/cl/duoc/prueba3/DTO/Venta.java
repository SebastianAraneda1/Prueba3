package cl.duoc.prueba3.DTO;
//fecha de venta, fecha de entrega, Cliente, Vendedor,
//Cantidad de Productos, Código Producto, observaciones de la venta y el total a paga

import java.time.LocalDate;

public class Venta {
    public LocalDate fechaVenta;
    public LocalDate fechaEntrega;
    public String obervaciones;
    public int totalPago;
    public int liros;

    public Venta(LocalDate fechaVenta, LocalDate fechaEntrega, String obervaciones, int totalPago, int litros) {
        this.fechaVenta = fechaVenta;
        this.fechaEntrega = fechaEntrega;
        this.obervaciones = obervaciones;
        this.totalPago = totalPago;
        this.liros = litros;
    }
    
    public Venta() {
    this.fechaVenta = LocalDate.now();
    this.fechaEntrega = LocalDate.now();
    this.obervaciones = "";
    this.totalPago = 0;
    this.liros = 0;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObervaciones() {
        return obervaciones;
    }

    public void setObervaciones(String obervaciones) {
        this.obervaciones = obervaciones;
    }

    public int getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(int totalPago) {
        this.totalPago = totalPago;
    }

    public int getLiros() {
        return liros;
    }

    public void setLiros(int liros) {
        this.liros = liros;
    }
    
    
}
