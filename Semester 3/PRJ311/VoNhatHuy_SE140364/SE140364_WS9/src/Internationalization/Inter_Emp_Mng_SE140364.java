/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Internationalization;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Henry
 */
public class Inter_Emp_Mng_SE140364 extends javax.swing.JFrame {

    static String language;
    static String country;
    ResourceBundle resource;

    /**
     * Creates new form Inter_Emp_Mng
     */
    public Inter_Emp_Mng_SE140364(String language, String country) {
        initComponents();
        this.setSize(450, 400);
        this.language = language;
        this.country = country;
        setUpGUI();
    }

    private void setUpGUI() {
        Locale currentLocale;
        currentLocale = new Locale(language, country);
        String base = "Internationalization.ResourceFiles/Resources";
        resource = ResourceBundle.getBundle(base, currentLocale);
        this.setTitle(resource.getString("prgTitle"));
        lbCode.setText(resource.getString("lbCode"));
        lbName.setText(resource.getString("lbName"));
        lbSex.setText(resource.getString("lbSex"));
        rdMale.setText(resource.getString("rdMale"));
        rdFemale.setText(resource.getString("rdFemale"));
        lbAge.setText(resource.getString("lbAge"));
        btnOK.setText(resource.getString("btnOK"));
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
        lbCode = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbCode.setText("Code:");
        getContentPane().add(lbCode);
        lbCode.setBounds(10, 15, 29, 20);

        lbName.setText("Name");
        getContentPane().add(lbName);
        lbName.setBounds(10, 85, 27, 14);

        lbSex.setText("Sex");
        getContentPane().add(lbSex);
        lbSex.setBounds(10, 145, 18, 14);

        lbAge.setText("Age");
        getContentPane().add(lbAge);
        lbAge.setBounds(10, 188, 36, 30);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(151, 240, 103, 23);
        getContentPane().add(txtCode);
        txtCode.setBounds(64, 11, 71, 28);
        getContentPane().add(txtName);
        txtName.setBounds(64, 77, 278, 30);
        getContentPane().add(txtAge);
        txtAge.setBounds(64, 185, 120, 30);

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");
        getContentPane().add(rdMale);
        rdMale.setBounds(64, 136, 84, 23);

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(rdFemale);
        rdFemale.setBounds(195, 136, 84, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemaleActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        int age = Integer.parseInt(txtAge.getText());
        if (age < 18 || age > 70) {
            String title = resource.getString("msgTitle");
            String msg = resource.getString("Error");
            JOptionPane.showMessageDialog(this, msg, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(Inter_Emp_Mng_SE140364.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inter_Emp_Mng_SE140364.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inter_Emp_Mng_SE140364.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inter_Emp_Mng_SE140364.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inter_Emp_Mng_SE140364(language, country).setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSex;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}