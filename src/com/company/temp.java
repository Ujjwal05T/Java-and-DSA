package com.company;

import java.sql.SQLOutput;

class Ujju{
    int var;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    int fun (int a , int b) {
        int sum = a + b;
        return sum;
    }
 }
 class condition {
     Ujju mahila = new Ujju();
     int v = 12;

     void ocn() {

         if (v > 10)
             System.out.println("Mahila");
        else System.out.println("Aurat");
     }
 }

 public class temp {
     public static void main(String[] args){
         Ujju aurat = new Ujju();
         System.out.println(aurat.fun(4,7));
         System.out.println(aurat.var);
         aurat.setVar(55);
         System.out.println(aurat.getVar());

         condition lady = new condition();
         lady.ocn();
     }

 }
