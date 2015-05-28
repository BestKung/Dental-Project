/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.domain.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import th.co.geniustree.dental.domain.User;
import th.co.geniustree.dental.repository.UserRepository;

/**
 *
 * @author kekhuay
 */
@Service
public class CustomerDetailService implements UserDetailsService {

    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User findOne = repository.findOne(username);
        if (findOne == null) {
            throw new UsernameNotFoundException("User " + username + " not found.");
        }
        return findOne;
    }
    
}
