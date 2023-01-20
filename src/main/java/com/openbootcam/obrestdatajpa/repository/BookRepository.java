
package com.openbootcam.obrestdatajpa.repository;

import com.openbootcam.obrestdatajpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
