
package SistemaDeVacunacion.Vistas;

import SistemaDeVacunacion.Conexiones.CentroData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Vacuna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import SistemaDeVacunacion.Conexiones.CitaData;
import SistemaDeVacunacion.Entidades.Centro;
import SistemaDeVacunacion.Entidades.Cita;



public class ListCentroEspecifico extends javax.swing.JFrame {
    
    private CitaData ciData;
    private DefaultTableModel modelo;

    CentroData cd = new CentroData();
    Centro centro = new Centro();
    
    
    public ListCentroEspecifico() {
        initComponents();
        cargarJCcentros();
        modelo = new DefaultTableModel();
        ciData = new CitaData();
        armarCabecera();
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
        jbVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JCcentros = new javax.swing.JComboBox<>();
        jbConsultar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 75, 94));
        jLabel1.setText("VACUNADOS POR CENTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jbVolver.setBackground(new java.awt.Color(15, 75, 94));
        jbVolver.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("<-  Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 46, 121, 39));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione el centro: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 215, -1, -1));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vacunas aplicadas", "Numero de serie", "DNI ciudadano receptor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 610, 240));

        JCcentros.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        JCcentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCcentrosActionPerformed(evt);
            }
        });
        getContentPane().add(JCcentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 200, 30));

        jbConsultar.setBackground(new java.awt.Color(15, 75, 94));
        jbConsultar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeVacunacion/Vistas/Fondo app.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
        new EstadisticasListado().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jbVolverActionPerformed

    private void JCcentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCcentrosActionPerformed

    
  
    }//GEN-LAST:event_JCcentrosActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        borrarFilaTabla();
        cargaDatosVacunados();
       
    }//GEN-LAST:event_jbConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ListCentroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCentroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCentroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCentroEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCentroEspecifico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Centro> JCcentros;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables

      private void cargarJCcentros (){
            JCcentros.removeAllItems();
            List <Centro> centros = new ArrayList<>();

      if (  "CABA".equals(Login.user)){
          centros = cd.listarCentrosXProvincia("Ciudad Autónoma de Buenos Aires");
        for (Centro centro: centros){
            JCcentros.addItem(centro);
        }
      }else{
        centros = cd.listarCentrosXProvincia(Login.user);
        for (Centro centro: centros){
            JCcentros.addItem(centro);
              } 
       }
    }
    
        private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            modelo.removeRow(i); 
        }
    }  
        
        private void armarCabecera(){
            ArrayList<Object> filaCabecera = new ArrayList<>();
            filaCabecera.add("DNI");
            filaCabecera.add("Vacuna");
            filaCabecera.add("N° Serie");
            for( Object it: filaCabecera) {
                modelo.addColumn(it);
            }
            jTable1.setModel(modelo);
        }
        
        private void cargaDatosVacunados() {
            Centro selec = (Centro) JCcentros.getSelectedItem();
            List<Cita> lista = ciData.obtenerVacunadosXCentro(selec.getId());
            for (Cita a: lista) {
                modelo.addRow(new Object[]{a.getDni(),a.getVacuna().getMarca(),a.getnSerie()});
            }
        }
}