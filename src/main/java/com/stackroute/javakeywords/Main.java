package com.stackroute.javakeywords;

import com.stackroute.javakeywords.oopsconcept.Tata;
import com.stackroute.javakeywords.oopsconcept.TataZest;

public class Main {
    public static void main(String[] args) {
        //Creating object of chile class
        TataZest tataZest = new TataZest();
        //calling parent class methods via child class
        tataZest.start();
        tataZest.stop();
        //calling child class method
        tataZest.carDetails();
    }
}
