package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for(String e : args){
            if(Integer.parseInt(e)< 0){
                return false;
            }
        }
        return true;

    }
}