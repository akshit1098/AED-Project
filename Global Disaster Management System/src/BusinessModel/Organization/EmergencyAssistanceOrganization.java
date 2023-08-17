/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.EmergencyAssistance.EmergencyAssistanceDirectory;
import BusinessModel.Role.EmergencyAssistanceEnterpriseAdminRole;
import BusinessModel.Role.EmergencyAssistanceProviderRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author HM
 */

public class EmergencyAssistanceOrganization extends Organization {
   
    EmergencyAssistanceDirectory disasterassistancelist;
    
    public EmergencyAssistanceOrganization()
    {
        super(Organization.Type.EmergencyAssistance.getValue());
        disasterassistancelist=new EmergencyAssistanceDirectory();
    }

    public EmergencyAssistanceDirectory getDisasterAssistancelist() {
        return disasterassistancelist;
    }

    public void setDisasterAssistancelist(EmergencyAssistanceDirectory ngolist) {
        this.disasterassistancelist = ngolist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new EmergencyAssistanceProviderRole());
       return role;
       
    }   
}




