package com.linbsoft.microserviceoathh2server8301;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 通过token获取用户信息
*/
@RestController
public class UserController {
@GetMapping("/")
public String indexmain(){
return "me is oauth2 server!";
}
@GetMapping("/user")
public Principal user(Principal user){
return user;
}
}
