/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSW.Preparcial2.Service;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface StringServices {
    
    public List<String> obtenerCadenas() throws IOException;
    public void registrarCadenas(String cadena) throws IOException;

}
