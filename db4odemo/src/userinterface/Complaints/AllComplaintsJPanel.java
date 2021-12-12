/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Complaints;

import Business.Complaint.Complaint;
import Business.EcoSystem;
import Business.Student.Student;
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
public class AllComplaintsJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form AllComplaintsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    ArrayList<Complaint> complaintDirectory;
    ArrayList<Student> studentList;
    Student victimStudent;
    DefaultTableModel md;
    
    public AllComplaintsJPanel(JPanel userProcessContainer,  UserAccount account, EcoSystem system) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        complaintDirectory= this.system.getComplaintDirectory().getComplaintList();
        studentList=system.getStudentDirectory().getStudentDir();
        for(Student student : studentList)
        {
            if(student.getUserAccount().equals(account))
            {
                victimStudent=student;
            }
           
        }
        populateTable();
        
    }

     public void populateTable()
     {
        int i=0;
        md=(DefaultTableModel)tblAllComplaints.getModel();
        md.setRowCount(0);
        Object row[]= new Object[6];
        try{
            for(Complaint c : victimStudent.getMyComplaints())
            {

                row[0]=c.getComplaintID();
                row[1]=c.getTypeOfComplaint();
                row[2]=c.getVictimStudent().getName();
                try{
                    row[3]=c.getAccusedStudent().getName();
                }
                catch(NullPointerException e){
                    row[3]="";
                }
                row[4]=c.getLocation();
                row[5]=c.getVictimStudent().getPhone();
                md.addRow(row);

            }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "You have no complaints");
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
        tblAllComplaints = new javax.swing.JTable();
        lblHeading = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblAllComplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Priority", "Victim", "Accused", "Location", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllComplaints);

        lblHeading.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblHeading.setText("ALL COMPLAINTS");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblHeading)
                            .addGap(385, 385, 385))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHeading)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addContainerGap(307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblAllComplaints;
    // End of variables declaration//GEN-END:variables
}
