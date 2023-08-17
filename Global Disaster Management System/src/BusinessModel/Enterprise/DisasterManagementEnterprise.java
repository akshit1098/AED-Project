/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.Role.DisasterHelpProviderOrganisationAdminRole;

import BusinessModel.Role.DisasterManagementEnterpriseAdminRole;
import BusinessModel.Role.FundRaisingOrganisationAdminRole;
import BusinessModel.Role.Role;
import BusinessModel.Role.VolunteerOrganisationAdminRole;

import java.util.HashSet;

/**
 *
 * @author pulkitprakash
 */

public class DisasterManagementEnterprise extends Enterprise
{
    public DisasterManagementEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.DisasterManagement);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
      
        role.add(new DisasterHelpProviderOrganisationAdminRole());
              
        role.add(new FundRaisingOrganisationAdminRole());
        
        role.add(new VolunteerOrganisationAdminRole());
       
        return role;
        
    }
}












