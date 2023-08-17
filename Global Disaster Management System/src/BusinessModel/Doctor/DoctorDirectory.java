/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Doctor;

import BusinessModel.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author AkshitSaxena
 */
public class DoctorDirectory {
    private ArrayList<Doctor> docdirectory;

    public DoctorDirectory() 
    {
    docdirectory= new ArrayList<>();
    }

    public ArrayList<Doctor> getDocdirectory()
    {
        return docdirectory;
    }

    public void setDocdirectory(ArrayList<Doctor> docdirectory) 
    {
        this.docdirectory = docdirectory;
    }
    
    public Doctor addDoc()
    {
        Doctor d =new Doctor();
        docdirectory.add(d);
        return d;
    }
    
    public void removeDoc(Doctor d)
    {
        docdirectory.remove(d);   
    }
}


