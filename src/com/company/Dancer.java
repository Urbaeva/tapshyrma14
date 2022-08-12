package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName){
        super(name, designation);
        this.groupName = groupName;
    }

    void dancing(){
        System.out.println("Dancer is dancing");
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", groupName='" + groupName + '\'' +
                "} " ;
    }
}
