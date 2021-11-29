/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private Customer customer;
    private ArrayList<Customer> customerDir;
    
    //Constructor
    public CustomerDirectory() {    
        this.customerDir = new ArrayList<Customer> ();
    }

    //Check if user exists
    public Customer getCustomer(String username) {
        for(Customer c : customerDir)
        {
            if(c.getUsername().equalsIgnoreCase(username))
            {
                return c;
            }
        }
        return null;
    }
    //creating customer
    public Customer createCustomer(String name, String username, String password, String address, String phone)
    {
        customer=new Customer(name, username, password,address, phone);
        customerDir.add(customer);
        return customer;
    }
    //updating customer profile
    public void updateCustomer(Customer customer,String name, String username, String password, String address, String phone)
    {
        for (Customer c: customerDir)
        {
            if(c.getUsername().equalsIgnoreCase(customer.getUsername()))
            {
                customer.setName(name);
                customer.setUsername(username);
                customer.setPassword(password);
                customer.setAddress(address);
                customer.setPhone(phone);
                break;
            }
        }
    }
    //deleting customer from dir
    public void deleteCustomer(Customer customer){
                customerDir.remove(customer);
        
    }
    //Getters and setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }
    
    
    
}
