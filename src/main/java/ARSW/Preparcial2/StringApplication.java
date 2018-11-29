package ARSW.Preparcial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ARSW.Preparcial2.Persistence.StringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


/**
 *
 * @author estudiante
 */

@SpringBootApplication
@Service
public class StringApplication {
    
    @Autowired 
    private static StringRepository repository;

    public static void main(String[] args) {
        //SpringApplication.run(StringApplication.class, args);
        repository.save(new Cadena("ABC"));
    }
    
}
