/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.edutrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.edutrack.domain.Mark;

/**
 *
 * @author THABO64
 */
@Repository 
public interface MarkRepository extends JpaRepository<Mark, Long>{
    
}
