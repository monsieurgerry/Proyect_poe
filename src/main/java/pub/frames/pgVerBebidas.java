package pub.frames;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pgVerBebidas extends javax.swing.JPanel {

    public pgVerBebidas() {
        initComponents();
        pgRegistrarBebida.beer.printBeer();
        pgRegistrarBebida.wine.printWine();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bVerTotal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        wineTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        beerTable = new javax.swing.JTable();
        imgWine = new javax.swing.JLabel();
        imgBeer = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(27, 31, 37));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 183, 174));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEBIDAS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 110));

        bVerTotal.setBackground(new java.awt.Color(28, 51, 132));
        bVerTotal.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bVerTotal.setForeground(new java.awt.Color(210, 223, 225));
        bVerTotal.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1Large_gradient.png")); // NOI18N
        bVerTotal.setText("VER TOTAL");
        bVerTotal.setBorder(null);
        bVerTotal.setBorderPainted(false);
        bVerTotal.setContentAreaFilled(false);
        bVerTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVerTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVerTotal.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1Large_gradientPressed.png")); // NOI18N
        bVerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerTotalActionPerformed(evt);
            }
        });
        add(bVerTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 190, 60));

        jScrollPane2.setBackground(new java.awt.Color(27, 31, 37));

        wineTable.setBackground(new java.awt.Color(27, 31, 37));
        wineTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        wineTable.setForeground(new java.awt.Color(188, 183, 174));
        wineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Cantidad", "Tamaño", "%", "Tipo de alcohol", "Pais de origen"
            }
        ));
        wineTable.setGridColor(new java.awt.Color(102, 102, 102));
        wineTable.setSelectionBackground(new java.awt.Color(27, 31, 37));
        wineTable.setSelectionForeground(new java.awt.Color(188, 183, 174));
        jScrollPane2.setViewportView(wineTable);
        if (wineTable.getColumnModel().getColumnCount() > 0) {
            wineTable.getColumnModel().getColumn(2).setMinWidth(80);
            wineTable.getColumnModel().getColumn(2).setMaxWidth(80);
            wineTable.getColumnModel().getColumn(3).setMinWidth(120);
            wineTable.getColumnModel().getColumn(3).setMaxWidth(120);
            wineTable.getColumnModel().getColumn(4).setMinWidth(60);
            wineTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 1070, 160));

        jScrollPane3.setBackground(new java.awt.Color(27, 31, 37));

        beerTable.setBackground(new java.awt.Color(27, 31, 37));
        beerTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        beerTable.setForeground(new java.awt.Color(188, 183, 174));
        beerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Cantidad", "Volumen", "%", "Estilo", "Envace"
            }
        ));
        beerTable.setGridColor(new java.awt.Color(102, 102, 102));
        beerTable.setRequestFocusEnabled(false);
        beerTable.setSelectionBackground(new java.awt.Color(27, 31, 37));
        beerTable.setSelectionForeground(new java.awt.Color(188, 183, 174));
        jScrollPane3.setViewportView(beerTable);
        if (beerTable.getColumnModel().getColumnCount() > 0) {
            beerTable.getColumnModel().getColumn(2).setMinWidth(80);
            beerTable.getColumnModel().getColumn(2).setMaxWidth(80);
            beerTable.getColumnModel().getColumn(3).setMinWidth(120);
            beerTable.getColumnModel().getColumn(3).setMaxWidth(120);
            beerTable.getColumnModel().getColumn(4).setMinWidth(60);
            beerTable.getColumnModel().getColumn(4).setMaxWidth(60);
            beerTable.getColumnModel().getColumn(6).setMinWidth(80);
            beerTable.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 1070, 160));

        imgWine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wine_bottle.png"))); // NOI18N
        imgWine.setText("jLabel2");
        add(imgWine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 50, 80));

        imgBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beer.png"))); // NOI18N
        imgBeer.setText("jLabel2");
        add(imgBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 50, 50));

        bVolver.setBackground(new java.awt.Color(28, 51, 132));
        bVolver.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bVolver.setForeground(new java.awt.Color(210, 223, 225));
        bVolver.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1Large_gradient.png")); // NOI18N
        bVolver.setText("VOLVER");
        bVolver.setBorder(null);
        bVolver.setBorderPainted(false);
        bVolver.setContentAreaFilled(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVolver.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1Large_gradientPressed.png")); // NOI18N
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 190, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void bVerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerTotalActionPerformed
        int totalBeers = pgRegistrarBebida.beer.getNodes();
        int totalWine = pgRegistrarBebida.wine.getNodes();
        int total = totalBeers + totalWine;
        total--;
        JOptionPane.showMessageDialog(this, "Total tipo de bebidas en inventario: " + total);
    }//GEN-LAST:event_bVerTotalActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
      bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pgInicio pg = new pgInicio();
      EmpleadoMenu.showPanel(pg);
      this.setVisible(false);
    }//GEN-LAST:event_bVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVerTotal;
    private javax.swing.JButton bVolver;
    public static javax.swing.JTable beerTable;
    private javax.swing.JLabel imgBeer;
    private javax.swing.JLabel imgWine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable wineTable;
    // End of variables declaration//GEN-END:variables
}
