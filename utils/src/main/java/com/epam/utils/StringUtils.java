package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(org.apache.commons.lang3.StringUtils.isNumeric(str)){
            return !org.apache.commons.lang3.StringUtils.contains(str,"-");
        }

        return false;
    }
}
