package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        return "user/add";
    }
    @GetMapping("{id}")
    public String displayIndexPlusSpecificUser(Model model, @PathVariable("id") Integer id) {
        if (id != null) {
            model.addAttribute("specUser", UserData.getById(id));
            model.addAttribute("users", UserData.getAll());
        }
        return "user/index";
    }
    @GetMapping
    public String displayIndex() {
        return "user/index";
    }
    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (user.getPassword().equals(verify)) {
            UserData.add(user);
            model.addAttribute("newUser", user);
            model.addAttribute("users", UserData.getAll());
            return "user/index";
        }
        else {
            model.addAttribute("error", true);
            model.addAttribute("user", user);
            return "user/add";
        }
    }
}
