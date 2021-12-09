package Business;

import Business.Employee.Employee;
import Business.Role.ChiefOfficerRole;
import Business.Role.StudentRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("NeuAdmin", "sysadmin", "sysadmin", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("Chief","chief", "chief", employee, new ChiefOfficerRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("Aamrah", "aamrah", "aamrah", employee, new StudentRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("NeuAdmin", "sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
