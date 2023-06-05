/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package activitysheet6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Allen James Laxamana
 */
public class StudentInformationSystem extends javax.swing.JFrame {

    /**
     * Creates new form StudentInformationSystem
     */
    public StudentInformationSystem() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblInfo = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtMidName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblMidName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblAddress = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        ckBoxBrowsing = new javax.swing.JCheckBox();
        ckBoxWatching = new javax.swing.JCheckBox();
        ckBoxChatting = new javax.swing.JCheckBox();
        ckBoxPlaying = new javax.swing.JCheckBox();
        ckBoxListening = new javax.swing.JCheckBox();
        ckBoxCooking = new javax.swing.JCheckBox();
        lblHobbies = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        cmbBoxCampus = new javax.swing.JComboBox<>();
        lblCollege = new javax.swing.JLabel();
        cmbBoxCollege = new javax.swing.JComboBox<>();
        lblProgram = new javax.swing.JLabel();
        cmbBoxProgram = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Information");

        lblInfo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblInfo.setText("Student Information");

        lblNo.setText("Student No.:");

        jLabel2.setText("Student Name:");

        lblLastName.setText("Lastname");

        lblFirstName.setText("Firstname");

        lblMidName.setText("Middlename");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        lblAddress.setText("Address:");

        lblSex.setText("Sex:");

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");

        buttonGroup1.add(btnFemale);
        btnFemale.setText("Female");

        ckBoxBrowsing.setText("Browsing Internet");

        ckBoxWatching.setText("Watching TV");

        ckBoxChatting.setText("Chatting");

        ckBoxPlaying.setText("Playing Games");

        ckBoxListening.setText("Listening to Music");

        ckBoxCooking.setText("Cooking");

        lblHobbies.setText("Hobbies:");

        lblCampus.setText("Campus:");

        cmbBoxCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABUCAY", "MAIN", "BALANGA", "ORANI", "DINALUPIHAN", "BAGAC" }));

        lblCollege.setText("College:");

        cmbBoxCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLLEGE OF AGRICULTURE AND FISHERIES", "COLLEGE OF ARTS AND SCIENCES", "COLLEGE OF BUSINESS AND ACCOUNTANCY", "COLLEGE OF EDUCATION", "COLLEGE OF ENGINEERING & ARCHITECTURE", "COLLEGE OF INDUSTRIAL TECHNOLOGY", "COLLEGE OF INFORMATION & COMMUNICATION TECHNOLOGY", "COLLEGE OF NURSING & MIDWIFERY", "COLLEGE OF TECHNICAL AND VOCATIONAL TRAINING", "COLLEGE OF SOCIAL & BEHAVIORAL SCIENCES", "GRADUATE SCHOOL" }));

        lblProgram.setText("Program:");

        cmbBoxProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGRICULTURAL ENGINEERING", "AGRICULTURE", "CROP SCIENCE", "ANIMAL SCIENCE", "FISHERIES", "HOTEL AND RESTAURANT MANAGEMENT", "TOURISM MANAGEMENT", "ACCOUNTANCY", "BUSINESS ADMINISTRATION", "HUMAN RESOURCE DEVELOPMENT MANAGEMENT", "MARKETING MANAGEMENT", "OPERATIONS MANAGEMENT", "MANAGEMENT INFORMATION SYSTEMS", "ENTREPRENEURSHIP", "ASSOCIATE IN COMPUTER SECRETARIAL", "ASSOCIATE IN COMPUTER TECHNOLOGY", "ELEMENTARY EDUCATION", "SECONDARY EDUCATION", "AGRICULTURE", "BIOLOGICAL SCIENCE", "ENGLISH", "FILIPINO", "MATHEMATICS", "MUSIC", "ARTS", "HEALTH AND PHYSICAL EDUCATION", "PHYSICAL SCIENCE", "SOCIAL STUDIES", "TECHNOLOGY AND LIVELIHOOD EDUCATION", "CERTIFICATE OF TEACHING PROGRAM", "ARCHITECTURE", "CIVIL ENGINEERING", "ELECTRICAL ENGINEERING", "ELECTRONICS ENGINEERING", "MECHANICAL ENGINEERING", "INDUSTRIAL TECHNOLOGY", "AUTOMOTIVE TECHNOLOGY", "DRAFTING TECHNOLOGY", "ELECTRICAL TECHNOLOGY", "ELECTRONICS TECHNOLOGY", "FOOD TECHNOLOGY", "MACHINE SHOP TECHNOLOGY", "WELDING AND FABRICATION TECHNOLOGY", "REFRIGERATION AND AIR CONDITIONING TECHNOLOGY", "COMPUTER SCIENCE", "NETWORK AND DATA COMMUNICATIONS", "SOFTWARE DEVELOPMENT", "INFORMATION TECHNOLOGY", "NET AND WEB APPLICATION", "ASSOCIATE IN TECHNICAL GRAPHICS", "NURSING", "MIDWIFERY", "ENGINEERING TECHNOLOGY", "ELECTRICAL ENGINEERING TECHNOLOGY", "ELECTRONICS ENGINEERING TECHNOLOGY", "MECHANICAL ENGINEERING TECHNOLOGY", "WELDING AND FABRICATION ENGINEERING TECHNOLOGY", "TWO-YEAR TRADE TECHNICIAN CURRICULUM", "CIVIL TECHNOLOGY", "DRAFTING TECHNOLOGY", "ELECTRICAL TECHNOLOGY", "GARMENTS TECHNOLOGY", "FOOD TECHNOLOGY", "FOUNDRY TECHNOLOGY", "FURNITURE AND CABINET MAKING TECHNOLOGY", "MACHINE SHOP TECHNOLOGY", "WELDING & FABRICATION TECHNOLOGY", "TECHNOLOGY", "AUTOMOTIVE TECHNOLOGY", "REFRIGERATION & AIR CONDITIONING TECHNOLOGY", "PSYCHOLOGY", "CLINICAL PSYCHOLOGY", "INDUSTRIAL PSYCHOLOGY", "DOCTOR OF EDUCATION", "EDUCATIONAL MANAGEMENT", "MASTER IN BUSINESS ADMINISTRATION", "MASTER IN ENGINEERING MANAGEMENT", "MASTER IN PUBLIC ADMINISTRATION", "MASTER IN PHYSICAL EDUCATION & SPORTS", "MASTER IN ARTS IN EDUCATION", "EDUCATIONAL MANAGEMENT", "FILIPINO", "GENERAL SCIENCE", "GUIDANCE AND COUNSELING", "LANGUAGE EDUCATION", "MATHEMATICS", "SOCIALS STUDIES", "TECHNOLOGY AND HOME ECONOMICS", "MASTER OF ARTS IN NURSING" }));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No.", "Student Name", "Program"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblLastName)
                        .addGap(93, 93, 93)
                        .addComponent(lblFirstName)
                        .addGap(91, 91, 91)
                        .addComponent(lblMidName))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCollege, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCampus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProgram)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHobbies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckBoxBrowsing, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckBoxWatching)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckBoxChatting, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckBoxCooking, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckBoxPlaying)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckBoxListening))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtMidName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMidName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName)
                            .addComponent(lblMidName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(btnMale)
                    .addComponent(btnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckBoxBrowsing)
                    .addComponent(ckBoxWatching)
                    .addComponent(ckBoxChatting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckBoxCooking)
                    .addComponent(ckBoxPlaying)
                    .addComponent(ckBoxListening)
                    .addComponent(lblHobbies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampus)
                    .addComponent(cmbBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCollege)
                    .addComponent(cmbBoxCollege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgram)
                    .addComponent(cmbBoxProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // Ensure that all the required text fields are not empty
        if (txtNo.getText().equals("") || txtLastName.getText().equals("") || txtFirstName.getText().equals("") || txtMidName.getText().equals("")) {
            // Display an error message
            JOptionPane.showMessageDialog(null, "Please fill all required fields.");
        }    
        // Add the data to the table if all fields are completed
        else {
            // Concatenate the name and store it to an array
            String fullName = txtLastName.getText() + ", " + txtFirstName.getText() + " " + txtMidName.getText();
            // Compile the data into an array
            String studentInfo[] = {txtNo.getText(), fullName, (String) cmbBoxProgram.getSelectedItem()};
            // Add the data into the table
            DefaultTableModel tblInfo = (DefaultTableModel)jTable1.getModel();
            tblInfo.addRow(studentInfo);
            // Clear the text fields
            txtAddress.setText("");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtMidName.setText("");
            txtNo.setText("");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInformationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JCheckBox ckBoxBrowsing;
    private javax.swing.JCheckBox ckBoxChatting;
    private javax.swing.JCheckBox ckBoxCooking;
    private javax.swing.JCheckBox ckBoxListening;
    private javax.swing.JCheckBox ckBoxPlaying;
    private javax.swing.JCheckBox ckBoxWatching;
    private javax.swing.JComboBox<String> cmbBoxCampus;
    private javax.swing.JComboBox<String> cmbBoxCollege;
    private javax.swing.JComboBox<String> cmbBoxProgram;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMidName;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSex;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMidName;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}