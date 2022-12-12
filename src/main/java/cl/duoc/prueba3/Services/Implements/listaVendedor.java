package cl.duoc.prueba3.Services.Implements;

import cl.duoc.prueba3.DTO.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class listaVendedor {
    List<Vendedor> lista;
    
    public listaVendedor(){
        this.lista = new ArrayList();
    }
        
        /*Vendedor vendedor = new Vendedor();
        vendedor.rut = 208329812;
        vendedor.nombre = "Seba";
        vendedor.fono = 32782635;
        vendedor.correo = "seb.araneda@duocuc.cl";
        vendedor.direccion = "Los limoneros 4530";
        this.lista.add(vendedor);
    */
    
    public List<Vendedor> Listar(){
        return lista;
    }
   
    public void agregarVendedor(Vendedor vendedor){
        lista.add(vendedor);
    }
    
    /*public List<String> getVendedores(){
        List<String> listaN = new ArrayList<String>();
        for (Vendedor vendedor : lista) {
            listaN.add(vendedor.nombre);
        }
        
        return listaN;
    }*/
    
    public String imprimirListaVendedor(){
        StringBuilder sr = new StringBuilder();
        for (Vendedor vendedor : lista) {
            sr.append(vendedor.toString()+ "\n");
        }
        return String.valueOf(sr);
    }
}
