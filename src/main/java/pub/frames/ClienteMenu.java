package pub.frames;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ClienteMenu extends javax.swing.JFrame {

    public static void showPg(JPanel pg) {
    pg.setSize(580,700);
    pg.setLocation(0,0);
    Content.removeAll();
    Content.add(pg, BorderLayout.CENTER);
    Content.revalidate();
    Content.repaint();
  }

  public ClienteMenu() {
    initComponents();
    setLocationRelativeTo(null);
    toggleMenu.setVisible(false);
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
        Cabeza = new javax.swing.JPanel();
        pubIcon = new javax.swing.JLabel();
        toggleButton = new javax.swing.JToggleButton();
        toggleMenu = new javax.swing.JPanel();
        btnFood = new javax.swing.JButton();
        btnBeer = new javax.swing.JButton();
        btnWine = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabeza.setBackground(new java.awt.Color(19, 119, 180));

        pubIcon.setFont(new java.awt.Font("JetBrainsMono Nerd Font Mono", 1, 48)); // NOI18N
        pubIcon.setForeground(new java.awt.Color(73, 168, 245));
        pubIcon.setText("NP");

        toggleButton.setFont(new java.awt.Font("JetBrainsMono Nerd Font Mono", 0, 48)); // NOI18N
        toggleButton.setForeground(new java.awt.Color(255, 255, 255));
        toggleButton.setText("");
        toggleButton.setActionCommand("x");
        toggleButton.setBorder(null);
        toggleButton.setBorderPainted(false);
        toggleButton.setContentAreaFilled(false);
        toggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CabezaLayout = new javax.swing.GroupLayout(Cabeza);
        Cabeza.setLayout(CabezaLayout);
        CabezaLayout.setHorizontalGroup(
            CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pubIcon)
                .addGap(14, 14, 14))
        );
        CabezaLayout.setVerticalGroup(
            CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabezaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(CabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(Cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        toggleMenu.setBackground(new java.awt.Color(19, 119, 180));

        btnFood.setBackground(new java.awt.Color(19, 119, 180));
        btnFood.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnFood.setForeground(new java.awt.Color(204, 204, 204));
        btnFood.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/burger.png")); // NOI18N
        btnFood.setText("Comidas");
        btnFood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFood.setIconTextGap(10);
        btnFood.setVerifyInputWhenFocusTarget(false);
        btnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodActionPerformed(evt);
            }
        });

        btnBeer.setBackground(new java.awt.Color(19, 119, 180));
        btnBeer.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnBeer.setForeground(new java.awt.Color(204, 204, 204));
        btnBeer.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer.png")); // NOI18N
        btnBeer.setText("Cervezas");
        btnBeer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBeer.setIconTextGap(10);
        btnBeer.setVerifyInputWhenFocusTarget(false);
        btnBeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeerActionPerformed(evt);
            }
        });

        btnWine.setBackground(new java.awt.Color(19, 119, 180));
        btnWine.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnWine.setForeground(new java.awt.Color(204, 204, 204));
        btnWine.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/wine.png")); // NOI18N
        btnWine.setText("Vinos & Licores");
        btnWine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWine.setIconTextGap(22);
        btnWine.setVerifyInputWhenFocusTarget(false);
        btnWine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWineActionPerformed(evt);
            }
        });

        btnOut.setBackground(new java.awt.Color(19, 119, 180));
        btnOut.setFont(new java.awt.Font("SF Pro Text", 0, 16)); // NOI18N
        btnOut.setForeground(new java.awt.Color(204, 204, 204));
        btnOut.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/out.png")); // NOI18N
        btnOut.setText("Salir");
        btnOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOut.setIconTextGap(20);
        btnOut.setVerifyInputWhenFocusTarget(false);
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toggleMenuLayout = new javax.swing.GroupLayout(toggleMenu);
        toggleMenu.setLayout(toggleMenuLayout);
        toggleMenuLayout.setHorizontalGroup(
            toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnWine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(toggleMenuLayout.createSequentialGroup()
                .addComponent(btnBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        toggleMenuLayout.setVerticalGroup(
            toggleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toggleMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFood, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOut)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(toggleMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 300));

        Content.setBackground(new java.awt.Color(27, 31, 37));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 168, 245));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(582, Short.MAX_VALUE))
        );

        getContentPane().add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 580, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFoodActionPerformed

    private void btnBeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeerActionPerformed
        pgClientBeer pg = new pgClientBeer();
        toggleMenu.setVisible(false);
        toggleButton.setText("");
        showPg(pg);
    }//GEN-LAST:event_btnBeerActionPerformed

    private void btnWineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWineActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
      Ingresar f = new Ingresar();
      f.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    private void toggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonActionPerformed
        if (toggleButton.isSelected()) {
            toggleButton.setText("x");
            toggleMenu.setVisible(true);
        } else {
            toggleButton.setText("");
            toggleMenu.setVisible(false);
        }
    }//GEN-LAST:event_toggleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabeza;
    public static javax.swing.JPanel Content;
    private javax.swing.JButton btnBeer;
    private javax.swing.JButton btnFood;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnWine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel pubIcon;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JPanel toggleMenu;
    // End of variables declaration//GEN-END:variables
}
