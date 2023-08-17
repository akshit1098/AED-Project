/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Role;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.Customer.CustomerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class CustomerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new CustomerWorkArea(downJPanel,account,organization,enterprise,system);
    }
    @Override
    public String toString()
    {
        return Role.RoleType.CustomerRole.getValue();
    }
}
