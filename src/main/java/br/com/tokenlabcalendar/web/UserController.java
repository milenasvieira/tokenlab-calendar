package net.guides.springboot.loginregistrationspringbootauthjsp.web;

import br.com.tokenlabcalendar.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.guides.springboot.loginregistrationspringbootauthjsp.model.User;
import net.guides.springboot.loginregistrationspringbootauthjsp.service.UserService;
import net.guides.springboot.loginregistrationspringbootauthjsp.validator.UserValidator;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        return "redirect:/calendar";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Seu username e sua senha são inválidos.");

        if (logout != null)
            model.addAttribute("message", "Logout feito com sucesso.");

        return "login";
    }

    @RequestMapping(value = {"/", "/calendar"}, method = RequestMethod.GET)
    public String calendar(Model model) {

        return "calendar";
    }

    public static List<Event> userEvents;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Event> registration(Model model,
                                    @RequestParam(required = false) String start, @RequestParam(required = false) String end) {

        if(userEvents==null) {
            userEvents = new ArrayList<>();

            userEvents.add(new Event("Academia", "2021-07-07",
                    "2021-07-10"));
        }

        model.addAttribute("events", userEvents);

        return userEvents;

    }

}