/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Role.SupplierRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author AkshitSaxena
 */

public class SupplyChainManagementEnterprise extends Enterprise 
{
    public SupplyChainManagementEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.SupplyChainManagement);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierRole();
        return role;
        
    }
}






