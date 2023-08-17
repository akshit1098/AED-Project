/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Supplier;

import BusinessModel.WorkQueue.WorkQueue;

/**
 *
 * @author AkshitSaxena
 */



public class Donor 
{
    private String donorName;
    private String id;
    private static int count=0;
    private WorkQueue workQueue;
    
    public Donor() 
    {
        id="Don"+(++count);
        workQueue= new WorkQueue();
    }

   /* public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }*/

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return donorName;
    
    }
    
}








