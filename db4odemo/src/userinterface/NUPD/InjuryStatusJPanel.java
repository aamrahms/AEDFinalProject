/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NUPD;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.Logic.NUPD.PoliceOfficer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fianrodrigues
 */
public class InjuryStatusJPanel extends javax.swing.JPanel
{

    /**
     * Creates new form InjuryStatusJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Complaint complaint, currentComplaint, mainComplaint;
    PoliceOfficer police;
    public InjuryStatusJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, PoliceOfficer police,Complaint complaint)
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.complaint=complaint;
        this.police=police;
        police.setComplaint(complaint);
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
        btnSceneReached = new javax.swing.JButton();
        btnDroppedOffAtUHCS = new javax.swing.JButton();
        btnTaskCompleted = new javax.swing.JButton();
        btnVictimPicked = new javax.swing.JButton();
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
        btnBack = new javax.swing.JButton();

        btnAcceptCase.setText("Accept Case");
        btnAcceptCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptCaseActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("STATUS UPDATE FOR INJURY COMPLAINTS");

        btnOnTheWay.setText("On The Way");
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnSceneReached.setText("Scene Reached");
        btnSceneReached.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSceneReachedActionPerformed(evt);
            }
        });

        btnDroppedOffAtUHCS.setText("Dropped Off At UHCS");
        btnDroppedOffAtUHCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDroppedOffAtUHCSActionPerformed(evt);
            }
        });

        btnTaskCompleted.setText("Task Completed");
        btnTaskCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskCompletedActionPerformed(evt);
            }
        });

        btnVictimPicked.setText("Picked Up The Victim");
        btnVictimPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVictimPickedActionPerformed(evt);
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

        btnBack.setText("< Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAcceptCase)
                        .addGap(167, 167, 167)
                        .addComponent(btnOnTheWay)
                        .addGap(173, 173, 173)
                        .addComponent(btnSceneReached))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVictimPicked)
                                .addGap(124, 124, 124)
                                .addComponent(btnDroppedOffAtUHCS)
                                .addGap(122, 122, 122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTaskCompleted)
                                .addGap(279, 279, 279)))))
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
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
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(62, 62, 62)
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
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSceneReached)
                    .addComponent(btnAcceptCase)
                    .addComponent(btnOnTheWay))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDroppedOffAtUHCS)
                    .addComponent(btnVictimPicked))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnTaskCompleted)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnDroppedOffAtUHCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDroppedOffAtUHCSActionPerformed
        // TODO add your handling code here:
        
        // a pop up for the Police to write a description/feedback
        // change Status to new at Dropped off at UHCS
        if(police.getComplaint().getStatus().equalsIgnoreCase("VictimPicked"))
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("DroppedToUHCS");
            currentComplaint.setUHCS(true);
            mainComplaint=system.getComplaintDirectory().getComplaint(currentComplaint.getComplaintID());
            mainComplaint.setUHCS(true);
            UserAccount receptionist = system.getUserAccountDirectory().fetchReceptionistFromUa();
            Complaint c = new Complaint(mainComplaint);
            c.setStatus("UHCS New");
            receptionist.getWorkQueue().getComplaintList().add(c);           
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
        
    }//GEN-LAST:event_btnDroppedOffAtUHCSActionPerformed

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

    private void btnTaskCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskCompletedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaskCompletedActionPerformed

    private void btnVictimPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVictimPickedActionPerformed
        // TODO add your handling code here:
        if(police.getComplaint().getStatus().equalsIgnoreCase("SceneReached"))
        {
            
            currentComplaint=police.getComplaint();
            currentComplaint.setStatus("VictimPicked");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Current Status :" + police.getComplaint().getStatus()+"\nPlease go to next step", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        populateFields();
    }//GEN-LAST:event_btnVictimPickedActionPerformed

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptCase;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDroppedOffAtUHCS;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JButton btnSceneReached;
    private javax.swing.JButton btnTaskCompleted;
    private javax.swing.JButton btnVictimPicked;
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
             txtType.setText(complaint.getTypeOfIncident());
             txtLocation.setText(complaint.getLocation());
             txtStatus.setText(complaint.getStatus());
        
             try
             {
                     txtAccused.setText(complaint.getAccusedStudent().getName());
             }
             catch (NullPointerException e)
             {
                 txtAccused.setText(" ");
             }
         }
}
