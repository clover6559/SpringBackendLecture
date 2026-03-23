package org.example.springstablehigh.example1.controller;

import org.example.springstablehigh.example1.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
@RestController
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }
  @PostMapping
  public String createUser(@RequestParam String email) {
    userService.register(email);
    return "회원가입 성공";
  }


}
