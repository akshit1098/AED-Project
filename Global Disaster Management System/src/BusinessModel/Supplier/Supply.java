/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Supplier;
import BusinessModel.WorkQueue.WorkQueue;
/**
 *
 * @author AkshitSaxena
 */
public class Supply {
    
    
    private String suppId;
    private static int supplyCount=0;
    private int quantity;
    private String reqType;
    private String req;
    
    
    public Supply(){
        suppId="Supply"+(+supplyCount);
     
        
    }

    public String getSuppId() {
        return suppId;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId;
    }

    public static int getSupplyCount() {
        return supplyCount;
    }

    public static void setSupplyCount(int supplyCount) {
        Supply.supplyCount = supplyCount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
    
     
    @Override
    public String toString(){
        return getReqType();
    }
   
   
    
}
