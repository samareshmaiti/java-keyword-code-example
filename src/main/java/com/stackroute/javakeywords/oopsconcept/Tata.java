package com.stackroute.javakeywords.oopsconcept;

//creating a class and implementing interface
public class Tata implements CarInterface {
    //implementation of interface methods
    @Override
    public String start() {
        System.out.println("Engine of Tata has started");
        return null;
    }

    @Override
    public String stop() {
        System.out.println("Engine of Tata has stopped");
        return null;
    }
}

