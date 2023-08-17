/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Employee;

/**
 *
 * @author HM
 */

public class Employee 
{
 
    private String empname;
    private int id;
    private static int count=1;
    
    public Employee()
    {
        id=count;
        count++;
    }

    public String getEmpname() 
    {
        return empname;
    }

    public void setEmpname(String empname)
    {
        this.empname = empname;
    }

   

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    @Override
    public String toString()
    {
        return empname;
    }
    
}




