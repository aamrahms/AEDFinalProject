/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Complaints;

import Business.Complaint.Complaint;
import Business.Complaint.ComplaintDirectory;
import Business.EcoSystem;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fianrodrigues
 */
public class EmergencyJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form EmergencyJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    ComplaintDirectory complaintDirectory;
    Complaint complaint;
    String typeOfIncident;
    Student victim, accused;
    
    public EmergencyJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system, Student victimStudent)
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account=account;
        this.victim=victimStudent;
        complaintDirectory =system.getComplaintDirectory();
        
        
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
        jLabel2 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        cmbTypeOfIncident1 = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMERGENCY COMPLAINT");

        jLabel2.setText("Location:");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationKeyReleased(evt);
            }
        });

        jLabel3.setText("Type:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cmbTypeOfIncident1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Injury", "Sexual Assault", "Firearm", "Threats or Stalking" }));
        cmbTypeOfIncident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeOfIncident1ActionPerformed(evt);
            }
        });

        btnBack.setText("Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTypeOfIncident1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSubmit))
                .addGap(38, 38, 38)
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTypeOfIncident1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btnSubmit)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTypeOfIncident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeOfIncident1ActionPerformed
        // TODO add your handling code here:

        String org = ("--Select--".equals(String.valueOf(cmbTypeOfIncident1.getSelectedItem())))? null : String.valueOf(cmbTypeOfIncident1.getSelectedItem());
        if (org!=null)
        {

            if ("Injury".equals(org))
            {
                typeOfIncident = "Injury";
            }
            else if ("Sexual Assault".equals(org))
            {
                typeOfIncident = "Sexual Assault";
            }
            else if ("Firearm".equals(org))
            {
                typeOfIncident = "Firearm";
            }
            else if ("Threats or Stalking".equals(org))
            {
                typeOfIncident = "Threats or Stalking";
            }
        }
    }//GEN-LAST:event_cmbTypeOfIncident1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String location = txtLocation.getText();
        
        complaint = complaintDirectory.createComplaint("Emergency", victim, null, location, typeOfIncident);
        JOptionPane.showMessageDialog(null, " Complaint registered with ID" +complaint.getComplaintID());
        
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyReleased
        // TODO add your handling code here:
        String add = "[A-Za-z0-9\\s,\\.#]+";
        Pattern geod = Pattern.compile(add);
        Matcher matcher = geod.matcher(txtLocation.getText());
        if(!matcher.matches())
        {
        lblErrorMessage.setText("Input invalid!");
        }
        else
        {
            lblErrorMessage.setText(" ");
        }
    }//GEN-LAST:event_txtLocationKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbTypeOfIncident1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JTextField txtLocation;
    // End of variables declaration//GEN-END:variables
}
