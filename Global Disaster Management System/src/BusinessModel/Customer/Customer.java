/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Customer;

import BusinessModel.WorkQueue.WorkQueue;

/**
 *
 * @author pulkitprakash
 */
public class Customer 
{
    private String id;
    private String name;
    private WorkQueue workqueue;
    
    private static int count;
    
     public Customer(String name)
     {
        this.name = name;
        this.id= "HS"+(++count);
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