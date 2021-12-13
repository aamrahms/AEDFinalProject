/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Redeye;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.Logic.Redeye.Driver;
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
public class DriverJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form DriverStatusJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    ArrayList<Complaint> complaintDirectory;
    ArrayList<Driver> driverList;
    Driver driver;
    DefaultTableModel md;
    
    public DriverJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        complaintDirectory= this.system.getComplaintDirectory().getComplaintList();
        driverList=this.system.getDriverDirectory().getDriverList();
        for(Driver d : driverList)
        {
            if(d.getEmployee().getUsername().equals(account.getUsername()))
            {
                driver=d;
            }
        }
        populateTable();
    }

    public void populateTable()
    {
        
        int i=0;
        md=(DefaultTableModel)tblComplaints.getModel();
        md.setRowCount(0);
        Object row[]= new Object[8];
        
        for(Complaint c : driver.getRidesList())
        {
                i=1;
            
                if(c.getTypeOfComplaint().equalsIgnoreCase("Emergency"))
                {
                    row[0]=c;
                    row[1]=c.getTypeOfComplaint();
                    row[2]=c.getTypeOfIncident();
                    row[3]=c.getDateOfIncident();
                    row[4]=c.getVictimStudent().getName();
                    row[5]=c.getLocation();
                    row[6]=c.getVictimStudent().getPhone();
                    try{
                        row[7]=driver.getComplaint().getStatus();
                    }
                    catch(NullPointerException e)
                    {
                        row[7]="New Pickup";
                    }

                    md.addRow(row);
                }
         
        }
        if(i==0)
        {
            
            JOptionPane.showMessageDialog(this,"You dont have any complaints assigned to you");
       
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
        tblComplaints = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnProcessComplaints = new javax.swing.JButton();
        btnRefreshStatus = new javax.swing.JButton();

        tblComplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Priority", "Time of Complaint", "Type of Incident", "Victim", "Location", "Contact", "Ride Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblComplaints);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Pickups");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btnProcessComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnRefreshStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
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
        int selectedRow =tblComplaints.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please pick a ride to process!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            Complaint complaint= (Complaint) tblComplaints.getValueAt(selectedRow, 0);
//            JOptionPane.showMessageDialog(null, complaint.getTypeOfIncident(), "Warning", JOptionPane.WARNING_MESSAGE);
            if (complaint.getTypeOfIncident().equalsIgnoreCase("Threats or Stalking") )
            {
                RideStatusJPanel threatsPanel= new RideStatusJPanel(userProcessContainer, account, system,driver, complaint);
                userProcessContainer.add("CheckRideJPanel",threatsPanel);
                CardLayout cardlayout= (CardLayout) userProcessContainer.getLayout();
                cardlayout.next(userProcessContainer);
            }
            else if (complaint.getTypeOfIncident().equalsIgnoreCase("Sexual Assault") )
            {
                 SexualAssaultRideStatusJPanel assaultPanel= new  SexualAssaultRideStatusJPanel(userProcessContainer, account, system, driver,complaint);
                userProcessContainer.add("CheckRideJPanel",assaultPanel);
                CardLayout cardlayout= (CardLayout) userProcessContainer.getLayout();
                cardlayout.next(userProcessContainer);
            }
      
        
        }
                                                      

        
    }//GEN-LAST:event_btnProcessComplaintsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessComplaints;
    private javax.swing.JButton btnRefreshStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblComplaints;
    // End of variables declaration//GEN-END:variables
}
