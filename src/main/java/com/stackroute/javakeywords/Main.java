package com.stackroute.javakeywords;

import com.stackroute.javakeywords.oopsadvance.ConstructorAndThisKeyword;
import com.stackroute.javakeywords.oopsadvance.MyInterface;
import com.stackroute.javakeywords.oopsadvance.NestedClassExample;

import com.stackroute.javakeywords.oopsconcept.TataZest;

public class Main {
    public static void main(String[] args) {
        //Creating object of chile class
        TataZest tataZest = new TataZest();
        //calling constructorAndThisKeyword class methods via child class
        tataZest.start();
        tataZest.stop();
        //calling child class method
        tataZest.carDetails();
        //implementation of ConstructorAndThisKeyword.java class
        ConstructorAndThisKeyword constructorAndThisKeyword =new ConstructorAndThisKeyword();
        //set the values to constructorAndThisKeyword class using setter method
        constructorAndThisKeyword.setName("samaresh");
        constructorAndThisKeyword.setAge(50);
        constructorAndThisKeyword.setId(10);
        //accessing the values using the getter method
        System.out.println(constructorAndThisKeyword.getName()+"\n"+ constructorAndThisKeyword.getAge()+"\n"+ constructorAndThisKeyword.getId());
        // accessing a static nested class
        NestedClassExample.InnerClass1 nestedObject = new NestedClassExample.InnerClass1();
        nestedObject.display();
        //creating object of NestedClassExample
        NestedClassExample nestedClassExample =new NestedClassExample();
        NestedClassExample.InnerClass2 myInner = nestedClassExample.new InnerClass2();
        //implementing nested inner class
        myInner.print();
        NestedClassExample.InnerClass2 innerClass2=nestedClassExample.new InnerClass2();
        innerClass2.print();
        //implementing of lambda expression

//        new Thread(()->{
//            System.out.println("Lambda");
//            System.out.println("Another Lambda");
//            System.out.println("Lambda2");
//        }
//        ).start();
        MyInterface fobj = ()->System.out.println("this is lambda expression");
        // This calls above lambda expression and prints 10.
        fobj.print();




    }
}
