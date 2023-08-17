/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.Role.Role;
import BusinessModel.Role.DonorRole;
import BusinessModel.Supplier.Donor;
import BusinessModel.Supplier.DonorDirectory;
import java.util.HashSet;

/**
 *
 * @author AkshitSaxena
 */

    

public class DonorOrganization extends Organization {
    DonorDirectory donorList;

    public DonorOrganization(String name) {
        super(Organization.Type.Donor.getValue());
        donorList = new DonorDirectory();
    }

    public DonorDirectory getDonorList() {
        return donorList;
    }

    public void setDonorList(DonorDirectory donorList) {
        this.donorList = donorList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DonorRole());
       return role;
    }
    
}






