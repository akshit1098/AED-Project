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
public class SupplyDirectory {
    
     
    private ArrayList<Supply> suppList;

    public SupplyDirectory() {
        suppList=new ArrayList<>();
        
    }

    public ArrayList<Supply> getSupplyList() {
        return suppList;
    }

    public void setSupplyList(ArrayList<Supply> supplyList) {
        this.suppList = supplyList;
    }
    
    public Supply addSupply(){
        Supply s = new Supply();
        suppList.add(s);
        return s;
    }
    
    public void removeSupply(Supply supply){
        suppList.remove(supply);
    }
   
    
    
}
