/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Best
 */
@Controller
public class DoctorController{
    
    @RequestMapping("/Doctor/new")
    public String addDoctor(){
        return "doctor";
    }
    
}
