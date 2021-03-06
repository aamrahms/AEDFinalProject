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
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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

    public void checkNotNull()
      {
        if(txtDateOfIncident.getText().isEmpty() || txtTimeOfIncident.getText().isEmpty() || txtLocation.getText().isEmpty() ||txtDescription.getText().isEmpty() )
         {
             JOptionPane.showMessageDialog(null, "Please fill every field!!", "Warning", JOptionPane.WARNING_MESSAGE);

         }
        else
         {
             return;
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
        chckBodyShaming = new javax.swing.JCheckBox();
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
        lblImageUpload = new javax.swing.JLabel();
        btnUploadImage = new javax.swing.JButton();
        chckNationality1 = new javax.swing.JCheckBox();
        lblIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lbLocation.setText("Location:");
        add(lbLocation);
        lbLocation.setBounds(60, 254, 116, 24);

        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationKeyReleased(evt);
            }
        });
        add(txtLocation);
        txtLocation.setBounds(216, 254, 183, 24);

        lbTypeOfIncident.setText("Type of Incident:");
        add(lbTypeOfIncident);
        lbTypeOfIncident.setBounds(60, 284, 138, 16);

        cmbTypeOfIncident1.setBackground(new java.awt.Color(0, 153, 153));
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

        cmbVictimName.setBackground(new java.awt.Color(0, 153, 153));
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

        cmbAccusedName.setBackground(new java.awt.Color(0, 153, 153));
        cmbAccusedName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "   ", "  ", " " }));
        cmbAccusedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccusedNameActionPerformed(evt);
            }
        });
        add(cmbAccusedName);
        cmbAccusedName.setBounds(739, 221, 183, 27);

        lblNatureOfDiscrimination.setText("What was the nature of the discrimination?");
        lblNatureOfDiscrimination.setEnabled(false);
        add(lblNatureOfDiscrimination);
        lblNatureOfDiscrimination.setBounds(60, 440, 268, 16);

        chckRace.setText("Race");
        chckRace.setEnabled(false);
        chckRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckRaceActionPerformed(evt);
            }
        });
        add(chckRace);
        chckRace.setBounds(270, 460, 61, 23);

        chckGender.setText("Gender");
        chckGender.setEnabled(false);
        chckGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckGenderActionPerformed(evt);
            }
        });
        add(chckGender);
        chckGender.setBounds(350, 460, 76, 23);

        chckBodyShaming.setText("Body Shaming");
        chckBodyShaming.setEnabled(false);
        chckBodyShaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckBodyShamingActionPerformed(evt);
            }
        });
        add(chckBodyShaming);
        chckBodyShaming.setBounds(160, 520, 120, 23);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("FILE A COMPLAINT");
        add(lblTitle);
        lblTitle.setBounds(4, 39, 1070, 36);

        chckPoliticalAffiliation.setText("Political Affiliation");
        chckPoliticalAffiliation.setEnabled(false);
        chckPoliticalAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckPoliticalAffiliationActionPerformed(evt);
            }
        });
        add(chckPoliticalAffiliation);
        chckPoliticalAffiliation.setBounds(60, 490, 149, 23);

        lbDateOfIncident.setText("Date of Incident:");
        add(lbDateOfIncident);
        lbDateOfIncident.setBounds(60, 188, 116, 24);

        chckOrientation.setText("Orientation");
        chckOrientation.setEnabled(false);
        chckOrientation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckOrientationActionPerformed(evt);
            }
        });
        add(chckOrientation);
        chckOrientation.setBounds(220, 490, 103, 23);

        txtDateOfIncident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateOfIncidentKeyReleased(evt);
            }
        });
        add(txtDateOfIncident);
        txtDateOfIncident.setBounds(216, 188, 183, 24);

        chckDisability.setText("Disability");
        chckDisability.setEnabled(false);
        chckDisability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckDisabilityActionPerformed(evt);
            }
        });
        add(chckDisability);
        chckDisability.setBounds(340, 490, 92, 23);

        lbTimeOfIncident.setText("Time of Incident:");
        add(lbTimeOfIncident);
        lbTimeOfIncident.setBounds(60, 221, 116, 24);

        chckParentalStatus.setText("Parental Status");
        chckParentalStatus.setEnabled(false);
        chckParentalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckParentalStatusActionPerformed(evt);
            }
        });
        add(chckParentalStatus);
        chckParentalStatus.setBounds(130, 460, 125, 23);

        txtTimeOfIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeOfIncidentActionPerformed(evt);
            }
        });
        txtTimeOfIncident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimeOfIncidentKeyReleased(evt);
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
        btnSubmit.setBounds(510, 580, 88, 29);

        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Details of the Incident");
        add(lblTitle2);
        lblTitle2.setBounds(80, 120, 277, 39);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setText("< Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(0, 10, 108, 29);

        chckAge.setBackground(new java.awt.Color(255, 51, 51));
        chckAge.setText("Age");
        chckAge.setEnabled(false);
        chckAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckAgeActionPerformed(evt);
            }
        });
        add(chckAge);
        chckAge.setBounds(60, 460, 56, 23);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        add(jScrollPane1);
        jScrollPane1.setBounds(219, 317, 244, 84);

        lblErrorMessage.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        add(lblErrorMessage);
        lblErrorMessage.setBounds(100, 580, 260, 30);

        lblImageUpload.setEnabled(false);
        add(lblImageUpload);
        lblImageUpload.setBounds(740, 296, 160, 120);

        btnUploadImage.setBackground(new java.awt.Color(0, 153, 153));
        btnUploadImage.setText("Upload Image");
        btnUploadImage.setEnabled(false);
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });
        add(btnUploadImage);
        btnUploadImage.setBounds(560, 290, 130, 29);

        chckNationality1.setText("Nationality");
        chckNationality1.setEnabled(false);
        chckNationality1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckNationality1ActionPerformed(evt);
            }
        });
        add(chckNationality1);
        chckNationality1.setBounds(60, 520, 101, 23);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ADD_LIST_LOGO.png"))); // NOI18N
        add(lblIcon);
        lblIcon.setBounds(410, 20, 40, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyReleased
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

    }//GEN-LAST:event_txtLocationKeyReleased

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

                lblNatureOfDiscrimination.setEnabled(true);
                chckAge.setEnabled(true);
                chckBodyShaming.setEnabled(true);
                chckDisability.setEnabled(true);
                chckGender.setEnabled(true);
                chckOrientation.setEnabled(true);
                chckNationality1.setEnabled(true);
                chckParentalStatus.setEnabled(true);
                chckPoliticalAffiliation.setEnabled(true);
                chckRace.setEnabled(true);
                btnUploadImage.setEnabled(false);

            }
            else if ("Plaigiarism".equals(org))
            {
                typeOfIncident="Plaigiarism";
                chckRace.setEnabled(false);
                lblNatureOfDiscrimination.setEnabled(false);
                chckAge.setEnabled(false);
                chckBodyShaming.setEnabled(false);
                chckDisability.setEnabled(false);
                chckGender.setEnabled(false);
                chckOrientation.setEnabled(false);
                chckNationality1.setEnabled(false);
                chckParentalStatus.setEnabled(false);
                chckPoliticalAffiliation.setEnabled(false);
                btnUploadImage.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cmbTypeOfIncident1ActionPerformed

    private void cmbVictimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVictimNameActionPerformed
        // TODO add your handling code here:

        victimIndex = cmbVictimName.getSelectedIndex();
        victim=system.getStudentDirectory().getStudentDir().get(victimIndex);

    }//GEN-LAST:event_cmbVictimNameActionPerformed

    private void cmbAccusedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccusedNameActionPerformed
        // TODO add your handling code here:

        accusedIndex = cmbAccusedName.getSelectedIndex();
        accused=system.getStudentDirectory().getStudentDir().get(accusedIndex);//getStudentDirectory().getStudentDir().get(accusedIndex);

    }//GEN-LAST:event_cmbAccusedNameActionPerformed

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

    private void chckBodyShamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckBodyShamingActionPerformed
        // TODO add your handling code here:

        if(chckBodyShaming.isEnabled())
        {
            reasons += " Nationality ";
        }
    }//GEN-LAST:event_chckBodyShamingActionPerformed

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
            lblErrorMessage.setText(" Invalid Date Input! ");
        }

    }//GEN-LAST:event_txtDateOfIncidentKeyReleased

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

    private void txtTimeOfIncidentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeOfIncidentKeyReleased
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
            lblErrorMessage.setText(" Invalid Time Input! Type in a 12 hour format!");
        }
    }//GEN-LAST:event_txtTimeOfIncidentKeyReleased

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        checkNotNull();

    }//GEN-LAST:event_btnSubmitActionPerformed

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

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
        // TODO add your handling code here:

        JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("Select Your File");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = filechooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File file = filechooser.getSelectedFile();
            BufferedImage bi;
            BufferedImage img = null;
            try
            {
                // display the image in a Jlabel
                bi = ImageIO.read(file);

                Image dimg = bi.getScaledInstance(lblImageUpload.getWidth(),lblImageUpload.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(dimg);
                lblImageUpload.setIcon(icon);
                // complaint.setPicture(icon);
                // 1. add private ImageIcon picture in complaints
                // 2. then add setters and getters in there
                // 3. then uncomment it here
                // 4. add " lblImageUpload.setIcon(person.getPicture()); "
                //    where you want it to display  where there is a label with the same label name
                //

            } catch(IOException e)
            {
                e.printStackTrace(); // todo: implement proper error handeling
            }
        }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private void chckNationality1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckNationality1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chckNationality1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JCheckBox chckAge;
    private javax.swing.JCheckBox chckBodyShaming;
    private javax.swing.JCheckBox chckDisability;
    private javax.swing.JCheckBox chckGender;
    private javax.swing.JCheckBox chckNationality1;
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
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblImageUpload;
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
