package Business;

import Business.Employee.Employee;
import Business.Role.AdvisorRole;
import Business.Role.ChiefOfficerRole;
import Business.Role.DoctorRole;
import Business.Role.PoliceOfficerRole;
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
        /*Employee receptionist = system.getEmployeeDirectory().createEmployee("stella", "stella", "stella", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        Employee doctor1 = system.getEmployeeDirectory().createEmployee("pal", "pal", "pal", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        Employee doctor2 = system.getEmployeeDirectory().createEmployee("supriya", "supriya", "supriya", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        Employee advisor1 = system.getEmployeeDirectory().createEmployee("devi", "devi", "devi", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        Employee advisor2 = system.getEmployeeDirectory().createEmployee("boomi", "boomi", "boomi", "localhost", "1234567890", "Admin@neu.edu", "123456789");
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("stella", "stella", "stella", receptionist, new ReceptionistRole());
        UserAccount ua7 = system.getUserAccountDirectory().createUserAccount("pal", "pal", "pal", doctor1, new DoctorRole());
        UserAccount ua8 = system.getUserAccountDirectory().createUserAccount("supriya", "supriya", "supriya", doctor2, new DoctorRole());
        UserAccount ua9 = system.getUserAccountDirectory().createUserAccount("devi", "devi", "devi", advisor1, new AdvisorRole());
        UserAccount ua10 = system.getUserAccountDirectory().createUserAccount("boomi", "boomi", "boomi", advisor2, new AdvisorRole());
        system.getDoctorDirectory().createDoctor(doctor1);
        system.getDoctorDirectory().createDoctor(doctor2);
        system.getAdvisorDirectory().createAdvisor(advisor1);
        system.getAdvisorDirectory().createAdvisor(advisor2);*/
        system.getStudentDirectory().createStudent("fifi", "fifi", "fifi", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872", ua3);
        system.getStudentDirectory().createStudent("aamrah", "aamrah", "aamrah", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872", ua2);
        system.getPoliceDirectory().createPoliceOfficer("olson", "olson", "olson", "stephen street", "1234567890", "olson@gmail.com", "001234567");
        system.getPoliceDirectory().createPoliceOfficer("mary", "mary", "mary", "stephen street", "1234567890", "mary@gmail.com", "001234567");
//      
//system.getStudentDirectory().createStudent("vignesh", "vignesh", "vignesh", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872");
//      system.getStudentDirectory().createStudent("vignesh", "vignesh", "vignesh", "2 Wiggles", "9819802928", "fifi29@gmail.com", "001991872");
//     
        return system;
    }
    
}
