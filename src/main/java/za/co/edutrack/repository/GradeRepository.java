/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.edutrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.edutrack.domain.Grade;

/**
 *
 * @author Tswalano
 */
@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{
    
}
