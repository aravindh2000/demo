package com.example.demo;


import ModelPack.UserRequest;
import data.CollectedUserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctrl {

    @GetMapping("/api")
    public String getData(@RequestBody UserRequest userRequest)
    {
        CollectedUserData cud=new CollectedUserData();
        cud.setNameOfUser(userRequest.getUserName());
        return "siva";
    }
}
