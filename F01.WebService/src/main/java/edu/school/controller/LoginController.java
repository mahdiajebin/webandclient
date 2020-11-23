package edu.school.controller;

import edu.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    LoginService service;

    @PostMapping("/login")
   Map<String, Object> isValiduser(@RequestBody Map<String,Object> map){

        String userID=map.get("uid").toString();
        String password=map.get("pwd").toString();

        Map<String,Object>mapStatus=new HashMap<>();
        boolean status=service.getUserInfo(userID,password);
        mapStatus.put("status",status);

        return mapStatus ;
    }



}
