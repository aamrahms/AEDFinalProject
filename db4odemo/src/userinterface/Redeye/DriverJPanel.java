/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Redeye;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fianrodrigues
 */
public class DriverJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form DriverStatusJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    ArrayList<Complaint> complaintDirectory;
    DefaultTableModel md;
    
    public DriverJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        complaintDirectory= this.system.getComplaintDirectory().getComplaintList();
        
        populateTable();
    }

    public void populateTable()
    {
        
        md=(DefaultTableModel)tblComplaintsWithStatus.getModel();
        md.setRowCount(0);
        Object row[]= new Object[5];
        
        for(Complaint c : complaintDirectory)
        {
            
            row[0]=c.getComplaintID();
            row[1]=c.getTypeOfComplaint();
            row[2]=c.getVictimStudent().getName();
            //row[3] = c.getPriority();
            //row[4] = c.getLocation();
            row[5]=c.getVictimStudent().getPhone();
            //row[6] = c.Status();
            md.addRow(row);
                   
        }
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
        tblComplaintsWithStatus = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnProcessComplaints = new javax.swing.JButton();
        btnRefreshStatus = new javax.swing.JButton();

        tblComplaintsWithStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Type", "Victim", "Priority", "Location", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComplaintsWithStatus.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblComplaintsWithStatus);
        tblComplaintsWithStatus.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("COMPLAINT STATUS");

        btnProcessComplaints.setText("Process Complaint");
        btnProcessComplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessComplaintsActionPerformed(evt);
            }
        });

        btnRefreshStatus.setText("Refresh Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btnProcessComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefreshStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessComplaints)
                    .addComponent(btnRefreshStatus))
                .addContainerGap(381, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessComplaintsActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btnProcessComplaintsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessComplaints;
    private javax.swing.JButton btnRefreshStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblComplaintsWithStatus;
    // End of variables declaration//GEN-END:variables
}
