package com.company;

import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Ujjwal";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(1,3));
        System.out.println(name.replace("al","al T"));
        System.out.println(name.startsWith("U"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("w"));
        System.out.println(name.equals("ujjwal"));
        System.out.println(name.equalsIgnoreCase("ujjwal"));
    }
}
