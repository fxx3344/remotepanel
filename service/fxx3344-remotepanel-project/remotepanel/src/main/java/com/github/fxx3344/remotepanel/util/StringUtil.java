package com.github.fxx3344.remotepanel.util;

public class StringUtil {
    public static boolean isNullOrWhitespace(String s){
        if(s == null){
            return true;
        }
        return s.isBlank();
    }

    public static String trimNotNull(String s){
        if(s == null){
            return null;
        }
        return s.trim();
    }
}
