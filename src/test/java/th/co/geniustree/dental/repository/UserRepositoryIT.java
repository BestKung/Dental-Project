/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.dental.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.dental.DentalApplication;
import th.co.geniustree.dental.domain.User;

/**
 *
 * @author kekhuay
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DentalApplication.class)
@Transactional
public class UserRepositoryIT {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void savedUserMustFound() {
        User user = new User();
        user.setEmail("xxxx");
        userRepository.save(user);
        User findOne = userRepository.findOne("xxxx");
        Assertions.assertThat(findOne).isNotNull();
    }
}
