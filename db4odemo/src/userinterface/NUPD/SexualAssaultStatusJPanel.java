/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NUPD;

/**
 *
 * @author fianrodrigues
 */
public class SexualAssaultStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SexualAssaultStatusJPanel
     */
    public SexualAssaultStatusJPanel() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnOnTheWay = new javax.swing.JButton();
        btnRedEyeNotified = new javax.swing.JButton();
        btnTaskCompleted = new javax.swing.JButton();
        btnSuspectInCustody = new javax.swing.JButton();
        btnSceneReached = new javax.swing.JButton();
        lbserialNumber = new javax.swing.JLabel();
        txtComplaintID = new javax.swing.JTextField();
        txtVictimName = new javax.swing.JTextField();
        txtAccused = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lbmake = new javax.swing.JLabel();
        lbmanufactureDate = new javax.swing.JLabel();
        lboccupancy = new javax.swing.JLabel();
        lbmanufactureDate1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lbmake1 = new javax.swing.JLabel();

        btnAcceptCase.setText("Accept Case");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATUS FOR SEXUAL ASSAULT COMPLAINTS");

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

        lbserialNumber.setText("Type:");

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

        lbmake.setText("Complaint ID:");

        lbmanufactureDate.setText("Victim Name:");

        lboccupancy.setText("Accused:");

        lbmanufactureDate1.setText("Status:");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        lbmake1.setText("Location:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSuspectInCustody)
                        .addGap(148, 148, 148)
                        .addComponent(btnRedEyeNotified)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAcceptCase)
                        .addGap(170, 170, 170)
                        .addComponent(btnOnTheWay)
                        .addGap(187, 187, 187)
                        .addComponent(btnSceneReached))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTaskCompleted)
                        .addGap(297, 297, 297)))
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbmanufactureDate1)
                            .addComponent(lbmake1))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtStatus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbserialNumber)
                            .addComponent(lboccupancy)
                            .addComponent(lbmanufactureDate)
                            .addComponent(lbmake))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbmake)
                    .addComponent(txtComplaintID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmanufactureDate)
                    .addComponent(txtVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lboccupancy)
                    .addComponent(txtAccused, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbserialNumber)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbmake1)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmanufactureDate1)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptCase)
                    .addComponent(btnSceneReached)
                    .addComponent(btnOnTheWay))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedEyeNotified)
                    .addComponent(btnSuspectInCustody))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnTaskCompleted)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuspectInCustodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspectInCustodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuspectInCustodyActionPerformed

    private void btnTaskCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskCompletedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaskCompletedActionPerformed

    private void btnRedEyeNotifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedEyeNotifiedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedEyeNotifiedActionPerformed

    private void btnOnTheWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnTheWayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOnTheWayActionPerformed

    private void btnSceneReachedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSceneReachedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSceneReachedActionPerformed

    private void txtVictimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVictimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVictimNameActionPerformed

    private void txtAccusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccusedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccusedActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptCase;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JButton btnRedEyeNotified;
    private javax.swing.JButton btnSceneReached;
    private javax.swing.JButton btnSuspectInCustody;
    private javax.swing.JButton btnTaskCompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbmake;
    private javax.swing.JLabel lbmake1;
    private javax.swing.JLabel lbmanufactureDate;
    private javax.swing.JLabel lbmanufactureDate1;
    private javax.swing.JLabel lboccupancy;
    private javax.swing.JLabel lbserialNumber;
    private javax.swing.JTextField txtAccused;
    private javax.swing.JTextField txtComplaintID;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVictimName;
    // End of variables declaration//GEN-END:variables
}
