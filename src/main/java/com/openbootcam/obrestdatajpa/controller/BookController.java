
package com.openbootcam.obrestdatajpa.controller;

import com.openbootcam.obrestdatajpa.entities.Book;
import com.openbootcam.obrestdatajpa.repository.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    //atributos
    private BookRepository bookRepository;
    
    //constructores 
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //CRUD sobre la entidad Book    
    
        //Buscar todos los libros
    @GetMapping("/books")
    public List<Book> findAll(){
       return bookRepository.findAll();
    }

    

    @GetMapping("/books/{id}")
    // Buscar un solo libro de la base de datos
    public ResponseEntity<Book> findOneById(@PathVariable("id") Long id) {
        
        Optional<Book> BookOpt = bookRepository.findById(id);
        
        if (BookOpt.isPresent()) {
            return ResponseEntity.ok(BookOpt.get()) ;
        } else {
            return ResponseEntity.notFound().build();
        }

    }               
    
    
    //Crear un libro en base de datos
    @PostMapping("/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println("headers = " + headers.get("User-agent"));
        return bookRepository.save(book);
    }         

    //Eliminar un libro                
//                repository.deleteById(1L);


    
    
}
