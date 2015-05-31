package th.co.geniustree.dental.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import th.co.geniustree.dental.domain.User;
import th.co.geniustree.dental.repository.UserRepository;
import th.co.geniustree.dental.service.UserService;

/**
 *
 * @author pramoth
 */
@Controller
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/new", method = RequestMethod.GET)
    public String prepareNew(Model model) {
        model.addAttribute("user", new User());
        return "user/forms";
    }

    @RequestMapping(value = "/user/new", method = RequestMethod.POST)
    public String newUser(@Valid User user, BindingResult error, Model model) {
        LOG.debug("User  -> {}", user.getName());
        if (error.hasErrors()) {
            LOG.debug("validation error  -> {}", error);
            model.addAttribute("user", user);
            return "user/forms";
        }
        userService.save(user);
        model.addAttribute("user", new User());
        return "redirect:/user";
    }
    
    @RequestMapping(value = "/user")
    public String list(Model model,Pageable pagable) {
        model.addAttribute("users",userRepository.findAll(pagable));
        return "user/users";
    }
}
