package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.Conexion;
import SistemaDeVacunacion.Entidades.Correo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Benítez
 */
public class Recovery extends javax.swing.JFrame {
    public static String correoRecuperacion;
    /**
     * Creates new form Recovery
     */
    public Recovery() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_recovery_correo = new javax.swing.JTextField();
        boton_enviar_correo_recu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setText("RECUPERAR CONTRASEÑA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));
        getContentPane().add(txt_recovery_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 230, 20));

        boton_enviar_correo_recu.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        boton_enviar_correo_recu.setText("Enviar correo de recuperación");
        boton_enviar_correo_recu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_enviar_correo_recuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_enviar_correo_recu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Introduzca su correo electrónico:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, 20));

        jButton2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton2.setText("<-   Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Introduzca nuevamente su correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 230, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton_enviar_correo_recuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_enviar_correo_recuActionPerformed
        if(!txt_recovery_correo.getText().equals("")){
            correoRecuperacion = txt_recovery_correo.getText();
            
            try {
                Connection cn = Conexion.getConexion();
                PreparedStatement pst = cn.prepareStatement("select email from acceso where email = '" + correoRecuperacion + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    Correo.enviarPassword();
                    dispose();
                    new Login().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Correo incorrecto", "Error de correo", 0);
                }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar el campo de email");
        }
    }//GEN-LAST:event_boton_enviar_correo_recuActionPerformed

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
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recovery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_enviar_correo_recu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_recovery_correo;
    // End of variables declaration//GEN-END:variables
}
