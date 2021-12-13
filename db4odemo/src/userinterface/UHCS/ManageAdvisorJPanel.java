/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.UHCS;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class ManageAdvisorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    
    /**
     * Creates new form ManageReceptionist
     */
    public ManageAdvisorJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;     // logged user; UserAccount has both Employee (basic details) & WorkQueue (complaintlist)
        this.system = system;
        
        lblName.setText(account.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnInBucketPage = new javax.swing.JButton();
        btnOldPage = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();

        jLabel1.setText("Welcome ");

        btnInBucketPage.setText("Manage In-Bucket Complaints");
        btnInBucketPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBucketPageActionPerformed(evt);
            }
        });

        btnOldPage.setText("Manage Completed Complaints");
        btnOldPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOldPageActionPerformed(evt);
            }
        });

        btnDashboard.setText("Dashboard View");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOldPage)
                            .addComponent(btnInBucketPage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(btnDashboard)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(btnInBucketPage)
                .addGap(46, 46, 46)
                .addComponent(btnOldPage)
                .addGap(45, 45, 45)
                .addComponent(btnDashboard)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        DashboardAdvisorJPanel page = new DashboardAdvisorJPanel(userProcessContainer,account,system);
        userProcessContainer.add("Advisor Dashboard Complaints",page);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnInBucketPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBucketPageActionPerformed
        AdvisorJPanel page = new AdvisorJPanel(userProcessContainer,account,system);
        userProcessContainer.add("Advisor InBucket Complaints",page);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInBucketPageActionPerformed

    private void btnOldPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOldPageActionPerformed
        CompletedAdvisorJPanel page = new CompletedAdvisorJPanel(userProcessContainer,account,system);
        userProcessContainer.add("Advisor Old Complaints",page);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOldPageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnInBucketPage;
    private javax.swing.JButton btnOldPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
