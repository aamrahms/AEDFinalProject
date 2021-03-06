/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OUEC;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.Logic.OUEC.OUECCoordinator;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fianrodrigues
 */
public class CoordinatorAssignJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form CoordinatorAssignJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Complaint complaint, newComplaint;
    ArrayList<OUECCoordinator> coordinatorList;
    DefaultTableModel md;
    public CoordinatorAssignJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system,  Complaint complaint) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        this.complaint=complaint;
        coordinatorList=system.getOuecCoordinators().getOuecCoordinatorList();

        populateTable();
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
        tblPolice = new javax.swing.JTable();
        lblHeading = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));

        tblPolice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "OUEC Co-ordinators", "Working on"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPolice);

        lblHeading.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("COORDINATORS AVAILABLE");

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

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
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(btnBack))
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(742, 742, 742)
                            .addComponent(btnAssign)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addGap(31, 31, 31)
                    .addComponent(lblHeading)
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)
                    .addComponent(btnAssign)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow =tblPolice.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please pick a complaint to assign to Police Officer!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
        
//
            OUECCoordinator coord= coordinatorList.get(selectedRow);
            if(coord.getComplaint()==null)
            {
                
                complaint.setStatus("AssignedToOUEC");
//                
                newComplaint= new Complaint(complaint);
                newComplaint.setStatus("New");
                coord.getComplaintsList().add(newComplaint);
                coord.setComplaint(newComplaint);
                JOptionPane.showMessageDialog(this, "Complaint assigned to Coordinator "+coord.getEmployee().getName());
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Coordinator already assigned to a case");
            }
//
        
        populateTable();
        }
//
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    public void populateTable()
    {
        
        md=(DefaultTableModel)tblPolice.getModel();
        md.setRowCount(0);
        Object row[]= new Object[2];
        
        for(OUECCoordinator p : coordinatorList)
        {          
                row[0]=p.getEmployee().getName();
                try{
                    row[1]="Complaint ID " +p.getComplaint().getComplaintID();
                }
                catch(NullPointerException e){
                    row[1]="Available";
                }
                md.addRow(row);         
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblPolice;
    // End of variables declaration//GEN-END:variables
}
