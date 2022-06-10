package pub.frames;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class EmpleadoMenu extends javax.swing.JFrame {

  public static void showPanel(JPanel pg) {
    pg.setSize(1200,720);
    pg.setLocation(0,0);
    Background.removeAll();
    Background.add(pg, BorderLayout.CENTER);
    Background.revalidate();
    Background.repaint();
  }

  public EmpleadoMenu() {
    initComponents();
    setLocationRelativeTo(null);
    pgInicio inicio = new pgInicio();
    showPanel(inicio);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Background = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEmpleados = new javax.swing.JMenu();
        empleadoRegistrar = new javax.swing.JMenuItem();
        empleadoVer = new javax.swing.JMenuItem();
        menuBebidas = new javax.swing.JMenu();
        bebidasRegistrar = new javax.swing.JMenuItem();
        bebidasVer = new javax.swing.JMenuItem();
        menuComidas = new javax.swing.JMenu();
        comidaRegistrar = new javax.swing.JMenuItem();
        comidaVer = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Background.setBackground(new java.awt.Color(27, 31, 37));
        Background.setPreferredSize(new java.awt.Dimension(1200, 720));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        menuEmpleados.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/user.png")); // NOI18N
        menuEmpleados.setText("Empleados");

        empleadoRegistrar.setText("Registrar");
        empleadoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoRegistrarActionPerformed(evt);
            }
        });
        menuEmpleados.add(empleadoRegistrar);

        empleadoVer.setText("Ver");
        empleadoVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoVerActionPerformed(evt);
            }
        });
        menuEmpleados.add(empleadoVer);

        jMenuBar1.add(menuEmpleados);

        menuBebidas.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/drinks.png")); // NOI18N
        menuBebidas.setText("Bebidas");

        bebidasRegistrar.setText("Registrar");
        bebidasRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasRegistrarActionPerformed(evt);
            }
        });
        menuBebidas.add(bebidasRegistrar);

        bebidasVer.setText("Ver");
        bebidasVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasVerActionPerformed(evt);
            }
        });
        menuBebidas.add(bebidasVer);

        jMenuBar1.add(menuBebidas);

        menuComidas.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/food.png")); // NOI18N
        menuComidas.setText("Comidas");

        comidaRegistrar.setText("Registrar");
        comidaRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidaRegistrarActionPerformed(evt);
            }
        });
        menuComidas.add(comidaRegistrar);

        comidaVer.setText("Ver");
        comidaVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidaVerActionPerformed(evt);
            }
        });
        menuComidas.add(comidaVer);

        jMenuBar1.add(menuComidas);

        menuOpciones.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/settings.png")); // NOI18N
        menuOpciones.setText("Opciones");

        logout.setText("Cerrar sesion");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menuOpciones.add(logout);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comidaRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidaRegistrarActionPerformed
      // pgRegistrarComida pg = new pgRegistrarComida();
      // showPanel(pg);
    }//GEN-LAST:event_comidaRegistrarActionPerformed

    private void empleadoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoRegistrarActionPerformed
      pgRegistrarEmpleado pg = new pgRegistrarEmpleado();
      showPanel(pg);
    }//GEN-LAST:event_empleadoRegistrarActionPerformed

    private void empleadoVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoVerActionPerformed
      pgVerEmpleado pg = new pgVerEmpleado();
      showPanel(pg);
    }//GEN-LAST:event_empleadoVerActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
      Ingresar f = new Ingresar();
      f.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void bebidasRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasRegistrarActionPerformed
      pgRegistrarBebida pg = new pgRegistrarBebida();
      showPanel(pg);
    }//GEN-LAST:event_bebidasRegistrarActionPerformed

    private void bebidasVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasVerActionPerformed
      pgVerBebidas pg = new pgVerBebidas();
      showPanel(pg);
    }//GEN-LAST:event_bebidasVerActionPerformed

    private void comidaVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidaVerActionPerformed
      // pgVerComida pg = new pgVerComida();
      // showPanel(pg);
    }//GEN-LAST:event_comidaVerActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Background;
    private javax.swing.JMenuItem bebidasRegistrar;
    private javax.swing.JMenuItem bebidasVer;
    private javax.swing.JMenuItem comidaRegistrar;
    private javax.swing.JMenuItem comidaVer;
    private javax.swing.JMenuItem empleadoRegistrar;
    private javax.swing.JMenuItem empleadoVer;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menuBebidas;
    private javax.swing.JMenu menuComidas;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuOpciones;
    // End of variables declaration//GEN-END:variables
}
