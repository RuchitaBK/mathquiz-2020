package com.dboi.dws.mathquiz.rest;

import com.dboi.dws.mathquiz.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    @Autowired
    MultiplicationService multiplicationService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/random")
    public String randomno()
    {
        return multiplicationService.randomnumber();
    }

}
