
package Main;

import Entities.Student;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author James
 */
public class Main{
    
    public static void main(String[] args){
        
        Student student;
        Date date = new Date();
        ArrayList<Student> students = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            date = new Date();
            student = new Student("james", 10, date);
            students.add(student);
        }
        
        for(Student s : students){
            System.out.println("student: " + s.getUsrname()+ " and ID: " + s.getId());
        }
    }
}
