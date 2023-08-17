/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.FundRaiser.FundRaiserDirectory;
import BusinessModel.Role.FundRaiserRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author pulkitprakash
 */

public class FundRaisingOrganization extends Organization{
   FundRaiserDirectory fundraiserlist;
    public FundRaisingOrganization()
    {
        super(Organization.Type.FundRaising.getValue());
        fundraiserlist=new FundRaiserDirectory();
    }

    public FundRaiserDirectory getfundraiserlist() {
        return fundraiserlist;
    }

    public void setfundraiserlist(FundRaiserDirectory fundraiserlist) {
        this.fundraiserlist = fundraiserlist;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new FundRaiserRole());
        return role;
        
    }
    
}





