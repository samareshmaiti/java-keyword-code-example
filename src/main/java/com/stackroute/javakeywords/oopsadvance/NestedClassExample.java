package com.stackroute.javakeywords.oopsadvance;

//java program example to implement nested class
public class NestedClassExample {
    // instance(non-static) member
    int outerSecondValue1 = 20;
    // private member
    static int outerPrivateNumber = 30;

    // static nested class
   public  static class InnerClass1 {
       public void display() {
            // can access private static member of outer class
            System.out.println("Accessing the private member from first nested class" + outerPrivateNumber);
        }
    }

    //Normal inner class
    public class InnerClass2 {
       public  void print() {
            System.out.println("Acessing instance class variable" + outerSecondValue1);
        }
         class Nested
        {
            public void show()
            {
                print();
            }

        }

   }

}






