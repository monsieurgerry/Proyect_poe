package pub.frames;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pgVerComida extends javax.swing.JPanel {

    public pgVerComida() {
        initComponents();
        pgRegistrarComida.pila.print();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bVerTotal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        bVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 49, 55));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 183, 174));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMIDAS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 1070, 110));

        bVerTotal.setBackground(new java.awt.Color(28, 51, 132));
        bVerTotal.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bVerTotal.setForeground(new java.awt.Color(210, 223, 225));
        bVerTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1Large_gradient.png"))); // NOI18N
        bVerTotal.setText("VER TOTAL");
        bVerTotal.setBorder(null);
        bVerTotal.setBorderPainted(false);
        bVerTotal.setContentAreaFilled(false);
        bVerTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bVerTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVerTotal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1Large_gradientPressed.png"))); // NOI18N
        bVerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerTotalActionPerformed(evt);
            }
        });
        add(bVerTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 190, 60));

        jScrollPane3.setBackground(new java.awt.Color(27, 31, 37));

        Table.setBackground(new java.awt.Color(27, 31, 37));
        Table.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Table.setForeground(new java.awt.Color(188, 183, 174));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Precio", "Calorias", "Tama??o"
            }
        ));
        Table.setGridColor(new java.awt.Color(102, 102, 102));
        Table.setRequestFocusEnabled(false);
        Table.setSelectionBackground(new java.awt.Color(27, 31, 37));
        Table.setSelectionForeground(new java.awt.Color(188, 183, 174));
        jScrollPane3.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(2).setMinWidth(80);
            Table.getColumnModel().getColumn(2).setMaxWidth(80);
            Table.getColumnModel().getColumn(3).setMinWidth(120);
            Table.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 1070, 370));

        bVolver.setBackground(new java.awt.Color(28, 51, 132));
        bVolver.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bVolver.setForeground(new java.awt.Color(210, 223, 225));
        bVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1Large_gradient.png"))); // NOI18N
        bVolver.setText("VOLVER");
        bVolver.setBorder(null);
        bVolver.setBorderPainted(false);
        bVolver.setContentAreaFilled(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1Large_gradientPressed.png"))); // NOI18N
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 190, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void bVerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerTotalActionPerformed
        int total = pgRegistrarComida.pila.getNodes();
        JOptionPane.showMessageDialog(this, "Total cantidad de platillos registrados: " + total);
    }//GEN-LAST:event_bVerTotalActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
      bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pgInicio pg = new pgInicio();
      EmpleadoMenu.showPanel(pg);
      this.setVisible(false);
    }//GEN-LAST:event_bVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Table;
    private javax.swing.JButton bVerTotal;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
