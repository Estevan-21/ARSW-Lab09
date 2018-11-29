/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSW.Preparcial2.Controller;

import ARSW.Preparcial2.Service.StringServices;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author estudiante
 */

@RestController
@RequestMapping(value = "/cadena")
@Service
public class StringController {
    
    @Autowired
    private StringServices service;
    
    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public ResponseEntity<?> getCadenas() {
        try {
            return new ResponseEntity<>(service.obtenerCadenas(), HttpStatus.ACCEPTED);
        } catch (IOException e) {
            return new ResponseEntity<>("Error al obtener las cadenas.", HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)	
    public ResponseEntity<?> setCadena(@RequestBody String cadena){
        try {                                              
            service.registrarCadenas(cadena);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            Logger.getLogger(StringController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error, no se ha podido agregar la cadena",HttpStatus.FORBIDDEN);            
        }        
	
    }
    // curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/cadena -d '{"abc":"def"}'
}
