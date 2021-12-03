/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NUPD;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aamrah
 */
public class ChiefOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChiefOfficerJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    public ChiefOfficerJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblComplaints = new javax.swing.JTable();
        lblHeading = new javax.swing.JLabel();
        btnPoliceOfficer = new javax.swing.JButton();
        btnUhcs = new javax.swing.JButton();
        btnRedeye = new javax.swing.JButton();
        btnOUEC = new javax.swing.JButton();
        lblAssign = new javax.swing.JLabel();
        btnInvestigator = new javax.swing.JButton();

        tblComplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Type", "Victim", "Accused", "Priority", "Location", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComplaints.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblComplaints);
        tblComplaints.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lblHeading.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblHeading.setText("All Complaints");

        btnPoliceOfficer.setText("Police Officer");
        btnPoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliceOfficerActionPerformed(evt);
            }
        });

        btnUhcs.setText("University Health & Counselling Services");

        btnRedeye.setText("RedEye Support");

        btnOUEC.setText("Office of Equity and Compliance");

        lblAssign.setText("Assign to :");

        btnInvestigator.setText("Investigator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lblHeading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAssign)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPoliceOfficer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRedeye)
                                .addGap(151, 151, 151)
                                .addComponent(btnInvestigator))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUhcs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOUEC)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblHeading)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblAssign)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPoliceOfficer)
                    .addComponent(btnRedeye)
                    .addComponent(btnInvestigator))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUhcs)
                    .addComponent(btnOUEC))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliceOfficerActionPerformed
        // TODO add your handling code here:
//        PoliceOfficerJPanel policePanel= new PoliceOfficerJPanel();
//        userProcessContainer.add("",restaurantPanel);
//        CardLayout cardlayout= (CardLayout) userProcessContainer.getLayout();
//        cardlayout.next(userProcessContainer);
    }//GEN-LAST:event_btnPoliceOfficerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvestigator;
    private javax.swing.JButton btnOUEC;
    private javax.swing.JButton btnPoliceOfficer;
    private javax.swing.JButton btnRedeye;
    private javax.swing.JButton btnUhcs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssign;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblComplaints;
    // End of variables declaration//GEN-END:variables
}
