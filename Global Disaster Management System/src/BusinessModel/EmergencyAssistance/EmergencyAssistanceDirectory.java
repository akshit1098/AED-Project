/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.EmergencyAssistance;

import java.util.ArrayList;

/**
 *
 * @author HM
 */

public class EmergencyAssistanceDirectory 
{
    private ArrayList<EmergencyAssistance> disasterAssistancedirectory;

    public EmergencyAssistanceDirectory() 
    {
    disasterAssistancedirectory= new ArrayList<>();
    }

    public ArrayList<EmergencyAssistance> getDisasterAssistancedirectory()
    {
        return disasterAssistancedirectory;
    }

    public void setDisasterAssistancedirectory(ArrayList<EmergencyAssistance> ngodirectory) 
    {
        this.disasterAssistancedirectory = ngodirectory;
    }
    
    public EmergencyAssistance addNGO()
    {
        EmergencyAssistance n =new EmergencyAssistance();
        disasterAssistancedirectory.add(n);
        return n;
    }
    
    public void removeNGO(EmergencyAssistance n)
    {
        disasterAssistancedirectory.remove(n);   
    }
}




