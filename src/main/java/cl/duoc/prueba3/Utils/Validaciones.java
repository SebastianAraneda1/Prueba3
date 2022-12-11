package cl.duoc.prueba3.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validaciones {
    
    public static boolean largoMinimoPalabra(int largo, String palabra){
        return palabra.length() > largo;
    }
    
    public static LocalDate formatearFecha ( String fechaTxt ) {
        LocalDate fechaFormateada;
        DateTimeFormatter formatoDeEntrada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaFormateada = LocalDate.parse(fechaTxt, formatoDeEntrada);
        //System.out.println(fechaFormateada);
        return fechaFormateada;
    }
}
