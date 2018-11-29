/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSW.Preparcial2;
import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author estudiante
 */
public class Cadena {
    
     @Id
    public String id;

    public String cadena;
    public String fecha;


    public Cadena() {}

    public Cadena(String cadena) {
        this.cadena = cadena;    
        fecha=new Date().toString();
    }

    @Override
    public String toString() {
        return String.format(cadena+"--"+fecha);
    }

    
}
