package com.company;

public class array {
    public static void main(String[] args) {
//        int [] marks=new int [5];
//        marks[0]=87;
//        marks[1]=97;
//        marks[2]=57;
//        marks[3]=37;
//        marks[4]=67;
    //    int [] marks = {87,97,57,37,67};
//        System.out.print(marks.length);
//        for(int i=0;i< marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        for(int element:marks){
//            System.out.println(element);
//        }
        //Multidimentional Array
        int [][]flats;
        flats=new int[2][3];
        flats[0][0]=2;
        flats[0][1]=3;
        flats[0][2]=4;
        flats[1][0]=5;
        flats[1][1]=6;
        flats[1][2]=7;
        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
