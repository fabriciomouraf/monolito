package com.backoffice.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teste")
public class TesteResource {

    @GetMapping
    public String teste(){
        return "testando redirect para o backend";
    }
}
