/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSW.Preparcial2.Service;

import ARSW.Preparcial2.Cadena;
import ARSW.Preparcial2.Persistence.StringRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author estudiante
 */
@Service    
public class StringServicesImp implements StringServices{
    
    @Autowired
    private StringRepository repository;
    
    public List<String> obtenerCadenas() throws IOException {
         List<Cadena> cadenas= new ArrayList();
         cadenas=repository.findAll();
         List<String> strings = new ArrayList();
         for(Cadena c: cadenas){
             strings.add(c.toString());
             System.out.println(c.toString());
         }
        return strings; 
    }

    
    public void registrarCadenas(String cadena) throws IOException {
        repository.save(new Cadena(cadena));
    }
 
}
