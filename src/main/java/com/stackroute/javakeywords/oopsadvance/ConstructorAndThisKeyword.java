package com.stackroute.javakeywords.oopsadvance;

public class ConstructorAndThisKeyword {

    private String name;
    private int age;
    private int id;
//declare null constructor
    public ConstructorAndThisKeyword() {
    }
//declare parameterized constructor
    public ConstructorAndThisKeyword(String name, int age, int id) {
        //use of this keyword
        this.name = name;
        this.age = age;
        this.id = id;
    }
//Abstraction oops concept:
// creating the getter-setter method to set the value and return the value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
