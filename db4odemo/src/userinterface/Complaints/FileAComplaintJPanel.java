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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fianrodrigues
 */
public class FileAComplaintJPanel extends javax.swing.JPanel 
{

    /**
     * Creates new form FileAComplaintJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    String reasons="";
    ComplaintDirectory complaintDirectory;
    Complaint complaint;
    String typeOfIncident;
    Student victim, accused;
    int victimIndex, accusedIndex;
    
    public FileAComplaintJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Student victimStudent) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.system = system;
        this.victim=victimStudent;
        complaintDirectory =system.getComplaintDirectory();
        
        ArrayList<Student> studentList = system.getStudentDirectory().getStudentDir();
        
        DefaultComboBoxModel model= new DefaultComboBoxModel(studentList.toArray());
        DefaultComboBoxModel model2= new DefaultComboBoxModel(studentList.toArray());
        cmbVictimName.setModel( model );
        cmbAccusedName.setModel( model2 );
        //to set default values
        victimIndex = 0;
        victim=system.getStudentDirectory().getStudentDir().get(victimIndex);
        accusedIndex = 0;
        accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);
        
    }
//  
//    public static void valDate(String date)
//    {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        try
//        {
//            formatter.parse(date);
//            lblErrorMessage.setText(" ");
//        }
//        catch (Exception e)
//       {
//            lblErrorMessage.setText(" ");
//       }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lbTypeOfIncident = new javax.swing.JLabel();
        cmbTypeOfIncident1 = new javax.swing.JComboBox<>();
        lblDescription = new javax.swing.JLabel();
        lblTitle3 = new javax.swing.JLabel();
        lblVictimStudent = new javax.swing.JLabel();
        cmbVictimName = new javax.swing.JComboBox<>();
        lblAccusedVictim = new javax.swing.JLabel();
        cmbAccusedName = new javax.swing.JComboBox<>();
        lblNatureOfDiscrimination = new javax.swing.JLabel();
        chckRace = new javax.swing.JCheckBox();
        chckGender = new javax.swing.JCheckBox();
        chckNationality = new javax.swing.JCheckBox();
        lblTitle = new javax.swing.JLabel();
        chckPoliticalAffiliation = new javax.swing.JCheckBox();
        lbDateOfIncident = new javax.swing.JLabel();
        chckOrientation = new javax.swing.JCheckBox();
        txtDateOfIncident = new javax.swing.JTextField();
        chckDisability = new javax.swing.JCheckBox();
        lbTimeOfIncident = new javax.swing.JLabel();
        chckParentalStatus = new javax.swing.JCheckBox();
        txtTimeOfIncident = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblTitle2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        chckAge = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblErrorMessage = new javax.swing.JLabel();

        lbLocation.setText("Location:");

        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocationKeyPressed(evt);
            }
        });

        lbTypeOfIncident.setText("Type of Incident:");

        cmbTypeOfIncident1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Alleged Accusation", "Assault", "Discrimination", "Plaigiarism" }));
        cmbTypeOfIncident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeOfIncident1ActionPerformed(evt);
            }
        });

        lblDescription.setText("Describe the Incident:");

        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle3.setText("Details of the Involved Parties");

        lblVictimStudent.setText("Name of the Victim:");

        cmbVictimName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "  ", "   ", "   " }));
        cmbVictimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVictimNameActionPerformed(evt);
            }
        });

        lblAccusedVictim.setText("Name of the Accused:");

        cmbAccusedName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "   ", "  ", " " }));
        cmbAccusedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccusedNameActionPerformed(evt);
            }
        });

        lblNatureOfDiscrimination.setText("What was the nature of the discrimination?");

        chckRace.setText("Race");
        chckRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckRaceActionPerformed(evt);
            }
        });

        chckGender.setText("Gender");
        chckGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckGenderActionPerformed(evt);
            }
        });

        chckNationality.setText("Nationality");
        chckNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckNationalityActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("FILE A COMPLAINT");

        chckPoliticalAffiliation.setText("Political Affiliation");
        chckPoliticalAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckPoliticalAffiliationActionPerformed(evt);
            }
        });

        lbDateOfIncident.setText("Date of Incident:");

        chckOrientation.setText("Orientation");
        chckOrientation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckOrientationActionPerformed(evt);
            }
        });

        txtDateOfIncident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateOfIncidentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateOfIncidentKeyReleased(evt);
            }
        });

        chckDisability.setText("Disability");
        chckDisability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckDisabilityActionPerformed(evt);
            }
        });

        lbTimeOfIncident.setText("Time of Incident:");

        chckParentalStatus.setText("Parental Status");
        chckParentalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckParentalStatusActionPerformed(evt);
            }
        });

        txtTimeOfIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeOfIncidentActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Details of the Incident");

        btnBack.setText("Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        chckAge.setText("Age");
        chckAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckAgeActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblErrorMessage.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNatureOfDiscrimination)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chckAge)
                                .addGap(18, 18, 18)
                                .addComponent(chckParentalStatus)
                                .addGap(18, 18, 18)
                                .addComponent(chckRace)
                                .addGap(18, 18, 18)
                                .addComponent(chckGender))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chckPoliticalAffiliation)
                                .addGap(18, 18, 18)
                                .addComponent(chckOrientation)
                                .addGap(18, 18, 18)
                                .addComponent(chckDisability))
                            .addComponent(chckNationality)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(89, 89, 89))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDateOfIncident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTimeOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTypeOfIncident, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTimeOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                    .addComponent(lblAccusedVictim, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbTypeOfIncident1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDateOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblVictimStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(30, 30, 30)
                                    .addComponent(cmbVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(321, 321, 321)
                            .addComponent(btnSubmit)
                            .addGap(52, 52, 52)
                            .addComponent(btnBack)))
                    .addGap(5, 5, 5)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNatureOfDiscrimination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chckParentalStatus)
                    .addComponent(chckRace)
                    .addComponent(chckGender)
                    .addComponent(chckAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chckPoliticalAffiliation)
                    .addComponent(chckOrientation)
                    .addComponent(chckDisability))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chckNationality)
                .addGap(129, 129, 129))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDateOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDateOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVictimStudent)
                        .addComponent(cmbVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTimeOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimeOfIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAccusedVictim)
                        .addComponent(cmbAccusedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTypeOfIncident)
                        .addComponent(cmbTypeOfIncident1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblDescription)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubmit)
                        .addComponent(btnBack))
                    .addGap(40, 40, 40)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chckRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckRaceActionPerformed
        // TODO add your handling code here:

        if(chckRace.isEnabled())
        {
            reasons += " Race ";
        }

    }//GEN-LAST:event_chckRaceActionPerformed

    private void chckGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckGenderActionPerformed
        // TODO add your handling code here:

        if(chckGender.isEnabled())
        {
            reasons += " Gender ";
        }
    }//GEN-LAST:event_chckGenderActionPerformed

    private void chckNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckNationalityActionPerformed
        // TODO add your handling code here:

        if(chckNationality.isEnabled())
        {
            reasons += " Nationality ";
        }
    }//GEN-LAST:event_chckNationalityActionPerformed

    private void chckPoliticalAffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckPoliticalAffiliationActionPerformed
        // TODO add your handling code here:

        if(chckPoliticalAffiliation.isEnabled())
        {
            reasons+=" Political Affiliation ";
        }
    }//GEN-LAST:event_chckPoliticalAffiliationActionPerformed

    private void chckOrientationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckOrientationActionPerformed
        // TODO add your handling code here:

        if (chckOrientation.isEnabled())
        {
            reasons += " Orientation ";
        }
    }//GEN-LAST:event_chckOrientationActionPerformed

    private void chckDisabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckDisabilityActionPerformed
        // TODO add your handling code here:

        if(chckDisability.isEnabled())
        {
            reasons += " Disability ";
        }
    }//GEN-LAST:event_chckDisabilityActionPerformed

    private void chckParentalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckParentalStatusActionPerformed
        // TODO add your handling code here:

        if (chckParentalStatus.isEnabled())
        {
            reasons += " Parental Status ";

        }

    }//GEN-LAST:event_chckParentalStatusActionPerformed

    private void txtTimeOfIncidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeOfIncidentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeOfIncidentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void chckAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckAgeActionPerformed
        // TODO add your handling code here:
        
         if(chckRace.isEnabled())
        {
            reasons += " Race ";
        }
    }//GEN-LAST:event_chckAgeActionPerformed

    private void cmbVictimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVictimNameActionPerformed
        // TODO add your handling code here:
         
        victimIndex = cmbVictimName.getSelectedIndex();
        victim=system.getStudentDirectory().getStudentDir().get(victimIndex);
        
    }//GEN-LAST:event_cmbVictimNameActionPerformed

    private void cmbTypeOfIncident1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeOfIncident1ActionPerformed
        // TODO add your handling code here:
        
        String org = ("--Select--".equals(String.valueOf(cmbTypeOfIncident1.getSelectedItem())))? null : String.valueOf(cmbTypeOfIncident1.getSelectedItem());
        if (org!=null) 
        {

            if ("Alleged Accusation".equals(org)) 
            {
              typeOfIncident="Alleged Accusation";
                
            } 
            else if ("Assault".equals(org))
            {
                typeOfIncident="Assault";
            }
            else if ("Discrimination".equals(org)) 
            {
                typeOfIncident="Discrimination";
            }
            else if ("Plaigiarism".equals(org))
            {
                typeOfIncident="Plaigiarism";
            }
        }
    }//GEN-LAST:event_cmbTypeOfIncident1ActionPerformed

    private void cmbAccusedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccusedNameActionPerformed
        // TODO add your handling code here:
      
        accusedIndex = cmbAccusedName.getSelectedIndex();
        accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);//getStudentDirectory().getStudentDir().get(accusedIndex);
        
        
    }//GEN-LAST:event_cmbAccusedNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
//        String typeOfIncident;
//    Student victim, accused;
//    reasons
        String date = txtDateOfIncident.getText();
        String time = txtTimeOfIncident.getText();
        //String type = cmbTypeOfIncident1.getName();
        String location = txtLocation.getText();
        String description = txtDescription.getText();
        //String typeOfComplaint, Student student, String dateOfIncident , String location, String typeOfIncident
        complaint=complaintDirectory.createComplaint("Normal", victim,date, location, typeOfIncident);
        complaintDirectory.appendNormalComplaint(complaint, location, date, accused, description, reasons);
        JOptionPane.showMessageDialog(null, " Complaint registered with ID" +complaint.getComplaintID());
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtDateOfIncidentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfIncidentKeyPressed
        // TODO add your handling code here:
        
//        String date = txtDateOfIncident.getText();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        try
//        {
//            formatter.parse(date);
//            lblErrorMessage.setText(" ");
//        }
//        catch (Exception e)
//       {
//            lblErrorMessage.setText("Invalid Date Input! ");
//       }
    }//GEN-LAST:event_txtDateOfIncidentKeyPressed

    private void txtLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyPressed
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
      
    }//GEN-LAST:event_txtLocationKeyPressed

    private void txtDateOfIncidentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfIncidentKeyReleased
        // TODO add your handling code here:
        String date = txtDateOfIncident.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try
        {
            formatter.parse(date);
            lblErrorMessage.setText(" ");
        }
        catch (Exception e)
       {
            lblErrorMessage.setText("Invalid Date Input! ");
       }
    }//GEN-LAST:event_txtDateOfIncidentKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chckAge;
    private javax.swing.JCheckBox chckDisability;
    private javax.swing.JCheckBox chckGender;
    private javax.swing.JCheckBox chckNationality;
    private javax.swing.JCheckBox chckOrientation;
    private javax.swing.JCheckBox chckParentalStatus;
    private javax.swing.JCheckBox chckPoliticalAffiliation;
    private javax.swing.JCheckBox chckRace;
    private javax.swing.JComboBox<String> cmbAccusedName;
    private javax.swing.JComboBox<String> cmbTypeOfIncident1;
    private javax.swing.JComboBox<String> cmbVictimName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDateOfIncident;
    private javax.swing.JLabel lbLocation;
    private javax.swing.JLabel lbTimeOfIncident;
    private javax.swing.JLabel lbTypeOfIncident;
    private javax.swing.JLabel lblAccusedVictim;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblNatureOfDiscrimination;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblVictimStudent;
    private javax.swing.JTextField txtDateOfIncident;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTimeOfIncident;
    // End of variables declaration//GEN-END:variables

    
}
