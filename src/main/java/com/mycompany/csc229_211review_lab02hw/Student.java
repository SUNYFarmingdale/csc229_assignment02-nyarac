package com.mycompany.csc229_211review_lab02hw;

public class Student extends Person { //extends is the keyword used to make student a child class of person
    
    private double GPA; //GPA initialized here
    
    private String address;
    
    public Student(String name, short age) { //new constructor
        super(name, age);
        address = "";
    }
    
    public Student(String name, short age, double GPA, String address) {

        super(name, age);

        this.GPA = GPA;

        this.address = address;

    }

   
    @Override 
    
   public String getAddress() { //overriding the setter and getter for address so it can be used here
       return address;
   }
    @Override
    public void setAddress(String Address) {
        this.address = address; 
    }
   
    public double getGPA () { //getter for GPA
        return GPA;
    }
    public void setGPA(double GPA) { //setter for GPA
        this.GPA = GPA;
    }
    
    @Override 
    public String toString() { //the toString method needed to print the correct information for Student
        return getName() + " is " + getAge() + " years old and has a " + getGPA() + " GPA" + " and lives in " + getAddress(); 
    }
    
} 