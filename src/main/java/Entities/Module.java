
package Entities;

import java.util.ArrayList;

/**
 *
 * @author James
 */
public class Module {
    
    private String moudleName;
    private String moduleID;

    private ArrayList<Student> students = new ArrayList<>();
    
    public Module(String name, String id){
        this.moudleName = name;
        this.moduleID = id;    
    }
    
    public String getMoudleName() {
        return moudleName;
    }

    public void setMoudleName(String moudleName) {
        this.moudleName = moudleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
