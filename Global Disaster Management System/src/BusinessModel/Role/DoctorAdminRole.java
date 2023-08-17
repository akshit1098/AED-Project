/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.DoctorOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;
//import Business.Organization.DonorOrganization;
import UserInterface.Doctor.DoctorAdminWorkArea;
import UserInterface.EmergencyAssistanceProvider.ManagerWorkArea;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author AkshitSaxena
 */
public class DoctorAdminRole extends Role{

   
     @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DoctorAdminWorkArea(downJPanel,UserAccount,(DoctorOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.DoctorAdminRole.getValue();
}
    
    
}







