package com.example.listviewdemo;

public class Student {
    private String Fname = " ";
    private String Lname = " ";
    private String major = " ";

    public Student(String first, String last, String maj){
        Fname = first;
        Lname = last;
        major = maj;
    }
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public String getmajor(){
        return major;
    }
    public void setFname(String newFname){
        Fname = newFname;
    }
    public void setLname(String newLname){
        Fname = newLname;
    }
    public void setmajor(String newmajor){
        Fname = newmajor;
    }
}
