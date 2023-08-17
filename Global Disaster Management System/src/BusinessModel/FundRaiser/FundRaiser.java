/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.FundRaiser;
import BusinessModel.WorkQueue.WorkQueue;

/**
 *
 * @author pulkitprakash
 */

    
public class FundRaiser 
{
    private String id;
    private String name;
    private WorkQueue workqueue;
    
    private static int count;
    
     public FundRaiser()
     {
         
        id= "FR"+(++count);
    }

    public WorkQueue getWorkqueue() 
    {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) 
    {
        this.workqueue = workqueue;
    }
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     @Override
     public String toString(){
         return name;
     }
    
}


