package th.co.geniustree.dental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import th.co.geniustree.dental.domain.User;
import th.co.geniustree.dental.repository.UserRepository;

/**
 * @author pramoth
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User findOne = repository.findOne(username);
        if (findOne == null) {
            throw new UsernameNotFoundException("Not found user");
        }
        return findOne;
    }

}
