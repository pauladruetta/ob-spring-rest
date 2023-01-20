package com.openbootcam.obrestdatajpa;

import com.openbootcam.obrestdatajpa.repository.BookRepository;
import com.openbootcam.obrestdatajpa.entities.Book;
import com.openbootcam.obrestdatajpa.entities.Laptop;
import com.openbootcam.obrestdatajpa.repository.LaptopRepository;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
                
                BookRepository repository = context.getBean(BookRepository.class);
                
                LaptopRepository lapRepository = context.getBean(LaptopRepository.class);

                                
                Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2018, 12, 1), true );
                Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 450, 19.99, LocalDate.of(2013, 12, 1), true );
	
                repository.save(book1);
                //repository.save(book2);
                
                Laptop laptop = new Laptop(null, "FlexOne");
                
                lapRepository.save(laptop);
                
	}
        

}
