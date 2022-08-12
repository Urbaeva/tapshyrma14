package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;
    }

    void singing(){
        System.out.println("Singer is singing");
    }

    void playGitar(){
        System.out.println("Singer is playing gitar");
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                "} " ;
    }
}
