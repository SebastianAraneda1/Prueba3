package cl.duoc.prueba3.Services.Implements;

import cl.duoc.prueba3.DTO.Cliente;
import java.util.ArrayList;
import java.util.List;

public class listaCliente {
    List<Cliente> lista;
    
    public listaCliente(){
        this.lista = new ArrayList();
    }
    
    
    public void agregarCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public String imprimirListaCliente(){
        StringBuilder sr = new StringBuilder();
        for (Cliente cliente : lista) {
            sr.append(cliente.toString()+ "\n");
        }
        return String.valueOf(sr);
    }
}
