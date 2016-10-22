package com.example.user.huay.model;
import java.util.Random;
public class huay {
    Random rand = new Random();
    private int random = 0;
    public String getRandomTwoDigits(){
        random = rand.nextInt(100);
        return setValue2Digits(random);
    }
    public String getRandomThreeDigits(){
        random = rand.nextInt(1000);
        return setValue3Digits(random);
    }
    private String setValue2Digits(int value){
        String str = Integer.toString(value);
        if(value < 10){
            str = "0" + str;
        }
        return str;
    }
    private String setValue3Digits(int value){
        String str = Integer.toString(value);
        if(value < 10){
            str = "00" + str;
        }
        else if(value < 100){
            str = "0" + str;
        }
        return str;
    }
}
