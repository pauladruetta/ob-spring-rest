
package com.openbootcam.obrestdatajpa.controller;

import com.openbootcam.obrestdatajpa.entities.Laptop;
import com.openbootcam.obrestdatajpa.repository.LaptopRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    
    
    //atributos
    private LaptopRepository repository;
    
    //constructores 

    public LaptopController(LaptopRepository repository) {
        this.repository = repository;
    }

    

   
    @GetMapping("/laptops")
    public List<Laptop> findAll(){
    
        return repository.findAll();
    }
     
    @PostMapping("/laptops")
    public Laptop addOne(@RequestBody Laptop laptop){
        return repository.save(laptop);
    }
    
}
