package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.VacunaData;
import SistemaDeVacunacion.Entidades.Vacuna;

public class Vacunas extends javax.swing.JFrame {

    VacunaData vd = new VacunaData();
    Vacuna vac = new Vacuna();

    public Vacunas() {
        initComponents();
        setSize(800, 629);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDosis = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtCentro = new javax.swing.JTextField();
        jtAntigeno = new javax.swing.JTextField();
        jtFechaCad = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 75, 94));
        jLabel2.setText("CARGA DE VACUNAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Dosis:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Marca comercial:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Centro de vacunación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setText("Antígeno:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Fecha de caducidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jtDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDosisActionPerformed(evt);
            }
        });
        getContentPane().add(jtDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 248, -1));
        getContentPane().add(jtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 248, -1));
        getContentPane().add(jtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 248, -1));

        jtAntigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAntigenoActionPerformed(evt);
            }
        });
        getContentPane().add(jtAntigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 248, -1));
        getContentPane().add(jtFechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 248, -1));

        jbGuardar.setBackground(new java.awt.Color(15, 75, 94));
        jbGuardar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jbModificar.setBackground(new java.awt.Color(15, 75, 94));
        jbModificar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jbEliminar.setBackground(new java.awt.Color(15, 75, 94));
        jbEliminar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtAntigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAntigenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAntigenoActionPerformed

    private void jtDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDosisActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
    }//GEN-LAST:event_jbGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacunas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtAntigeno;
    private javax.swing.JTextField jtCentro;
    private javax.swing.JTextField jtDosis;
    private javax.swing.JTextField jtFechaCad;
    private javax.swing.JTextField jtMarca;
    // End of variables declaration//GEN-END:variables
}
