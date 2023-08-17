/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;

import BusinessModel.Doctor.DoctorDirectory;
import BusinessModel.Role.DoctorAdminRole;
import BusinessModel.Role.DoctorUserRole;
import BusinessModel.Role.EmergencyAssistanceProviderRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author AkshitSaxena
 */
public class DoctorOrganization extends Organization{
     DoctorDirectory doctorList;
    
    public DoctorOrganization(String name)
    {
        super(Organization.Type.DoctorsAssociation.getValue());
        doctorList=new DoctorDirectory();
    }

    

   

    public DoctorDirectory getDoclist() {
        return doctorList;
    }

    public void setDoclist(DoctorDirectory doclist) {
        this.doctorList = doclist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new DoctorAdminRole());
       return role;
       
    }   
}




