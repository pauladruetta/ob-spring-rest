
package com.openbootcam.obrestdatajpa.repository;

import com.openbootcam.obrestdatajpa.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    
}
