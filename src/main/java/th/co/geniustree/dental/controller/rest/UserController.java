/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.controller.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.dental.domain.User;
import th.co.geniustree.dental.repository.UserRepository;

/**
 *
 * @author pramoth
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping(value = "/users/{email}/")
    public User getUser(@PathVariable("email") String email){
        return userRepository.findOne(email);
    }
    @RequestMapping(value = "/users")
    public Page<User> getUsers(Pageable pageable){
        return userRepository.findAll(pageable);
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public User getUsers(@Valid @RequestBody User user){
        return userRepository.save(user);
    }
}