/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisations;

import Business.Complaint.Complaint;
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
    private ArrayList <Complaint> myComplaints;

    public Student(String name, String username, String password, String address, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;        
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
        return myComplaints;
    }

    public void setMyComplaints(ArrayList<Complaint> myComplaints) {
        this.myComplaints = myComplaints;
    }
       
    
}