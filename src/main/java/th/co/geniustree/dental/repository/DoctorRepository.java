/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.dental.domain.Doctor;

/**
 *
 * @author Best
 */
public interface DoctorRepository extends JpaRepository<Doctor, String> {
    
}
