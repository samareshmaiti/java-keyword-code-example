package com.stackroute.javakeywords.oopsconcept;

//creating a class and implementing the parent class
public class TataZest extends Tata {

    private int carPrice;
    private String color;
    private String carNumber;

    //create a method in child class
    public void carDetails() {
        carPrice = 500000;
        carNumber = "abc1234";
        color = "blue";
        System.out.println("Details of the car as follow:\t" + "Price of the car\t" + carPrice + "Color of the car\t" + color + "Car number is\t" + carNumber);
    }
}
