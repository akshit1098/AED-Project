/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.DisasterHelpProvider;

import java.util.ArrayList;

/**
 *
 * @author pulkitprakash
 */

    

public class DisasterHelpProviderDirectory 
{
    
    private ArrayList<DisasterHelpProvider> helpProviderDirectory;

    public DisasterHelpProviderDirectory()
    {
        helpProviderDirectory = new ArrayList<>();
    }

    public ArrayList<DisasterHelpProvider> getHelpProviderDirectory() 
    {
        return helpProviderDirectory;
    }

    public void setHelpProviderDirectory(ArrayList<DisasterHelpProvider> helpProviderDirectory)
    {
        this.helpProviderDirectory = helpProviderDirectory;
    }
    
    
    public DisasterHelpProvider addHelpProvider()
    {
        DisasterHelpProvider hp = new DisasterHelpProvider();
        helpProviderDirectory.add(hp);
        return hp;
    }
    
    public void removeHelpProvider(DisasterHelpProvider hp)
    {
        helpProviderDirectory.remove(hp);
    }
    
}

