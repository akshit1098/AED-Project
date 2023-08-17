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

public class DonorDirectory 
{
    private ArrayList<BusinessModel.Supplier.Donor> donorList;

    public DonorDirectory()
    {
        donorList = new ArrayList<>();
        
    }

    public ArrayList<BusinessModel.Supplier.Donor> getDonorList() 
    {
        return donorList;
    }

    public void setDonorList(ArrayList<BusinessModel.Supplier.Donor> donorList) 
    {
        this.donorList = donorList;
    }
    
    public BusinessModel.Supplier.Donor addDonor()
    {
    
        BusinessModel.Supplier.Donor don = new BusinessModel.Supplier.Donor();
        donorList.add(don);
        return don;
    }
    
    public void removeDonor(BusinessModel.Supplier.Donor don){
        donorList.remove(don);
    }
}






