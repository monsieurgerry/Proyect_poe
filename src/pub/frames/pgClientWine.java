package pub.frames;

import pub.frames.pgInicio;
import pub.frames.pgRegistrarBebida;

public class pgClientWine extends javax.swing.JPanel {

    public static int[] contador = new int[3];
    public String[] botellas = {
        "Don Julio",
        "Casa Madero",
        "Jim Beam",
    };
    private int dismunirStock, stock;
    private String name;

    private void limpiarContador() {
        for (int i=0; i<contador.length; i++) {
            contador[i] = 0;
        }
        txtContador.setText("");
        txtContador1.setText("");
        txtContador2.setText("");
    }

    public pgClientWine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        txtName = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JLabel();
        txtContador = new javax.swing.JLabel();
        txtContador1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JLabel();
        txtContador2 = new javax.swing.JLabel();
        txtContador3 = new javax.swing.JLabel();
        txtContador4 = new javax.swing.JLabel();
        txtContador5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        btnMinus1 = new javax.swing.JButton();
        btnPlus1 = new javax.swing.JButton();
        btnMinus2 = new javax.swing.JButton();
        btnPlus2 = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbPedir = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        txtName3 = new javax.swing.JLabel();
        txtName4 = new javax.swing.JLabel();
        txtName5 = new javax.swing.JLabel();
        txtName6 = new javax.swing.JLabel();
        txtName7 = new javax.swing.JLabel();
        txtName8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 31, 37));
        setPreferredSize(new java.awt.Dimension(580, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wine_donJulio.png"))); // NOI18N
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 170));

        btnMinus.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnMinus.setText("");
        btnMinus.setBorder(null);
        btnMinus.setBorderPainted(false);
        btnMinus.setContentAreaFilled(false);
        btnMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus.setFocusPainted(false);
        btnMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 40, 40));

        btnPlus.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnPlus.setText("");
        btnPlus.setBorder(null);
        btnPlus.setBorderPainted(false);
        btnPlus.setContentAreaFilled(false);
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus.setFocusPainted(false);
        btnPlus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, 40));

        txtName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Casa Madero 3V");
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 130, -1));

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wine_casaMadero.png"))); // NOI18N
        add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 170));

        txtName1.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName1.setForeground(new java.awt.Color(102, 102, 102));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("WHISKY");
        txtName1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 130, -1));

        txtContador.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador.setForeground(new java.awt.Color(73, 168, 245));
        txtContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 30, 15));

        txtContador1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador1.setForeground(new java.awt.Color(73, 168, 245));
        txtContador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 30, 15));

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wine_jimBeam.png"))); // NOI18N
        add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 50, 170));

        txtName2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName2.setForeground(new java.awt.Color(204, 204, 204));
        txtName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName2.setText("Jim Beam");
        add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 110, -1));

        txtContador2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador2.setForeground(new java.awt.Color(73, 168, 245));
        txtContador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 30, 15));

        txtContador3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador3.setForeground(new java.awt.Color(73, 168, 245));
        txtContador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 30, 15));

        txtContador4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador4.setForeground(new java.awt.Color(73, 168, 245));
        txtContador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 30, 15));

        txtContador5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador5.setForeground(new java.awt.Color(73, 168, 245));
        txtContador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 30, 15));

        txtTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(188, 183, 174));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("VINOS & LICORES");
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 550, 40));

        btnMinus1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus1.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnMinus1.setText("");
        btnMinus1.setBorder(null);
        btnMinus1.setBorderPainted(false);
        btnMinus1.setContentAreaFilled(false);
        btnMinus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus1.setFocusPainted(false);
        btnMinus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1ActionPerformed(evt);
            }
        });
        add(btnMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 40, 40));

        btnPlus1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus1.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnPlus1.setText("");
        btnPlus1.setBorder(null);
        btnPlus1.setBorderPainted(false);
        btnPlus1.setContentAreaFilled(false);
        btnPlus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus1.setFocusPainted(false);
        btnPlus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1ActionPerformed(evt);
            }
        });
        add(btnPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 40, 40));

        btnMinus2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus2.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnMinus2.setText("");
        btnMinus2.setBorder(null);
        btnMinus2.setBorderPainted(false);
        btnMinus2.setContentAreaFilled(false);
        btnMinus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus2.setFocusPainted(false);
        btnMinus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnMinus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus2ActionPerformed(evt);
            }
        });
        add(btnMinus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 40, 40));

        btnPlus2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus2.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnPlus2.setText("");
        btnPlus2.setBorder(null);
        btnPlus2.setBorderPainted(false);
        btnPlus2.setContentAreaFilled(false);
        btnPlus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus2.setFocusPainted(false);
        btnPlus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnPlus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus2ActionPerformed(evt);
            }
        });
        add(btnPlus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 40, 40));

        jbBorrar.setBackground(new java.awt.Color(28, 51, 132));
        jbBorrar.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(200, 229, 228));
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_gradient.png"))); // NOI18N
        jbBorrar.setText("BORRAR");
        jbBorrar.setBorder(null);
        jbBorrar.setBorderPainted(false);
        jbBorrar.setContentAreaFilled(false);
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_gradientPressed.png"))); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 110, 50));

        jbPedir.setBackground(new java.awt.Color(28, 51, 132));
        jbPedir.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        jbPedir.setForeground(new java.awt.Color(220, 229, 228));
        jbPedir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_gradient.png"))); // NOI18N
        jbPedir.setText("PEDIR");
        jbPedir.setBorder(null);
        jbPedir.setBorderPainted(false);
        jbPedir.setContentAreaFilled(false);
        jbPedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPedir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPedir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_gradientPressed.png"))); // NOI18N
        jbPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedirActionPerformed(evt);
            }
        });
        add(jbPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 110, 50));

        Mensaje.setFont(new java.awt.Font("JetBrainsMono NF", 0, 10)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(0, 153, 0));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 260, 40));

        txtName3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtName3.setForeground(new java.awt.Color(204, 204, 204));
        txtName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName3.setText("Don Julio 70");
        txtName3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, -1));

        txtName4.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName4.setForeground(new java.awt.Color(102, 102, 102));
        txtName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName4.setText("TEQUILA");
        txtName4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, -1));

        txtName5.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName5.setForeground(new java.awt.Color(102, 102, 102));
        txtName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName5.setText("VINO TINTO");
        txtName5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 130, -1));

        txtName6.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        txtName6.setForeground(new java.awt.Color(102, 102, 102));
        txtName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName6.setText("$ 1100");
        txtName6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, -1));

        txtName7.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        txtName7.setForeground(new java.awt.Color(102, 102, 102));
        txtName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName7.setText("$ 500");
        txtName7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 130, -1));

        txtName8.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        txtName8.setForeground(new java.awt.Color(102, 102, 102));
        txtName8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName8.setText("$ 350");
        txtName8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        contador[0]++;
        txtContador.setText(Integer.toString(contador[0]));
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1ActionPerformed
        contador[1]++;
        txtContador1.setText(Integer.toString(contador[1]));
    }//GEN-LAST:event_btnPlus1ActionPerformed

    private void btnPlus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus2ActionPerformed
        contador[2]++;
        txtContador2.setText(Integer.toString(contador[2]));
    }//GEN-LAST:event_btnPlus2ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (contador[0] > 0) {
            contador[0]--;
            txtContador.setText(Integer.toString(contador[0]));
        } else {
            txtContador.setText(Integer.toString(contador[0]));
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1ActionPerformed
        if (contador[1] > 0) {
            contador[1]--;
            txtContador1.setText(Integer.toString(contador[1]));
        } else {
            txtContador1.setText(Integer.toString(contador[1]));
        }
    }//GEN-LAST:event_btnMinus1ActionPerformed

    private void btnMinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus2ActionPerformed
        if (contador[2] > 0) {
            contador[2]--;
            txtContador2.setText(Integer.toString(contador[2]));
        } else {
            txtContador2.setText(Integer.toString(contador[2]));
        }
    }//GEN-LAST:event_btnMinus2ActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        limpiarContador();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedirActionPerformed
        for (int i=0; i<contador.length; i++) {
            if (contador[i] > 0) {
                name = botellas[i];
                stock = pgRegistrarBebida.wine.getWineStock(name);
                if (stock <= 0) {
                    Mensaje.setText("No hay stock disponible");
                } else {
                    dismunirStock = stock-contador[i];
                }
            }
        }
        pgRegistrarBebida.wine.setWineStock(dismunirStock, name);
        limpiarContador(); // NOTA: Antes de limpiar hacer el pedido
        Mensaje.setText("Su pedido fue enviado satisfactoriamente!");
    }//GEN-LAST:event_jbPedirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMinus1;
    private javax.swing.JButton btnMinus2;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlus1;
    private javax.swing.JButton btnPlus2;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbPedir;
    private javax.swing.JLabel txtContador;
    private javax.swing.JLabel txtContador1;
    private javax.swing.JLabel txtContador2;
    private javax.swing.JLabel txtContador3;
    private javax.swing.JLabel txtContador4;
    private javax.swing.JLabel txtContador5;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtName1;
    private javax.swing.JLabel txtName2;
    private javax.swing.JLabel txtName3;
    private javax.swing.JLabel txtName4;
    private javax.swing.JLabel txtName5;
    private javax.swing.JLabel txtName6;
    private javax.swing.JLabel txtName7;
    private javax.swing.JLabel txtName8;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
