package com.company;



public class Student implements Combine{
    public String name;
    protected int dob;
    protected String gender;
    protected int studentId;
    protected int admissionDate;

    Student(String name, int dob, String gender, int studentId, int admissionDate){

        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.studentId=studentId;
        this.admissionDate=admissionDate;

    }
    public void studentDetails(){

        System.out.println("This is the Students Details :");
        System.out.println("Student Id :"+ name);
        System.out.println("Student Id :"+ dob);
        System.out.println("Student Id :"+ gender);
        System.out.println("Student Id :"+studentId);
        System.out.println( "Student Admission Date :"+admissionDate);
    }

    public void details(){
        studentDetails();


    }
}
