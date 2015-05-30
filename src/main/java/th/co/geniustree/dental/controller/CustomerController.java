/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import th.co.geniustree.dental.repository.CustomerRepository;

/**
 *
 * @author Best
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customer;
    
   @RequestMapping(value = "/customer/new" , method = RequestMethod.POST)
    public String Custtomer(@RequestParam("hn") String hn){
     
        return "customernew";
    }
    
    
}
