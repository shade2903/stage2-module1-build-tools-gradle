package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for(String e : args){
            if(!StringUtils.isPositiveNumber(e)){
                return false;
            }
        }
        return true;

    }
}