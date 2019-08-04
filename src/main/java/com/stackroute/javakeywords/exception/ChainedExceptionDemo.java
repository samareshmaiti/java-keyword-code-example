package com.stackroute.javakeywords.exception;
//this class to implement chained exception
public class ChainedExceptionDemo {
    public static void main (String args[])throws Exception  {
        int number = 20,result = 0;
        try{
            result = number/0;
            System.out.println("The result is"+result);
            //catch first exception
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic exception occoured: "+ex);
            try{
                int number2 = 50/0;
                //catch another exception
            }catch(ArithmeticException e)
            {
                System.out.println("Another exception occured"+e);
            }
            System.out.println("chained exception occured");
        }
    }
}
