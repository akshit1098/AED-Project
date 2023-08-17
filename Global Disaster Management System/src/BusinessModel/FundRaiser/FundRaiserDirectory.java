/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.FundRaiser;


import java.util.ArrayList;

/**
 *
 * @author pulkitprakash
 */


public class FundRaiserDirectory
{
    private ArrayList<FundRaiser> fundraiserDirectory;

    public FundRaiserDirectory()
    {
        fundraiserDirectory = new ArrayList<>();
        
    }

    public ArrayList<FundRaiser> getfundraiserDirectory() 
    {
        return fundraiserDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<FundRaiser> fundraiserDirectory) 
    {
        this.fundraiserDirectory = fundraiserDirectory;
    }
    
    public FundRaiser addHelpSeeker()
    {
        FundRaiser fs = new FundRaiser();
        fundraiserDirectory.add(fs);
        return fs;
    }
    
    public void removeHelpSeeker(FundRaiser fs)
    {
        fundraiserDirectory.remove(fs);
    }
    
}

