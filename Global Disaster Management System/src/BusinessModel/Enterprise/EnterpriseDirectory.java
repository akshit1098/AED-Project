/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author HM
 */


public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.DisasterManagement){
            enterprise = new DisasterManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.SupplyChainManagement){
            enterprise= new SupplyChainManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.EmergencyAssistance){
            enterprise= new EmergencyAssistanceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.HospitalAssociation){
            enterprise= new HospitalAssociationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         
        return enterprise;
        
    }
   
    
}






