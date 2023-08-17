/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Supplier;


import java.util.ArrayList;

/**
 *
 * @author AkshitSaxena
 */

public class SupplierDirectory 
{
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory()
    {
        supplierList= new ArrayList<>();
        
    }

    public ArrayList<Supplier> getSupplierList() 
    {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) 
    {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier()
    {
    
        Supplier sup = new Supplier();
        supplierList.add(sup);
        return sup;
    }
    
    public void removeSupplier(Supplier sup){
        supplierList.remove(sup);
    }
}




