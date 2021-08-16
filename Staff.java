package com.company;

public class Staff implements Combine{
    protected String name;
    protected String dob;
    protected String gender;
    protected int staffId;
    protected String jobTitle;

    Staff(String name,String dob,String gender,int staffId,String jobTitle) {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.jobTitle = jobTitle;
        this.staffId = staffId;
    }

    public void staffDetails(){
        System.out.println("This the Staff Details :");
        System.out.println("Staff name :"+name);
        System.out.println("Staff Date of birth :"+dob);
        System.out.println("Staff gender :"+gender);
        System.out.println("Staff Id :"+staffId);
        System.out.println("Staff Job Details :"+jobTitle);

    }
    public void details(){
        staffDetails();

    }

}
