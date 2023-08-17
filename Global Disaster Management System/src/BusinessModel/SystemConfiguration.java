/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel;



import BusinessModel.Employee.Employee;
import BusinessModel.Role.SystemAdministratorRole;
import BusinessModel.UserAccount.UserAccount;
/**
 *
 * @author HM
 */
public class SystemConfiguration {
     public static EcoSystem configure(){
   EcoSystem system= EcoSystem.getInstance();
   
   Employee employee= system.getEmployeeDirectory().createEmployee("SYSTEM ADMIN");
   UserAccount ua= system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdministratorRole());
    
    return system;
    }
    
}
