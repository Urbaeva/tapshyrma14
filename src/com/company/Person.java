package com.company;

public class Person {
    public String name;
    public String designation;

    public Person(String name, String designation){
        this.name = name;
        this.designation = designation;
    }

    void learn(){
        System.out.println("The person  can learn anything.");
    }
    void walk(){
        System.out.println("The person can walk.");
    }
    void eat(){
        System.out.println("The person can eat.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
