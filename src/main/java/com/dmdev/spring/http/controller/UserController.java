package com.dmdev.spring.http.controller;

import com.dmdev.spring.dto.UserCreateEditDto;
import com.dmdev.spring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String findAll(Model model) {
//        model.addAttribute("user", userService.findAll());
//        model.addAttribute("user", userService.findAll(filter));
        return "user/users";
    }

    @GetMapping("/{id}")
    public String findById(Model model,@PathVariable("id") long id){
//        model.addAttribute("user", userService.findById(id));

        return"user/user";
    }
    @PostMapping
    public String create(@ModelAttribute UserCreateEditDto user){
//userService.create(user);

     return "redirect:/users/"+25;
    }

   // @PostMapping("/{id}")
    @PostMapping("/{id}/update")
    public String update(@PathVariable("id") Long id,@ModelAttribute UserCreateEditDto user){
//       userService.update(id,user);
        return "redirect:/users/{id}";
    }

//    @DeleteMapping("/{id}")
@PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id){
//        userService.delete(id);
        return "redirect:/users";
    }

}
