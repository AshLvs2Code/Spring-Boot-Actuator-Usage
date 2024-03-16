package com.AshLvs2Code.SpringBootActuatorsUsage.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class MainController {
    
    @GetMapping("/get")
    public String demo(){
        return "This is a demo REST API with get method..!";
    }
}
