/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Role.DoctorUserRole;
import BusinessModel.Role.HospitalAdminRole;
import BusinessModel.Role.Role;

import java.util.HashSet;

/**
 *
 * @author AkshitSaxena
 */



public class HospitalAssociationEnterprise extends Enterprise 
{
    public HospitalAssociationEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.HospitalAssociation);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new HospitalAdminRole());
        return role;
        
    }
}







