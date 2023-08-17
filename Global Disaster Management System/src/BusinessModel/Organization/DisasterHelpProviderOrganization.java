/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.DisasterHelpProvider.DisasterHelpProviderDirectory;
import BusinessModel.Role.DisasterHelpProviderRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author pulkitprakash
 */
public class DisasterHelpProviderOrganization extends Organization  
{
    
    DisasterHelpProviderDirectory disasterhelpproviderlist;
    
    public DisasterHelpProviderOrganization()
    {
        super(Organization.Type.DisasterHelpProvider.getValue());
        disasterhelpproviderlist = new DisasterHelpProviderDirectory();
    }

    public DisasterHelpProviderDirectory getHelpproviderlist() {
        return disasterhelpproviderlist;
    }

    public void setHelpproviderlist(DisasterHelpProviderDirectory helpproviderlist) 
    {
        this.disasterhelpproviderlist = helpproviderlist;
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new DisasterHelpProviderRole());
       return role;
       
    }
    
    
}








