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
public class FirearmsStatusJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form FirearmsJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Complaint complaint, currentComplaint, mainComplaint;
    PoliceOfficer police;
    Student accused;
    int accusedIndex;
    public FirearmsStatusJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, PoliceOfficer police, Complaint complaint)
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.complaint=complaint;
        this.police= police;
        ArrayList<Student> studentList = system.getStudentDirectory().getStudentDir();
        police.setComplaint(complaint);
        DefaultComboBoxModel model2= new DefaultComboBoxModel(studentList.toArray());
        cmbAccusedName.setModel( model2);
        accusedIndex = 0;
        accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);
        
//        cmbAccusedName.setEnabled(false);
        populateFields();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcceptCase = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnOnTheWay = new javax.swing.JButton();
        btnSuspectInCustody = new javax.swing.JButton();
        btnTaskCompleted = new javax.swing.JButton();
        btnSceneReached = new javax.swing.JButton();
        lblReportedBy = new javax.swing.JLabel();
        lblAccusedStudent = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtComplaintID = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtReportedBy = new javax.swing.JTextField();
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
        lblTitle.setText("STATUS UPDATE FOR FIREARM COMPLAINTS");

        btnOnTheWay.setText("On The Way");
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnSuspectInCustody.setText("Suspect In Custody");
        btnSuspectInCustody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspectInCustodyActionPerformed(evt);
            }
        });

        btnTaskCompleted.setText("Task Completed");
        btnTaskCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskCompletedActionPerformed(evt);
            }
        });

        btnSceneReached.setText("Scene Reached");
        btnSceneReached.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSceneReachedActionPerformed(evt);
            }
        });

        lblReportedBy.setText("Reported By:");

        lblAccusedStudent.setText("Accused:");

        lblStatus.setText("Status:");

        lblType.setText("Type:");

        txtComplaintID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplaintIDActionPerformed(evt);
            }
        });

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtReportedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportedByActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
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
                                    .addComponent(lblReportedBy)
                                    .addComponent(lblComplaintID))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtComplaintID)
                                    .addComponent(txtReportedBy)
                                    .addComponent(txtAccused)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAcceptCase)
                            .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOnTheWay)
                            .addComponent(btnSuspectInCustody))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaskCompleted)
                            .addComponent(btnSceneReached))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblComplaintID)
                    .addComponent(txtComplaintID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportedBy)
                    .addComponent(txtReportedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptCase)
                    .addComponent(btnOnTheWay)
                    .addComponent(btnSceneReached))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuspectInCustody)
                    .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaskCompleted))
                .addGap(223, 223, 223))
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

    private void btnSuspectInCustodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspectInCustodyActionPerformed
        // TODO add your handling code here:
         if(police.getComplaint().getStatus().equalsIgnoreCase("SceneReached") /*&& cmbAccusedName.isEnabled()*/)
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("Suspect Apprehended");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Select suspect! \n Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnSuspectInCustodyActionPerformed

    private void btnTaskCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskCompletedActionPerformed
        // TODO add your handling code here:

        if(police.getComplaint().getStatus().equalsIgnoreCase("Suspect Apprehended") /*&& cmbAccusedName.isEnabled()*/)
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("TaskCompleted");
            int i=police.getPoliceComplaints().indexOf(currentComplaint);
            police.getPoliceComplaints().get(i).setStatus("TaskCompleted");
            cmbAccusedName.setEnabled(false);
            mainComplaint=system.getComplaintDirectory().getComplaint(currentComplaint.getComplaintID());
            mainComplaint.setPoliceOfficerFeedback(JOptionPane.showInputDialog("Enter your feedback for the case "));
            mainComplaint.setPolice(false);
            mainComplaint.setStatus("CaseClosed");
            mainComplaint.setAccusedStudent(accused);
            police.setComplaint(null);
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Select suspect! \n Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnTaskCompletedActionPerformed

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

    private void txtReportedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportedByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportedByActionPerformed

    private void txtAccusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccusedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccusedActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

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

    private void txtComplaintIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplaintIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplaintIDActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptCase;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JButton btnSceneReached;
    private javax.swing.JButton btnSuspectInCustody;
    private javax.swing.JButton btnTaskCompleted;
    private javax.swing.JComboBox<String> cmbAccusedName;
    private javax.swing.JLabel lblAccusedStudent;
    private javax.swing.JLabel lblComplaintID;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblReportedBy;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtAccused;
    private javax.swing.JTextField txtComplaintID;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtReportedBy;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    private void populateFields() 
    {
        
        txtComplaintID.setText(complaint.getComplaintID());
        txtReportedBy.setText(complaint.getVictimStudent().getName());
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

