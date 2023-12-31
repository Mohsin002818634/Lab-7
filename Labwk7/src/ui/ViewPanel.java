/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import model.User;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.DatabaseConnector;


/**
 
 * @author abdulmohsin
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private ArrayList<User> users;
    private User selectedUser;
    public ViewPanel(User newUser){
        initComponents();
        populateTable();
    }
   /* private Patient newPatient;
    public ViewPanel(Patient newPatient) {
        initComponents();
        this.newPatient = newPatient;
        populateData();
        setImage();
    } */

//    ViewPanel(Object object) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        firstnameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        savePatient = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));
        mainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Beirut", 2, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Patient Registration Form");

        firstName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        firstName.setText("Name :");

        age.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        age.setText("Age :");

        firstnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextActionPerformed(evt);
            }
        });

        savePatient.setText("SAVE");
        savePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePatientActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(firstName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(age)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(editBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteBtn))
                                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(savePatient)))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName))
                        .addGap(38, 38, 38)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age))
                        .addGap(32, 32, 32)
                        .addComponent(savePatient)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editBtn)
                            .addComponent(deleteBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextActionPerformed

    private void savePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePatientActionPerformed
        User newUser = new User();
        try {
            newUser.setName(firstnameText.getText());
            newUser.setAge(ageText.getText());
           DatabaseConnector.editUser(selectedUser, newUser);
           JOptionPane.showMessageDialog(null, "User registered");
           clearFields();
           populateTable();
        }catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_savePatientActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       int selectedIndex = userTable.getSelectedRow();
       if(selectedIndex == -1){
           JOptionPane.showMessageDialog(this, "Please select");
           return;
       }
       try{
           selectedUser = users.get(selectedIndex);
           DatabaseConnector.deleteUser(selectedUser);
           JOptionPane.showMessageDialog(null, "User Deleted");
           clearFields();
           populateTable();
       }catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
     int selectedIndex = userTable.getSelectedRow();
     if(selectedIndex == -1) {
         JOptionPane.showMessageDialog(this, "Please select");
         return;
     }
     selectedUser = users.get(selectedIndex);
     firstnameText.setText(selectedUser.getName());
     ageText.setText(selectedUser.getAge());
    }//GEN-LAST:event_editBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton savePatient;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
  try{
      this.users = DatabaseConnector.getAllusers();
      DefaultTableModel model = (DefaultTableModel) userTable.getModel();
      model.setRowCount(0);
      for(User u : users) {
          Object[] row = new Object[3];
          row[0] = u.getId();
          row[1] = u.getName();
          row[2] = u.getAge();
          model.addRow(row);
      } 
      clearFields();
  } catch (Exception e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
  }
    
    }

    private void clearFields() {
        firstnameText.setText("");
        ageText.setText("");
        selectedUser = null;
        

    }
}

  
