/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Donor;


import java.util.ArrayList;

/**
 *
 * @author AkshitSaxena
 */

public class DonorDirectory 
{
    private ArrayList<Donor> donorList;

    public DonorDirectory()
    {
        donorList = new ArrayList<>();
        
    }

    public ArrayList<Donor> getDonorList() 
    {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) 
    {
        this.donorList = donorList;
    }
    
    public Donor addDonor()
    {
    
        Donor don = new Donor();
        donorList.add(don);
        return don;
    }
    
    public void removeDonor(Donor don){
        donorList.remove(don);
    }
}





