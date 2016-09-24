/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author James
 */
public class Programme {
    
    private String courseName;
    private ArrayList<Module> modules = new ArrayList<>();
    private DateTime start;
    private DateTime end;

    public Programme(String name, DateTime start, DateTime end){
        this.courseName = name;
        this.start = start;
        this.end = end;
        
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
    
    public void addModule(Module m){
        modules.add(m);
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
