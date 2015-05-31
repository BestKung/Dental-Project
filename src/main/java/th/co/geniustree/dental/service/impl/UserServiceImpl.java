/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.dental.domain.User;
import th.co.geniustree.dental.repository.UserRepository;
import th.co.geniustree.dental.service.UserService;

/**
 *
 * @author pramoth
 */
@Service
@Transactional(propagation = Propagation.REQUIRED )
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User save(User user) {
       return userRepository.save(user);
    }
    
}
