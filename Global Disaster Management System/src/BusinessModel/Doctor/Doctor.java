/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Doctor;

/**
 *
 * @author AkshitSaxena
 * 
 */
public class Doctor {
    private String DocName;
    private String docid;
    private static int count;
    
    public Doctor() {
        
        docid="ORG"+(++count);
        
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }
     @Override
    public String toString(){
        
        return DocName;
    }
}


