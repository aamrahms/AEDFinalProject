/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.NUPD;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.Logic.NUPD.PoliceOfficer;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fianrodrigues
 */
public class ThreatsOrStalkingStatusJPanel extends javax.swing.JPanel 
{

    /** Creates new form ThreatsOrStalkingJPanel */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Complaint complaint,currentComplaint, mainComplaint;
    PoliceOfficer police;
    Student accused;
    int accusedIndex;
    boolean notifiedChief=false;
    boolean suspectApprehended=false;
    public ThreatsOrStalkingStatusJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system,PoliceOfficer police, Complaint complaint)
    {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.complaint=complaint;
        this.police=police;
        
        ArrayList<Student> studentList = system.getStudentDirectory().getStudentDir();
        police.setComplaint(complaint);
        DefaultComboBoxModel model2= new DefaultComboBoxModel(studentList.toArray());
        cmbAccusedName.setModel( model2);
        accusedIndex = 0;
        accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);
        populateFields();
    }

 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcceptCase = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnOnTheWay = new javax.swing.JButton();
        btnRedEyeNotified = new javax.swing.JButton();
        btnTaskCompleted = new javax.swing.JButton();
        btnSuspectInCustody = new javax.swing.JButton();
        btnSceneReached = new javax.swing.JButton();
        lblVictimStudent = new javax.swing.JLabel();
        lblAccusedStudent = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtComplaintID = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtVictimName = new javax.swing.JTextField();
        txtAccused = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        lblComplaintID = new javax.swing.JLabel();
        cmbAccusedName = new javax.swing.JComboBox<>();

        btnAcceptCase.setText("Accept Case");
        btnAcceptCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptCaseActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("STATUS UPDATE FOR THREATS OR STALKING");

        btnOnTheWay.setText("On The Way");
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnRedEyeNotified.setText("Red Eye Notified");
        btnRedEyeNotified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedEyeNotifiedActionPerformed(evt);
            }
        });

        btnTaskCompleted.setText("Task Completed");
        btnTaskCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskCompletedActionPerformed(evt);
            }
        });

        btnSuspectInCustody.setText("Suspect In Custody");
        btnSuspectInCustody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspectInCustodyActionPerformed(evt);
            }
        });

        btnSceneReached.setText("Scene Reached");
        btnSceneReached.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSceneReachedActionPerformed(evt);
            }
        });

        lblVictimStudent.setText("Victim Name:");

        lblAccusedStudent.setText("Accused:");

        lblStatus.setText("Status:");

        lblType.setText("Type:");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtVictimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVictimNameActionPerformed(evt);
            }
        });

        txtAccused.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccusedActionPerformed(evt);
            }
        });

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        lblLocation.setText("Location:");

        lblComplaintID.setText("Complaint ID:");

        cmbAccusedName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "   ", "  ", " " }));
        cmbAccusedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccusedNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblStatus)
                                            .addComponent(lblLocation))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLocation)
                                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblType)
                                            .addComponent(lblAccusedStudent)
                                            .addComponent(lblVictimStudent)
                                            .addComponent(lblComplaintID))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtComplaintID)
                                            .addComponent(txtVictimName)
                                            .addComponent(txtAccused)
                                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSuspectInCustody)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnTaskCompleted)
                                        .addComponent(btnOnTheWay)))))
                        .addGap(0, 375, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAcceptCase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSceneReached)
                            .addComponent(btnRedEyeNotified))
                        .addGap(176, 176, 176))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblComplaintID)
                    .addComponent(txtComplaintID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVictimStudent)
                    .addComponent(txtVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccusedStudent)
                    .addComponent(txtAccused, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblType)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptCase)
                    .addComponent(btnOnTheWay)
                    .addComponent(btnSceneReached))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedEyeNotified)
                    .addComponent(btnSuspectInCustody)
                    .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnTaskCompleted)
                .addGap(146, 146, 146))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnTheWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnTheWayActionPerformed
        // TODO add your handling code here:
        if(police.getComplaint().getStatus().equalsIgnoreCase("Accepted"))
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("OnTheWay");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnOnTheWayActionPerformed

    private void btnRedEyeNotifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedEyeNotifiedActionPerformed
        // TODO add your handling code here:
         if(police.getComplaint().getStatus().equalsIgnoreCase("SceneReached") || suspectApprehended)
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("Chief Notified to arrange pickup");
            mainComplaint=system.getComplaintDirectory().getComplaint(currentComplaint.getComplaintID());
            mainComplaint.setStatus("Arrange Pickup");
            this.notifiedChief=true;
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, " You have not reached the scene! \n Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnRedEyeNotifiedActionPerformed

    private void btnTaskCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskCompletedActionPerformed
        // TODO add your handling code here:
        if(notifiedChief && suspectApprehended)
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("TaskCompleted");
            cmbAccusedName.setEnabled(false);
            mainComplaint=system.getComplaintDirectory().getComplaint(currentComplaint.getComplaintID());
            mainComplaint.setPoliceOfficerFeedback(JOptionPane.showInputDialog("Enter your feedback for the case "));
            mainComplaint.setPolice(false);
            mainComplaint.setAccusedStudent(accused);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Please make sure you have suspect in custody and chief is notified", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnTaskCompletedActionPerformed

    private void btnSuspectInCustodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspectInCustodyActionPerformed
        // TODO add your handling code here:
         if(police.getComplaint().getStatus().equalsIgnoreCase("SceneReached") || notifiedChief)
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("Suspect Apprehended");
            currentComplaint.setAccusedStudent(accused);
            this.suspectApprehended=true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Select suspect! \n Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnSuspectInCustodyActionPerformed

    private void btnSceneReachedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSceneReachedActionPerformed
        // TODO add your handling code here:
        if(police.getComplaint().getStatus().equalsIgnoreCase("OnTheWay"))
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("SceneReached");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnSceneReachedActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtVictimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVictimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVictimNameActionPerformed

    private void txtAccusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccusedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccusedActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void cmbAccusedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccusedNameActionPerformed
        // TODO add your handling code here:
        try{
            if(police.getComplaint().getStatus().equalsIgnoreCase("SceneReached"))
            {

                accusedIndex = cmbAccusedName.getSelectedIndex();
                accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);//getStudentDirectory().getStudentDir().get(accusedIndex);

            }
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_cmbAccusedNameActionPerformed

    private void btnAcceptCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptCaseActionPerformed
        // TODO add your handling code here:
        if(police.getComplaint().getStatus().equalsIgnoreCase("New"))
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("Accepted");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You already accepted the case \n Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

          
           // JOptionPane.showMessageDialog(null, "You are already working on Complaint :"+police.getComplaint().getComplaintID() +"\n Current Status :" + police.getComplaint().getStatus()+"\nPlease finish task to proceed", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnAcceptCaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptCase;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JButton btnRedEyeNotified;
    private javax.swing.JButton btnSceneReached;
    private javax.swing.JButton btnSuspectInCustody;
    private javax.swing.JButton btnTaskCompleted;
    private javax.swing.JComboBox<String> cmbAccusedName;
    private javax.swing.JLabel lblAccusedStudent;
    private javax.swing.JLabel lblComplaintID;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblVictimStudent;
    private javax.swing.JTextField txtAccused;
    private javax.swing.JTextField txtComplaintID;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVictimName;
    // End of variables declaration//GEN-END:variables

    private void populateFields() 
    {
        txtComplaintID.setText(complaint.getComplaintID());
        txtVictimName.setText(complaint.getVictimStudent().getName());
        try
        {
             txtAccused.setText(complaint.getAccusedStudent().getName());
        }
        catch (NullPointerException e)
        {
             txtAccused.setText(" ");
        }
             txtType.setText(complaint.getTypeOfIncident());
             txtLocation.setText(complaint.getLocation());
             txtStatus.setText(complaint.getStatus());
        
    }

}
