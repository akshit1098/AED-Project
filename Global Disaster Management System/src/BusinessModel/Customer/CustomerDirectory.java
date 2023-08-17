/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Customer;

import java.util.ArrayList;

/**
 *
 * @author pulkitprakash
 */
public class CustomerDirectory
{
    private ArrayList<Customer> customerDirectory;

    public CustomerDirectory()
    {
        customerDirectory = new ArrayList<>();
        
    }

    public ArrayList<Customer> getCustomerDirectory() 
    {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) 
    {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(String name)
    {
        Customer c = new Customer(name);
        customerDirectory.add(c);
        return c;
    }
    
    public void removeCustomer(Customer c)
    {
        customerDirectory.remove(c);
    }
    
}

