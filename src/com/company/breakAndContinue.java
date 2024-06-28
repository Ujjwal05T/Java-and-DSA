package com.company;

public class breakAndContinue {
    public static void main(String[] args) {
//        for(int i=0;i<=5;i++){
//            System.out.println("THE \"ONEPIECE\" IS REAL");
//            if(i==3){
//                System.out.println("breaking loop");
//                break;
//            }
//        }
        for(int i=0;i<=5;i++){

            if(i==3){
                System.out.println("breaking loop");
                continue;
            }
            System.out.println("THE \"ONEPIECE\" IS REAL");
       }
    }
}
