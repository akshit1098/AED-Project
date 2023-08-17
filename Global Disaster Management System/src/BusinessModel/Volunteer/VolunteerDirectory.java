/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author pulkitprakash
 */

public class VolunteerDirectory 
{
    private ArrayList<Volunteer> volunteerList;

    public VolunteerDirectory()
    {
        volunteerList= new ArrayList<>();
        
    }

    public ArrayList<Volunteer> getVolunteerList() 
    {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) 
    {
        this.volunteerList = volunteerList;
    }
    
    public Volunteer addVolunteer()
    {
    
        Volunteer vol = new Volunteer();
        volunteerList.add(vol);
        return vol;
    }
    
    public void removeVolunteer(Volunteer vol){
        volunteerList.remove(vol);
    }
}



