package pub.frames;

import pub.frames.pgInicio;
import pub.frames.pgRegistrarBebida;

public class pgClientFood extends javax.swing.JPanel {

    public static int[] contador = new int[3];
    public String[] beerName = {
        "Hamburguesa",
        "Alitas",
        "Papas francesa"
    };
    public int[] precio = {
        42,
        110,
        25,
        32
    };
    private int total=0;

    private void limpiarContador() {
        for (int i=0; i<contador.length; i++) {
            contador[i] = 0;
        }
        total=0;
        txPrecio.setText("0");
        txtContador.setText("");
        txtContador1.setText("");
        txtContador2.setText("");
        txtContador3.setText("");
    }

    public pgClientFood() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        txtName = new javax.swing.JLabel();
        txtName1 = new javax.swing.JLabel();
        txtContador = new javax.swing.JLabel();
        txtContador1 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JLabel();
        txtContador2 = new javax.swing.JLabel();
        txtName4 = new javax.swing.JLabel();
        txtContador3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        btnMinus1 = new javax.swing.JButton();
        btnPlus1 = new javax.swing.JButton();
        btnMinus2 = new javax.swing.JButton();
        btnPlus2 = new javax.swing.JButton();
        btnMinus3 = new javax.swing.JButton();
        btnPlus3 = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbPedir = new javax.swing.JButton();
        txtName6 = new javax.swing.JLabel();
        txtName7 = new javax.swing.JLabel();
        txtName8 = new javax.swing.JLabel();
        txtName9 = new javax.swing.JLabel();
        txPrecio = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 31, 37));
        setPreferredSize(new java.awt.Dimension(580, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food_wings.png"))); // NOI18N
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 130, 150));

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
        add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 40));

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
        add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 40, 40));

        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Alitas BBQ (10pz)");
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, -1));

        txtName1.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName1.setForeground(new java.awt.Color(102, 102, 102));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("$ 25");
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 130, -1));

        txtContador.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador.setForeground(new java.awt.Color(73, 168, 245));
        txtContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 30, 15));

        txtContador1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador1.setForeground(new java.awt.Color(73, 168, 245));
        txtContador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 30, 15));

        txtName2.setForeground(new java.awt.Color(204, 204, 204));
        txtName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName2.setText("Papas a la francesa");
        add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, -1));

        txtContador2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador2.setForeground(new java.awt.Color(73, 168, 245));
        txtContador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 30, 15));

        txtName4.setForeground(new java.awt.Color(204, 204, 204));
        txtName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName4.setText("Papas gajo");
        add(txtName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 150, -1));

        txtContador3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador3.setForeground(new java.awt.Color(73, 168, 245));
        txtContador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 30, 15));

        txtTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(188, 183, 174));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("CERVEZAS");
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 40));

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
        add(btnMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 40));

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
        add(btnPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 40, 40));

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
        add(btnMinus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 40, 40));

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
        add(btnPlus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 40, 40));

        btnMinus3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus3.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnMinus3.setText("");
        btnMinus3.setBorder(null);
        btnMinus3.setBorderPainted(false);
        btnMinus3.setContentAreaFilled(false);
        btnMinus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus3.setFocusPainted(false);
        btnMinus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnMinus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus3ActionPerformed(evt);
            }
        });
        add(btnMinus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 40, 40));

        btnPlus3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus3.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradient.png"))); // NOI18N
        btnPlus3.setText("");
        btnPlus3.setBorder(null);
        btnPlus3.setBorderPainted(false);
        btnPlus3.setContentAreaFilled(false);
        btnPlus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus3.setFocusPainted(false);
        btnPlus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_gradientPressed.png"))); // NOI18N
        btnPlus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus3ActionPerformed(evt);
            }
        });
        add(btnPlus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 40, 40));

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

        txtName6.setForeground(new java.awt.Color(204, 204, 204));
        txtName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName6.setText("Hamburguesa clasica");
        add(txtName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, -1));

        txtName7.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName7.setForeground(new java.awt.Color(102, 102, 102));
        txtName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName7.setText("$ 42");
        add(txtName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, -1));

        txtName8.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName8.setForeground(new java.awt.Color(102, 102, 102));
        txtName8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName8.setText("$ 110");
        add(txtName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 130, -1));

        txtName9.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        txtName9.setForeground(new java.awt.Color(102, 102, 102));
        txtName9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName9.setText("$ 32");
        add(txtName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 130, -1));

        txPrecio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txPrecio.setForeground(new java.awt.Color(153, 153, 153));
        txPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txPrecio.setText("0");
        add(txPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 40, -1));

        txtTotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtTotal.setText("Total:");
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, -1, -1));

        Mensaje.setFont(new java.awt.Font("JetBrainsMono NF", 0, 16)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(0, 153, 0));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 260, 20));

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food_burger.png"))); // NOI18N
        add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 150));

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food_gajo.png"))); // NOI18N
        add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, 150));

        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food_francesa.png"))); // NOI18N
        add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 130, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        contador[0]++;
        txtContador.setText(Integer.toString(contador[0]));
        total+=precio[0];
        txPrecio.setText(Integer.toString(total));
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1ActionPerformed
        contador[1]++;
        txtContador1.setText(Integer.toString(contador[1]));
        total+=precio[1];
        txPrecio.setText(Integer.toString(total));
    }//GEN-LAST:event_btnPlus1ActionPerformed

    private void btnPlus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus2ActionPerformed
        contador[2]++;
        txtContador2.setText(Integer.toString(contador[2]));
        total+=precio[2];
        txPrecio.setText(Integer.toString(total));
    }//GEN-LAST:event_btnPlus2ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (contador[0] > 0) {
            contador[0]--;
            txtContador.setText(Integer.toString(contador[0]));
            total-=precio[0];
            txPrecio.setText(Integer.toString(total));
        } else {
            txtContador.setText(Integer.toString(contador[0]));
            txPrecio.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1ActionPerformed
        if (contador[1] > 0) {
            contador[1]--;
            txtContador1.setText(Integer.toString(contador[1]));
            total-=precio[1];
            txPrecio.setText(Integer.toString(total));
        } else {
            txtContador1.setText(Integer.toString(contador[1]));
            txPrecio.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_btnMinus1ActionPerformed

    private void btnMinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus2ActionPerformed
        if (contador[2] > 0) {
            contador[2]--;
            txtContador2.setText(Integer.toString(contador[2]));
            total-=precio[2];
            txPrecio.setText(Integer.toString(total));
        } else {
            txtContador2.setText(Integer.toString(contador[2]));
            txPrecio.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_btnMinus2ActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        limpiarContador();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedirActionPerformed
        limpiarContador(); // NOTA: Antes de limpiar hacer el pedido
        Mensaje.setText("Su pedido fue recibido!");
    }//GEN-LAST:event_jbPedirActionPerformed

    private void btnPlus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus3ActionPerformed
        contador[3]++;
        txtContador3.setText(Integer.toString(contador[3]));
        total+=precio[3];
        txPrecio.setText(Integer.toString(total));
    }//GEN-LAST:event_btnPlus3ActionPerformed

    private void btnMinus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus3ActionPerformed
        if (contador[3] > 0) {
            contador[3]--;
            txtContador3.setText(Integer.toString(contador[3]));
            total-=precio[3];
            txPrecio.setText(Integer.toString(total));
        } else {
            txtContador3.setText(Integer.toString(contador[3]));
            txPrecio.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_btnMinus3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMinus1;
    private javax.swing.JButton btnMinus2;
    private javax.swing.JButton btnMinus3;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlus1;
    private javax.swing.JButton btnPlus2;
    private javax.swing.JButton btnPlus3;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbPedir;
    private javax.swing.JLabel txPrecio;
    private javax.swing.JLabel txtContador;
    private javax.swing.JLabel txtContador1;
    private javax.swing.JLabel txtContador2;
    private javax.swing.JLabel txtContador3;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtName1;
    private javax.swing.JLabel txtName2;
    private javax.swing.JLabel txtName4;
    private javax.swing.JLabel txtName6;
    private javax.swing.JLabel txtName7;
    private javax.swing.JLabel txtName8;
    private javax.swing.JLabel txtName9;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
