/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Student;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.Complaints.ComplaintJPanel;
import userinterface.Complaints.FileAComplaintJPanel;

/**
 *
 * @author aamrah
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    
    public StudentJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRaiseComplaint = new javax.swing.JButton();
        btnViewAllComplaints = new javax.swing.JButton();

        btnRaiseComplaint.setText("Raise a Complaint");
        btnRaiseComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseComplaintActionPerformed(evt);
            }
        });

        btnViewAllComplaints.setText("View All Complaints");
        btnViewAllComplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllComplaintsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewAllComplaints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRaiseComplaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnRaiseComplaint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewAllComplaints)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseComplaintActionPerformed
        // TODO add your handling code here:
        
        
        ComplaintJPanel complaintForm = new ComplaintJPanel(userProcessContainer, system);
        userProcessContainer.add("FileAComplaint", complaintForm);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnRaiseComplaintActionPerformed

    private void btnViewAllComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllComplaintsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAllComplaintsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRaiseComplaint;
    private javax.swing.JButton btnViewAllComplaints;
    // End of variables declaration//GEN-END:variables
}
