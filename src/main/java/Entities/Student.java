package Entities;

import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author James
 */


//  (Name, Age, DOB, ID, username etc)
public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private String usrname;
    
    
    static int globId = 1000;
    private int id;
    
    public Student(String name, int age, DateTime dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = Student.globId++;
                       
    }
    
    @Override
    public String toString(){
        String str = "Student Name: " + this.name + " Age: " + this.age + " Date of birth: " + this.dob + " Student ID: " + this.id;
        return str;
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

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
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
