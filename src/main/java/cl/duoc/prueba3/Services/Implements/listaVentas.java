package cl.duoc.prueba3.Services.Implements;

import cl.duoc.prueba3.DTO.Venta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listaVentas {
    List<Venta> lista = new ArrayList();
    
    public void agregarVenta(Venta venta){
        lista.add(venta);
    }
    
    public int getTotalVenta(){
        int total = 0;
        for (Venta venta : lista) {
            total = total+venta.totalPago;
        }
        return total;
    }
    
    public String getProductoMasVendido(){
        int total = 0;
        String producto = "";
        for(Venta venta : lista){
            if(total < Collections.frequency(lista, venta.producto)){
                total = Collections.frequency(lista, venta.producto);
                producto = venta.producto;
            }
        }
        return producto;
    }
    
    public List<Venta> listar(){
        return lista;
    }
    
    public int largoLista(){
        return lista.size();
    }
    
    public String imprimirListaVentas(){
    StringBuilder sr = new StringBuilder();
    for (Venta venta : lista) {
        sr.append(venta.cliente+ " compro "+ venta.cantidad + " de "+ venta.producto+ " del vendedor "
                + venta.vendedor + " el "+venta.fechaVenta+ " para entregar el "+venta.fechaEntrega+ 
                " con un total de: $"+venta.totalPago+"\n");
    }
    return String.valueOf(sr);
    }
}
