/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;

import BusinessModel.Role.EmergencyAssistanceEnterpriseAdminRole;
import BusinessModel.Role.EmergencyAssistanceProviderRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author HM
 */
public class EmergencyAssistanceEnterprise extends Enterprise {

  public EmergencyAssistanceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.EmergencyAssistance);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new EmergencyAssistanceProviderRole());
        //role.add(new VolunteerRole());
        return role;
    }

    
    
}



