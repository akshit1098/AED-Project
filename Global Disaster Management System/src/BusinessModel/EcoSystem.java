/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel;

import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Network.Network;
import BusinessModel.Organization.Organization;
import BusinessModel.Role.Role;
import BusinessModel.Role.SystemAdministratorRole;
import BusinessModel.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author HM
 */
    public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    
    public static EcoSystem getInstance()
    {
     if(business == null)
     {
         business = new EcoSystem();
     }
     return business;
    }
    
    private EcoSystem()
    {
        super(null);
        networkList = new ArrayList<>();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system)
    {
        business = system;
    }
    
    public Network addNetwork()
    {
      Network  network = new Network();
      networkList.add(network);
      return network;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SystemAdministratorRole());
        
        return role;
    }
    
    
    
    
    
    public static boolean checkIfUsernameIsUnique(String username)
    {
        for(Network n : business.getNetworkList())
        {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
            {
                for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                {
                    if(ua.getUsername().equals(username))
                    {
                        return false;
                    }
                }
                
                for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUsername().equals(username))
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    
}
