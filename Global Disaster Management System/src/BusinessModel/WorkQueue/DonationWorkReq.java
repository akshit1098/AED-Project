/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.WorkQueue;

import BusinessModel.UserAccount.UserAccount;

/**
 *
 * @author AkshitSaxena
 */
public class DonationWorkReq extends WorkReq {
    
    private String requestType;
    private String requirements;
    private int quantity;
    private boolean add;
    private UserAccount send;
  //  private String status;

    public UserAccount getSend() {
        return send;
    }

    public void setSend(UserAccount send) {
        this.send = send;
    }


   

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
}





