/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;

import BusinessModel.EcoSystem;

import BusinessModel.UserAccount.UserAccount;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author HM
 */
public abstract class Role {

    public enum RoleType {
        SystemAdministratorRole("SystemAdministratorRole"),
        DisasterHelpProviderAdminRole("DisasterHelpProviderAdminRole"),
        DisasterHelpProviderRole("DisasterHelpProviderRole"),
        EnterpriseAdminRole("EnterpriseAdminRole"),
        HospitalAdmin("HospitalAdmin"),
        DisasterManagementAdminRole("DisasterManagementAdminRole"),
        EmergencyAssistanceAdminRole("EmergencyAssistanceAdminRole"),
        SupplierAdminRole("SupplierAdminRole"),
        SupplierManagerRole("SupplierManagerRole"),
        SupplierRole("SupplierRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        DonorRole("DonorRole"),
        DonorAdminRole("DonorAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        DoctorUserRole("DoctorUserRole"),
        HospitalAdminRole("HospitalAdminRole"),
        CustomerRole("CustomerRole"),
        DisasterManagementEnterpriseAdminRole("DisasterManagementEnterpriseAdminRole"),
        DisasterHelpProviderOrganisationAdminRole("DisasterHelpProviderOrganizationAdminRole"),
        EmergencyAssistanceEnterpriseAdminRole("EmergencyAssistanceEnterpriseAdminRole"),
        EmergencyAssistanceProviderRole("EmergencyAssistanceProviderRole"),
        DonorOrganisationAdminRole("DonorOrganisationAdminRole"),
        EmergencyAssistanceOrganisationAdminRole("EmergencyAssistanceOrganisationAdminRole"),
        SupplierOrganisationAdminRole("SupplierOrganisationAdminRole"),
        SupplyChainManagementEnterpriseAdminRole("SupplyChainManagementEnterpriseAdminRole"),
        FundRaisingOrganisationAdminRole("FundRaisingOrganisationAdminRole"),
        FundRaiserRole("FundRaiserRole");
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system);

}
