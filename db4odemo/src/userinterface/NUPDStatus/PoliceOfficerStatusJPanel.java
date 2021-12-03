/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NUPDStatus;

/**
 *
 * @author fianrodrigues
 */
public class PoliceOfficerStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceOfficerStatusJPanel
     */
    public PoliceOfficerStatusJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblComplaintsWithStatus = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnProcessComplaints = new javax.swing.JButton();
        btnRefreshStatus = new javax.swing.JButton();

        tblComplaintsWithStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Type", "Victim", "Accused", "Priority", "Location", "Contact", "Staus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComplaintsWithStatus.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblComplaintsWithStatus);
        tblComplaintsWithStatus.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPLAINT STATUS");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessComplaints)
                    .addComponent(btnRefreshStatus))
                .addContainerGap(406, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessComplaintsActionPerformed
        // TODO add your handling code here:
        
//        if (emergencyType == "Injury" )
//        {
//            go to Injury Status Selection Page
//        }
//        else if (emergencyType == "Firearms" )
//        {
//            go to Firearms Status Selection Page
//        }
//        else if (emergencyType == "Threat/Stalking" )
//        {
//            go to Threat/Stalking Status Selection Page
//        }
//        else if (emergencyType == "Sexual Assault" )
//        {
//            go to Sexual Assault Status Selection Page
//        }
//        else
//        {
//            JOptionPane.showMessageDialog("Type of Emergency not selected");  
//        }
    }//GEN-LAST:event_btnProcessComplaintsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessComplaints;
    private javax.swing.JButton btnRefreshStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblComplaintsWithStatus;
    // End of variables declaration//GEN-END:variables
}
