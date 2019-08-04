package com.stackroute.javakeywords.exception;

public class CustomException extends InsufficientBalanceException {

//implementing the custom exception
        static void validate(int amount)throws LowBalanceException {
            if(amount<5000)
                throw new LowBalanceException("Your account does not have sufficient balance");
            else
                System.out.println("enter your desired amount");
        }

        public static void main(String args[]){
            try{
                //use of the validate() method to throw the exception
                validate(1000);
            }catch(Exception m){System.out.println("Exception occured: "+m);}
            finally
            {
                System.out.println("class completed");
            }

        }
    }

