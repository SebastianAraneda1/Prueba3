package cl.duoc.prueba3.Services.Implements;

import cl.duoc.prueba3.DTO.Producto;
import java.util.ArrayList;
import java.util.List;

public class listaProducto {
    List<Producto> lista;
    
    public listaProducto(){
        this.lista = new ArrayList();
    }
    
    public void agregarProducto(Producto producto){
        lista.add(producto);
    }
    
    public String imprimirListaProducto(){
       StringBuilder sr = new StringBuilder();
       for (Producto producto : lista) {
           sr.append(producto.toString()+ "\n");
       }
       return String.valueOf(sr);
    }
}
