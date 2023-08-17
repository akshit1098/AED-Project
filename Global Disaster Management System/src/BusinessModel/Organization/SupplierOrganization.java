/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.Role.Role;
import BusinessModel.Role.SupplierOrganisationAdminRole;
import BusinessModel.Role.SupplierRole;
import BusinessModel.Supplier.SupplierDirectory;
import java.util.HashSet;

/**
 *
 * @author AkshitSaxena
 */

public class SupplierOrganization extends Organization {
    SupplierDirectory supplierList;

    public SupplierOrganization(String name) {
        super(Organization.Type.Supplier.getValue());
        supplierList = new SupplierDirectory();
    }

    public SupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(SupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SupplierRole());
       return role;
    }
    
}





