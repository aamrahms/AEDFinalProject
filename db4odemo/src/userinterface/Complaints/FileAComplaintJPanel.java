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
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lbLocation.setText("Location:");
        add(lbLocation);
        lbLocation.setBounds(60, 254, 116, 24);

        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocationKeyPressed(evt);
            }
        });
        add(txtLocation);
        txtLocation.setBounds(216, 254, 183, 24);

        lbTypeOfIncident.setText("Type of Incident:");
        add(lbTypeOfIncident);
        lbTypeOfIncident.setBounds(60, 284, 138, 16);

        cmbTypeOfIncident1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Alleged Accusation", "Assault", "Discrimination", "Plaigiarism" }));
        cmbTypeOfIncident1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeOfIncident1ActionPerformed(evt);
            }
        });
        add(cmbTypeOfIncident1);
        cmbTypeOfIncident1.setBounds(216, 284, 177, 27);

        lblDescription.setText("Describe the Incident:");
        add(lblDescription);
        lblDescription.setBounds(60, 317, 138, 16);

        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle3.setText("Details of the Involved Parties");
        add(lblTitle3);
        lblTitle3.setBounds(571, 120, 277, 39);

        lblVictimStudent.setText("Name of the Victim:");
        add(lblVictimStudent);
        lblVictimStudent.setBounds(570, 192, 137, 16);

        cmbVictimName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "  ", "   ", "   " }));
        cmbVictimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVictimNameActionPerformed(evt);
            }
        });
        add(cmbVictimName);
        cmbVictimName.setBounds(737, 188, 185, 27);

        lblAccusedVictim.setText("Name of the Accused:");
        add(lblAccusedVictim);
        lblAccusedVictim.setBounds(570, 225, 151, 16);

        cmbAccusedName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "   ", "  ", " " }));
        cmbAccusedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccusedNameActionPerformed(evt);
            }
        });
        add(cmbAccusedName);
        cmbAccusedName.setBounds(739, 221, 183, 27);

        lblNatureOfDiscrimination.setText("What was the nature of the discrimination?");
        add(lblNatureOfDiscrimination);
        lblNatureOfDiscrimination.setBounds(55, 419, 268, 16);

        chckRace.setText("Race");
        chckRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckRaceActionPerformed(evt);
            }
        });
        add(chckRace);
        chckRace.setBounds(272, 447, 61, 23);

        chckGender.setText("Gender");
        chckGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckGenderActionPerformed(evt);
            }
        });
        add(chckGender);
        chckGender.setBounds(351, 447, 76, 23);

        chckNationality.setText("Nationality");
        chckNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckNationalityActionPerformed(evt);
            }
        });
        add(chckNationality);
        chckNationality.setBounds(55, 505, 101, 23);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("FILE A COMPLAINT");
        add(lblTitle);
        lblTitle.setBounds(4, 39, 933, 36);

        chckPoliticalAffiliation.setText("Political Affiliation");
        chckPoliticalAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckPoliticalAffiliationActionPerformed(evt);
            }
        });
        add(chckPoliticalAffiliation);
        chckPoliticalAffiliation.setBounds(55, 476, 149, 23);

        lbDateOfIncident.setText("Date of Incident:");
        add(lbDateOfIncident);
        lbDateOfIncident.setBounds(60, 188, 116, 24);

        chckOrientation.setText("Orientation");
        chckOrientation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckOrientationActionPerformed(evt);
            }
        });
        add(chckOrientation);
        chckOrientation.setBounds(222, 476, 103, 23);

        txtDateOfIncident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateOfIncidentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateOfIncidentKeyReleased(evt);
            }
        });
        add(txtDateOfIncident);
        txtDateOfIncident.setBounds(216, 188, 183, 24);

        chckDisability.setText("Disability");
        chckDisability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckDisabilityActionPerformed(evt);
            }
        });
        add(chckDisability);
        chckDisability.setBounds(343, 476, 92, 23);

        lbTimeOfIncident.setText("Time of Incident:");
        add(lbTimeOfIncident);
        lbTimeOfIncident.setBounds(60, 221, 116, 24);

        chckParentalStatus.setText("Parental Status");
        chckParentalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckParentalStatusActionPerformed(evt);
            }
        });
        add(chckParentalStatus);
        chckParentalStatus.setBounds(129, 447, 125, 23);

        txtTimeOfIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeOfIncidentActionPerformed(evt);
            }
        });
        add(txtTimeOfIncident);
        txtTimeOfIncident.setBounds(216, 221, 183, 24);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(325, 588, 88, 29);

        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Details of the Incident");
        add(lblTitle2);
        lblTitle2.setBounds(80, 120, 277, 39);

        btnBack.setText("Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(465, 588, 94, 29);

        chckAge.setText("Age");
        chckAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckAgeActionPerformed(evt);
            }
        });
        add(chckAge);
        chckAge.setBounds(55, 447, 56, 23);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        add(jScrollPane1);
        jScrollPane1.setBounds(219, 317, 244, 84);

        lblErrorMessage.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblErrorMessage);
        lblErrorMessage.setBounds(525, 377, 234, 24);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 660);
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
        String time = txtTimeOfIncident.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        try
        {
            formatter.parse(time);
            lblErrorMessage.setText(" ");
        }
        catch (Exception e)
       {
            lblErrorMessage.setText("Invalid Time Input! ");
       }
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

        String date = txtDateOfIncident.getText();
        String time = txtTimeOfIncident.getText();
        //String type = cmbTypeOfIncident1.getName();
        String location = txtLocation.getText();
        String description = txtDescription.getText();
       
        complaint=complaintDirectory.createComplaint("Normal", victim,date, location, typeOfIncident);
        complaintDirectory.appendNormalComplaint(complaint, location, date, accused, description, reasons);
        JOptionPane.showMessageDialog(null, " Complaint registered with ID " + complaint.getComplaintID());
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtDateOfIncidentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfIncidentKeyPressed
        // TODO add your handling code here:
       // chose to go with Key Released instead so this is not needed
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
    private javax.swing.JLabel jLabel1;
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
