package com.benicioforno.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/myapp")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return """
                <h1>Deploy 3</h1>
                <h2>Benício Reinehr Dal Forno</h2>
                <h2>02/07/2026</h2>
                """;
    }
}
