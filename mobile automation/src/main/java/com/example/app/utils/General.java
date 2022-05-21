package com.example.app.utils;

import java.util.Random;

public class General {

    Random num = new Random();

    public String randomNumForEmail(String Email){
        return "tamtama" + num.nextInt(1000) + "gmail.com";
    }
}
