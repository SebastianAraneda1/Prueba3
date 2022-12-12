package cl.duoc.prueba3.DTO;
//fecha de venta, fecha de entrega, Cliente, Vendedor,
//Cantidad de Productos, Código Producto, observaciones de la venta y el total a paga

import java.time.LocalDate;

public class Venta {
    public String cliente;
    public String producto;
    public String vendedor;
    public int cantidad;
    public LocalDate fechaVenta;
    public LocalDate fechaEntrega;
    public String obervaciones;
    public int totalPago;
    public int liros;

    public Venta(LocalDate fechaVenta, LocalDate fechaEntrega, String obervaciones, int totalPago, int litros, String cliente, String producto, String vendedor, int cantidad) {
        this.fechaVenta = fechaVenta;
        this.fechaEntrega = fechaEntrega;
        this.obervaciones = obervaciones;
        this.totalPago = totalPago;
        this.liros = litros;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public Venta() {
    this.fechaVenta = LocalDate.now();
    this.fechaEntrega = LocalDate.now();
    this.obervaciones = "";
    this.totalPago = 0;
    this.liros = 0;
    this.cliente = "";
    this.vendedor = "";
    this.producto = "";
    this.cantidad = 0;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
