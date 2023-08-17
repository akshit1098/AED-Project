/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import java.util.ArrayList;

/**
 *
 * @author AkshitSaxena
 */
public class EncounterHistory {
    
    private ArrayList<VitalSigns> vital_history;
    
    public EncounterHistory(){
        this.vital_history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return vital_history;
    }

    public void setHistory(ArrayList<VitalSigns> vital_history) {
        this.vital_history = vital_history;
    }
    
    public VitalSigns addNewDetails(){
        //Instantiate an object of Data Type EmployeeDetails
        VitalSigns newDetails = new VitalSigns(); 
        vital_history.add(newDetails);
        return newDetails;
       
    }

    
    public void deleteEncounter(VitalSigns enc) {
        vital_history.remove(enc);
        
    }
    
    
}
