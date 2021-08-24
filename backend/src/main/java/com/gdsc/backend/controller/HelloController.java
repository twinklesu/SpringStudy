package com.gdsc.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class HelloController {

    HashMap<String, String> map = new HashMap<String,String>();

    public HelloController() {
        this.map.put("name", "subin");
    }


    @GetMapping("/hello")
    public HashMap<String, String> getHello(){
        return map;
    }

    @PostMapping("/hello")
    public HashMap<String, String> postHello(@RequestParam HashMap<String,String> map){
        String value = map.get("name");
        this.map.put("name", value); // db에 넣어주는 셈
        return map; // 원래같으면 성공하면 200
    }
}
