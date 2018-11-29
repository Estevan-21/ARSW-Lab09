/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSW.Preparcial2.Persistence;

import ARSW.Preparcial2.Cadena;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author estudiante
 */
public interface StringRepository extends MongoRepository<Cadena, String> {
    
    /**
     *
     * @param 
     * @return
     */    
    
   // public List<String> findString(String Cadena);
    
}
