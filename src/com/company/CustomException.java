package com.company;
class MyException extends Exception{
        public MyException(String s){
            super(s);    // constructor for error msg
        }
//    @Override
//    public String toString(){
//            return "Xyz";
//    }
//    @Override
//    public String getMessage(){ //priority method for error msg
//        return "Error";
//    }
}

public class CustomException  {
    public static void main(String[] args) {
        int a =9;
        if(a<10) {
            try {
                throw new Exception("hello");
            } catch (Exception e) {
               System.out.println(e);
                System.out.println(e.getMessage()); //e will print error msg from method or constructor priority = method toString>getMessage>constructor
//                e.printStackTrace();
            }
        }
    }
}
