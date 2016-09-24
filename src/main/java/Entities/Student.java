package Entities;

import java.util.Date;

/**
 *
 * @author James
 */



//  (Name, Age, DOB, ID, username etc)
public class Student {
    private String name;
    private int age;
    private Date dob;
    private String usrname;
    
    
    static int globId = 1000;
    private int id;
    
    public Student(String name, int age, Date dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = this.globId++;
                       
    }

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUsrname() {
        this.usrname = this.name + this.age;
        return this.usrname;
    }


    public int getId() {
        return id;
    }
    
}
