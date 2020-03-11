package com.dboi.dws.mathquiz.service;

import com.dboi.dws.mathquiz.model.RandomNumber;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
    RandomNumber randomNumber=new RandomNumber();
    public String randomnumber()
    {
        return randomNumber.generate_randomno();

    }
}
