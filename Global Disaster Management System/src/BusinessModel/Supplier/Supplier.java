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


public class Supplier 
{
    private String supplierName;
    private String id;
    private static int count=0;
    private WorkQueue workqueue;
    private SupplyDirectory supplyDirectory;
    private Supply supply;
    public Supplier() 
    {
        id="Sup"+(++count);
        workqueue= new WorkQueue();
        supplyDirectory = new SupplyDirectory();
        supply = new Supply();
    }

    public SupplyDirectory getSupplyDirectory() {
        return supplyDirectory;
    }

    public void setSupplyDirectory(SupplyDirectory supplyDirectory) {
        this.supplyDirectory = supplyDirectory;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }
    
    

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return supplierName;
    
    }
    
}







