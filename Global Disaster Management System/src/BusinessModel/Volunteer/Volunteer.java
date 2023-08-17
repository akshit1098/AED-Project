/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Volunteer;
import BusinessModel.WorkQueue.WorkQueue;
/**
 *
 * @author pulkitprakash
 */

public class Volunteer 
{
    private String volunteerName;
    private String id;
    private static int count=0;
    private WorkQueue workqueue;
    public Volunteer() 
    {
        id="Vol"+(++count);
        workqueue= new WorkQueue();
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    
    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return volunteerName;
    
    }
    
}






