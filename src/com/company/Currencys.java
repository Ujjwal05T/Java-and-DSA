package com.company;
import java.util.*;
import java.text.*;
import static java.text.NumberFormat.getCurrencyInstance;

public class Currencys {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double payment = scanner.nextDouble();
                scanner.close();
        Locale in = new Locale("en","IN");
        NumberFormat nf = getCurrencyInstance(in);
        String india = nf.format(payment);
        NumberFormat cf = getCurrencyInstance(Locale.CHINA);
        String china = cf.format(payment);
        NumberFormat uf = getCurrencyInstance(Locale.US);
        String us = uf.format(payment);
        NumberFormat ff = getCurrencyInstance(Locale.FRANCE);
        String france = ff.format(payment);
                System.out.println("US: " +us );
                System.out.println("India: " + india);
                System.out.println("China: " + china);
                System.out.println("France: " + france);
            }

}
