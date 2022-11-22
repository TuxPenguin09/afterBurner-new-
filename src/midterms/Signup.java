/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package midterms;

/**
 *
 * @author Blaise
 */

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JTextField;
public class Signup extends javax.swing.JFrame {
    int positionX = 0;
    int positionY = 0;
    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        addPlaceHolderStyle(firstName);
        addPlaceHolderStyle(email);
        addPlaceHolderStyle(password);
        addPlaceHolderStyle(confirmPassword);
    }
    
     public void addPlaceHolderStyle(JTextField textField){
        textField.setForeground(Color.gray);
    }
    public void removePlaceHolderStyle(JTextField textField){
        textField.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUp = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUp.setFont(new java.awt.Font("Oswald Medium", 0, 24)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUp.setText("SIGN UP");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        getContentPane().add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 400, 70));

        firstName.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstName.setText("Username");
        firstName.setBorder(null);
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 380, 50));

        email.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setText("Email");
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 370, 50));

        password.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setText("Password");
        password.setBorder(null);
        password.setEchoChar('\u0000');
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 370, 40));

        confirmPassword.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        confirmPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        confirmPassword.setText("Confirm Password");
        confirmPassword.setBorder(null);
        confirmPassword.setEchoChar('\u0000');
        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusLost(evt);
            }
        });
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 370, 50));

        jLabel2.setFont(new java.awt.Font("Oswald SemiBold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midterms/Pictures/signup(v2).jpg"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained

    if(firstName.getText().equals("First Name")){ 
        firstName.setText(null);
        firstName.requestFocus();
        removePlaceHolderStyle(firstName);
    }
    }//GEN-LAST:event_firstNameFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained

    if(email.getText().equals("Email")){ 
        email.setText(null);
        email.requestFocus();
        removePlaceHolderStyle(email);
    }
    }//GEN-LAST:event_emailFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained

    if(password.getText().equals("Password")){ 
        password.setText(null);
        password.requestFocus();
        removePlaceHolderStyle(password);
        password.setEchoChar('\u2022');
        removePlaceHolderStyle(password);
    }
    }//GEN-LAST:event_passwordFocusGained

    private void confirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusGained

    if(confirmPassword.getText().equals("Confirm Password")){ 
        confirmPassword.setText(null);
        confirmPassword.requestFocus();
        removePlaceHolderStyle(confirmPassword);
        confirmPassword.setEchoChar('\u2022');
        removePlaceHolderStyle(confirmPassword);     
    }
    }//GEN-LAST:event_confirmPasswordFocusGained

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost

    if(firstName.getText().length()==0){
        addPlaceHolderStyle(firstName);
        firstName.setText("First Name");         
        }
        
    }//GEN-LAST:event_firstNameFocusLost

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost

        if(email.getText().length()==0){
            addPlaceHolderStyle(email);
            email.setText("Email");         
        }
    }//GEN-LAST:event_emailFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost

        if(password.getText().length()==0){
            addPlaceHolderStyle(password);
            password.setText("Password");  
            password.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passwordFocusLost

    private void confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusLost

        if(confirmPassword.getText().length()==0){
            addPlaceHolderStyle(confirmPassword);
            confirmPassword.setText("Confirm Password");     
            confirmPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_confirmPasswordFocusLost

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained

        this.requestFocusInWindow();
    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

       mainmenu jf1 = new mainmenu();
       jf1.show();
       dispose();
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(Color.decode("#F8931F"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        setState(Signup.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        // TODO add your handling code here:
        if (password == confirmPassword) {
            // INSERT INTO `accounts` (`id`, `username`, `email`, `password`) VALUES (NULL, 'Username', 'Email', 'Password');
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/afterburner","root","");
                String sql = "INSERT INTO `accounts` (`id`, `username`, `email`, `password`) VALUES (NULL, ?, ?, ?);";
                
                PreparedStatement psmt = conn.prepareStatement(sql);
           
                psmt.setString(1, firstName.getText());
                psmt.setString(2, email.getText());
                psmt.setString(3, String.valueOf(password.getPassword()));
         
                psmt.executeUpdate();
                System.out.println("Account created successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Password not matched with Confirm Password");
        }
    }//GEN-LAST:event_signUpMouseClicked
    
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel signUp;
    // End of variables declaration//GEN-END:variables
}
