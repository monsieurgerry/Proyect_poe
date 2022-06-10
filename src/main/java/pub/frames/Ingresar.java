package pub.frames;

import pub.User;

import java.awt.Color;

public class Ingresar extends javax.swing.JFrame {

  public class Pila {
    private User pila;
    public boolean find = false;

    public Pila() {
      pila = null;
    }

    public void push(String u, String p) {
      User nuevo = new User(u,p);
      if (pila == null) {
        pila = nuevo;
      } else {
        User aux = pila;
        pila = nuevo;
        nuevo.setNext(aux);
      }
    } //push

    public void recorrer() {
      User aux = pila;
      if (pila == null) {
        Mensaje.setText("No existen usuarios");
      } else {
        while (aux != null) {
          aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
    } //recorrer

    public void search(String u, String p) {
      User aux = pila;
      while (aux.getNext() != null) {
        if (u.contains(aux.getUsername()) && p.contains(aux.getPassword())) {
          find = true;
          break;
        }
        aux = aux.getNext();
      }
    }
  }

  public Pila pila = new Pila();
  public Ingresar() {
    initComponents();
    setLocationRelativeTo(null);
    pila = new Pila();
    // pgRegistrarBebida.bebida.pushBeer("Corona", "Grupo Modelo", 200, 355, (float)4.5, "Pilsener", true);
    // bebida.pushWine();
    pila.push("victor", "123"); // TODO: no se agrega como el resto.
    pila.push("gerardo", "123");
    pila.push("david", "123");
    pila.push("nahomy", "123");
    pila.push("cliente", "1");
    pila.push("admin", "admin");
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        textUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textPass = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jpPass = new javax.swing.JPasswordField();
        jbIngresar = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        iconLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 31, 37));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(188, 183, 174));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("INICIAR SESION");

        jtUsuario.setBackground(new java.awt.Color(27, 31, 37));
        jtUsuario.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jtUsuario.setText("Ingrese su nombre de usuario");
        jtUsuario.setBorder(null);
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });

        textUsuario.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(188, 183, 174));
        textUsuario.setText("USUARIO");

        jSeparator1.setForeground(new java.awt.Color(73, 168, 245));

        textPass.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        textPass.setForeground(new java.awt.Color(188, 183, 174));
        textPass.setText("CONTRASEÑA");

        jSeparator2.setForeground(new java.awt.Color(73, 168, 245));

        jpPass.setBackground(new java.awt.Color(27, 31, 37));
        jpPass.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jpPass.setForeground(new java.awt.Color(102, 102, 102));
        jpPass.setText("jPasswordField1");
        jpPass.setBorder(null);
        jpPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPassFocusGained(evt);
            }
        });
        jpPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPassMousePressed(evt);
            }
        });

        jbIngresar.setBackground(new java.awt.Color(28, 51, 132));
        jbIngresar.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("INGRESAR");
        jbIngresar.setBorder(null);
        jbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        Mensaje.setFont(new java.awt.Font("FreeSans", 0, 10)); // NOI18N

        iconLog.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/login.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(iconLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPass)
                            .addComponent(jSeparator2)
                            .addComponent(jpPass, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(textUsuario)
                            .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(textUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        String Pass = new String(jpPass.getPassword());
        pila.search(jtUsuario.getText(), Pass);
        if (pila.find == true) {
            if (jtUsuario.getText().equals("cliente")) {
                jbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                ClienteMenu client = new ClienteMenu();
                client.setVisible(true);
                this.setVisible(false);
            } else {
                jbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                EmpleadoMenu empleado = new EmpleadoMenu();
                empleado.setVisible(true);
                this.setVisible(false);
            }
        } else {
            Mensaje.setForeground(new java.awt.Color(204, 0, 0));
            Mensaje.setText("Usuario o contrasena incorrectos.");
        }
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
        jtUsuario.setText("");
        jtUsuario.setForeground(Color.white);
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jpPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPassMousePressed
        jpPass.setText("");
        jpPass.setForeground(Color.white);
    }//GEN-LAST:event_jpPassMousePressed

    private void jpPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusGained
        jpPass.setText("");
        jpPass.setForeground(Color.white);
    }//GEN-LAST:event_jpPassFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        pgRegistrarBebida.bebida.pushBeer("Corona", "Grupo Modelo", 200, 355, (float)4.5, "Pilsener", true);
        pgRegistrarBebida.bebida.pushBeer("Victoria", "Grupo Modelo", 150, 355, (float)4, "Ambar", true);
        pgRegistrarBebida.bebida.pushBeer("Modelo", "Grupo Modelo", 70, 355, (float)4.5, "American Pilsener", false);
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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel iconLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JLabel textPass;
    private javax.swing.JLabel textUsuario;
    // End of variables declaration//GEN-END:variables
}
