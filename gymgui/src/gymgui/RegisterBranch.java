/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Niro Computers
 */
public class RegisterBranch extends javax.swing.JDialog {

    /**
     * Creates new form RegisterBranch
     */
    public RegisterBranch(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        mgr_sex = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        branch_loc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        branch_date = new com.toedter.calendar.JDateChooser();
        discard_regE_btn = new javax.swing.JButton();
        registerE_btn1 = new javax.swing.JButton();
        clr_regE_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mgr_lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        m_mgr = new javax.swing.JRadioButton();
        f_mgr = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        mgr_dob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        mgr_fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mgr_phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mgr_address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Register a New Branch Data");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter the location of the new branch:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Choose the date this branch opened:");

        branch_date.setDateFormatString("yyyy/MM/dd");

        discard_regE_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_regE_btn.setText("Back");
        discard_regE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_regE_btnActionPerformed(evt);
            }
        });

        registerE_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerE_btn1.setText("Register");
        registerE_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerE_btn1ActionPerformed(evt);
            }
        });

        clr_regE_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_regE_btn.setText("Reset");
        clr_regE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_regE_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter the new manager information");

        mgr_lname.setText("Last name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Enter the manager's sex:");

        mgr_sex.add(m_mgr);
        m_mgr.setSelected(true);
        m_mgr.setText("Male");
        m_mgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_mgrActionPerformed(evt);
            }
        });

        mgr_sex.add(f_mgr);
        f_mgr.setText("Female");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter the manager's date of birth:");

        mgr_dob.setDateFormatString("yyyy/MM/dd");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Enter the full name:");

        mgr_fname.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Enter manager's phone number:");

        mgr_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgr_phoneActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Enter manager's address:");

        mgr_address.setColumns(20);
        mgr_address.setLineWrap(true);
        mgr_address.setRows(5);
        mgr_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mgr_addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(mgr_address);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(branch_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(branch_date, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerE_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(clr_regE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(discard_regE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgr_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mgr_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mgr_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_mgr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f_mgr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mgr_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(branch_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(branch_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mgr_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgr_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_mgr)
                    .addComponent(f_mgr)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(mgr_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mgr_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr_regE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_regE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerE_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discard_regE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discard_regE_btnActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
    }//GEN-LAST:event_discard_regE_btnActionPerformed

    private void registerE_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerE_btn1ActionPerformed
        // TODO add your handling code here:
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
            conn  = new DBConnection();
            Connection db = conn.getDB();
            String branch_query = "INSERT INTO branch(blocation, bstart_date) VALUES(\" "+ branch_loc.getText() + " \", \" " + dateFormat.format(branch_date.getDate())+ " \");"; 
            String mgr_query = "INSERT INTO employee(efname, elname, edob, esex, estart_date, edep,ephone, eaddress, ebranch) VALUES(?,?,?,?,?,?,?,?,?)";
            String dep_query = "INSERT INTO department(dept_name, dept_branch) VALUES(?,?);";

            PreparedStatement  branch_stmt = db.prepareStatement(branch_query);

            branch_stmt.executeUpdate();
            branch_stmt.close();
            try{
                ResultSet new_id = db.createStatement().executeQuery("SELECT bid FROM branch WHERE ISNULL(mgr_id);");
            new_id.next();
            String br_id = new_id.getString("bid");
                
            PreparedStatement dep_stmt = db.prepareStatement(dep_query);
            dep_stmt.setString(1, "Executives and Heads");
            dep_stmt.setString(2, br_id);
            dep_stmt.executeUpdate();
            dep_stmt.setString(1, "Instructors/Trainers");
            dep_stmt.setString(2, br_id);
            dep_stmt.executeUpdate();
            dep_stmt.setString(1, "Health and Paramedics");
            dep_stmt.setString(2, br_id);
            dep_stmt.executeUpdate();
            dep_stmt.setString(1, "Human Resources");
            dep_stmt.setString(2, br_id);
            dep_stmt.executeUpdate();
            dep_stmt.setString(1, "Others");
            dep_stmt.setString(2, br_id);
            dep_stmt.executeUpdate();
            dep_stmt.close();
            
  
            PreparedStatement mgr_stmt = db.prepareStatement(mgr_query);
            mgr_stmt.setString(1, mgr_fname.getText());
            mgr_stmt.setString(2, mgr_lname.getText());
            mgr_stmt.setString(3, dateFormat.format(branch_date.getDate()));
            mgr_stmt.setString(4, (m_mgr.isSelected())? "M" : "F" );
            mgr_stmt.setString(5, dateFormat.format(branch_date.getDate()));
            mgr_stmt.setString(6, "Executives and Heads");
            mgr_stmt.setString(7, mgr_phone.getText());
            mgr_stmt.setString(8, mgr_address.getText());
           
            
            mgr_stmt.setString(9, br_id);
                                        System.out.println(mgr_stmt.toString());

            mgr_stmt.executeUpdate();
              javax.swing.JOptionPane.showMessageDialog(rootPane, "Branch is now registered sucessfully!");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
            }
            catch(Exception e){
            PreparedStatement del_branch_stmnt = db.prepareStatement("DELETE FROM branch WHERE ISNULL(mgr_id);");
            del_branch_stmnt.executeUpdate();
                        del_branch_stmnt.close();
            throw e;
            

            }
          
            
        }
        catch(Exception e){ 
            if(e.toString().contains("NullPointer"))javax.swing.JOptionPane.showMessageDialog(rootPane, "All fields are required.");
            else if(e.toString().contains("dob_constraint"))javax.swing.JOptionPane.showMessageDialog(rootPane, "Manager is not old enough.");
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Unknown error occured.");
            
            
        
        
                }
        
    }//GEN-LAST:event_registerE_btn1ActionPerformed

    private void clr_regE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_regE_btnActionPerformed
        // TODO add your handling code here:
        mgr_fname.setText("");
        mgr_lname.setText("");
        Date TODAY = new Date();
        mgr_dob.setDate(TODAY);
        
        mgr_phone.setText("");
        mgr_address.setText("");
    }//GEN-LAST:event_clr_regE_btnActionPerformed

    private void m_mgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_mgrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_mgrActionPerformed

    private void mgr_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgr_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgr_phoneActionPerformed

    private void mgr_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mgr_addressKeyTyped
        // TODO add your handling code here:
        if(mgr_address.getText().length()>=15){}
    }//GEN-LAST:event_mgr_addressKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterBranch dialog = new RegisterBranch(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser branch_date;
    private javax.swing.JTextField branch_loc;
    private javax.swing.JButton clr_regE_btn;
    private javax.swing.JButton discard_regE_btn;
    private javax.swing.JRadioButton f_mgr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m_mgr;
    private javax.swing.JTextArea mgr_address;
    private com.toedter.calendar.JDateChooser mgr_dob;
    private javax.swing.JTextField mgr_fname;
    private javax.swing.JTextField mgr_lname;
    private javax.swing.JTextField mgr_phone;
    private javax.swing.ButtonGroup mgr_sex;
    private javax.swing.JButton registerE_btn1;
    // End of variables declaration//GEN-END:variables
    private DBConnection conn;

}
