/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Organisations.Student;

/**
 *
 * @author aamrah
 */
public class NormalComplaint extends Complaint{
    private String dateOfIncident;
    private String time;
    private Student accusedStudent;
    private Student victim;

    public NormalComplaint(String typeOfComplaint, Student student) {
        super(typeOfComplaint,student);
    }
    
}
