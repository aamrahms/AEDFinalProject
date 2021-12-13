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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aamrah
 */
public class PoliceOfficerAssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceOfficerAssignJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Complaint complaint , newComplaint;
    ArrayList<PoliceOfficer> policeList;
    DefaultTableModel md;
    public PoliceOfficerAssignJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Complaint complaint) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        this.complaint=complaint;
        policeList=system.getPoliceDirectory().getPoliceOfficerList();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        tblPolice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Police Officer", "Working on"
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

        add(jScrollPane1);
        jScrollPane1.setBounds(6, 62, 696, 179);

        lblHeading.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblHeading.setText("Police Officers Available");
        add(lblHeading);
        lblHeading.setBounds(247, 6, 228, 22);

        btnAssign.setBackground(new java.awt.Color(0, 153, 153));
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign);
        btnAssign.setBounds(620, 270, 87, 29);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setText("< Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(0, 10, 108, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow =tblPolice.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please pick a complaint to assign to Police Officer!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            PoliceOfficer police= policeList.get(selectedRow);
            if(police.getComplaint()==null)
            {
//                if(complaint.isPolice() && )
//                {
//                    
//                }
                complaint.setStatus("AssignedToPoliceOfficer");
                complaint.setPolice(true);
                newComplaint= new Complaint(complaint);
                newComplaint.setStatus("New");
                police.getPoliceComplaints().add(newComplaint);
                JOptionPane.showMessageDialog(this, "Complaint assigned to Officer "+police.getName());
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Officer already assigned to a case");
            }
            
        }
        populateTable();
        

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
        
        for(PoliceOfficer p : policeList)
        {          
                row[0]=p.getName();
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
