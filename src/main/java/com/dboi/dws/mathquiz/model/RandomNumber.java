package com.dboi.dws.mathquiz.model;

public class RandomNumber {

    public String generate_randomno()
    {
        int min=10;
        int max=15;
        int random_int_1 = (int)(Math.random() * (max - min + 1) + min);
        int random_int_2 = (int)(Math.random() * (max - min + 1) + min);

        String random=random_int_1+"mul" +random_int_2;
        return random;

    }
}
