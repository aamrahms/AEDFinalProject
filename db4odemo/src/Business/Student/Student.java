/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import Business.Complaint.Complaint;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */

    public class Student {
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private String email;
    private String neuid;
    UserAccount userAccount;
    private ArrayList <Complaint> myComplaints;

    public Student(String name, String username, String password, String address, String phone, String email, String neuid, UserAccount userAccount) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.neuid = neuid;
        this.userAccount=userAccount;
        this.myComplaints= new ArrayList<Complaint>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Complaint> getMyComplaints() {
        if(this.myComplaints==null)
            return this.myComplaints= new ArrayList<Complaint>();
        return myComplaints;
    }

    public void setMyComplaints(ArrayList<Complaint> myComplaints) {
        this.myComplaints = myComplaints;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNeuid() {
        return neuid;
    }

    public void setNeuid(String neuid) {
        this.neuid = neuid;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    public Complaint getMyComplaint(String id){
         for (Complaint c: myComplaints)
         {
             if(c.getComplaintID().equals(id))
             {
                 return c;
             }
         }
         return null;   
     }
       
    
    @Override
    public String toString()
    {
        return name;
    }
}
