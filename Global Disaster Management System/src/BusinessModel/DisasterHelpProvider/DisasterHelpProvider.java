/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.DisasterHelpProvider;
import BusinessModel.WorkQueue.WorkQueue;
/**
 *
 * @author pulkitprakash
 */


public class DisasterHelpProvider 
{
    private String id;
    private String name;
    private WorkQueue workQueue;
    
    private static int count;
    
     public DisasterHelpProvider()
     {
         
        id= "HP"+(++count);
        workQueue=new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
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

