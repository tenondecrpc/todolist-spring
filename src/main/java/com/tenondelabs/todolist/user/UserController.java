package com.tenondelabs.todolist.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel user) {
        return user;
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }
}
