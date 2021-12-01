/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;




//import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Organisations.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    //private RestaurantDirectory restaurantDirectory;
    private StudentDirectory studentDirectory;

//    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory) {
//
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//    }
    public EcoSystem( StudentDirectory studentDirectory) {

        
        this.studentDirectory = studentDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
    //Added getters and setters
//    public RestaurantDirectory getRestaurantDirectory() {
//        if (restaurantDirectory==null)
//            this.restaurantDirectory= new RestaurantDirectory();
//        return this.restaurantDirectory;
//    }
//
//    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
//        this.restaurantDirectory = restaurantDirectory;
//    }

    public StudentDirectory getStudentDirectory() {
        if(studentDirectory==null)
            this.studentDirectory = new StudentDirectory();
        
        return this.studentDirectory;
        
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
        
    }

   
    
    
}
