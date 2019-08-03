package com.stackroute.javakeywords.exception;

public class CustomException extends InvalidInputException{


        static void validate(int amount)throws invalidInputException {
            if(amount<5000)
                throw new invalidInputException("give valid input");
            else
                System.out.println("enter your desired input");
        }

        public static void main(String args[]){
            try{
                validate(1000);
            }catch(Exception m){System.out.println("Exception occured: "+m);}

            System.out.println("class completed");
        }
    }

