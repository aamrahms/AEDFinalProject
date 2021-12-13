package Business;

import Business.Employee.Employee;
import Business.Role.AdvisorRole;
import Business.Role.ChiefOfficerRole;
import Business.Role.DoctorRole;
import Business.Role.OUECCoordinatorRole;
import Business.Role.OUECInvestigatorRole;
import Business.Role.PoliceOfficerRole;
import Business.Role.PresidentRole;
import Business.Role.ReceptionistRole;
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
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("chief", "chief", "chief", employee, new ChiefOfficerRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("aamrah", "aamrah", "aamrah", employee, new StudentRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("fian", "fian", "fian", employee, new StudentRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("NeuAdmin", "sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("olson", "olson", "olson", employee, new PoliceOfficerRole());
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("mary", "mary", "mary", employee, new PoliceOfficerRole());
           UserAccount ua7 = system.getUserAccountDirectory().createUserAccount("coor", "coor", "coor", employee, new OUECCoordinatorRole());
//        UserAccount ua8 = system.getUserAccountDirectory().createUserAccount("susan", "susan", "susan", employee, new OUECInvestigatorRole()); 
        Employee e = system.getEmployeeDirectory().createEmployee("president", "president", "president", "saint germain", "1234567890", "president@gmail.com", "1234567890");
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("president", "president", "president", e, new PresidentRole());
//     
        system.getStudentDirectory().createStudent("fifi", "fifi", "fifi", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872", ua3);
        system.getStudentDirectory().createStudent("aamrah", "aamrah", "aamrah", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872", ua2);
        system.getPoliceDirectory().createPoliceOfficer("olson", "olson", "olson", "stephen street", "1234567890", "olson@gmail.com", "001234567");
        system.getPoliceDirectory().createPoliceOfficer("mary", "mary", "mary", "stephen street", "1234567890", "mary@gmail.com", "001234567");
        return system;
    }
    
}
