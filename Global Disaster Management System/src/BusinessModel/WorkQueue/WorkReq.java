/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.WorkQueue;

/**
 *
 * @author HM
 */


import BusinessModel.DisasterHelpProvider.DisasterHelpProvider;
//import BusinessModel.FundRaiser.FundRaiser;
import BusinessModel.Supplier.Supplier;
import BusinessModel.Supplier.Supply;
import BusinessModel.EmergencyAssistance.EmergencyAssistance;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.Volunteer.Volunteer;
import java.util.ArrayList;
import java.util.Date;


public class WorkReq {
 
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date dateOfRequest;
    private Date dateOfResolving;
    private DisasterHelpProvider helpProvider;
//    private FundRaiser helpSeeker;
    private EmergencyAssistance emergencyassistance;
    private Supplier supplier;
    private Supply supply;
    private ArrayList<Volunteer> volunteerList;
    
    public WorkReq(){
        this.volunteerList = new ArrayList<Volunteer>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDateOfResolving() {
        return dateOfResolving;
    }

    public void setDateOfResolving(Date dateOfResolving) {
        this.dateOfResolving = dateOfResolving;
    }

    public DisasterHelpProvider getHelpProvider() {
        return helpProvider;
    }

    public void setHelpProvider(DisasterHelpProvider helpProvider) {
        this.helpProvider = helpProvider;
    }

//    public FundRaiser getHelpSeeker() {
//        return helpSeeker;
//    }
//
//    public void setHelpSeeker(FundRaiser helpSeeker) {
//        this.helpSeeker = helpSeeker;
//    }

    public EmergencyAssistance getEmergencyassistance() {
        return emergencyassistance;
    }

    public void setEmergencyassistance(EmergencyAssistance emergencyassistance) {
        this.emergencyassistance = emergencyassistance;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    @Override
    public String toString(){
        return status;
    }
    
}
