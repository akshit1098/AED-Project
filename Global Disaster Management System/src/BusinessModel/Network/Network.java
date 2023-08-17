/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Network;
import BusinessModel.Enterprise.EnterpriseDirectory;

/**
 *
 * @author HM
 */


public class Network 
{
    
    private String networkname;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network()
    {
     enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() 
    {
        return enterpriseDirectory;
    }

    public String getNetworkname() {
        return networkname;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname;
    }


    
    @Override
    public String toString()
    {
        return networkname;
    }
}


