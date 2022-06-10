package pub.frames;

import pub.frames.pgInicio;
import pub.frames.pgRegistrarBebida;

public class pgClientBeer extends javax.swing.JPanel {

    public static int[] contador = new int[6];
    public String[] beerName = {
        "Corona",
        "Victoria",
        "Pacifico",
        "Modelo",
        "Miller",
        "Heineken"
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
        txtContador3.setText("");
        txtContador4.setText("");
        txtContador5.setText("");
    }

    public pgClientBeer() {
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
        img3 = new javax.swing.JLabel();
        txtName3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        txtName4 = new javax.swing.JLabel();
        txtContador3 = new javax.swing.JLabel();
        txtContador4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        txtName5 = new javax.swing.JLabel();
        txtContador5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        btnMinus1 = new javax.swing.JButton();
        btnPlus1 = new javax.swing.JButton();
        btnMinus2 = new javax.swing.JButton();
        btnPlus2 = new javax.swing.JButton();
        btnMinus3 = new javax.swing.JButton();
        btnPlus3 = new javax.swing.JButton();
        btnMinus4 = new javax.swing.JButton();
        btnPlus4 = new javax.swing.JButton();
        btnMinus5 = new javax.swing.JButton();
        btnPlus5 = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbPedir = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 31, 37));
        setPreferredSize(new java.awt.Dimension(580, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_corona.png")); // NOI18N
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 150));

        btnMinus.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus.setText("");
        btnMinus.setBorder(null);
        btnMinus.setBorderPainted(false);
        btnMinus.setContentAreaFilled(false);
        btnMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus.setFocusPainted(false);
        btnMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        add(btnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 40));

        btnPlus.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus.setText("");
        btnPlus.setBorder(null);
        btnPlus.setBorderPainted(false);
        btnPlus.setContentAreaFilled(false);
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus.setFocusPainted(false);
        btnPlus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 40, 40));

        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Victoria 355ml");
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 100, -1));

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_victoria.png")); // NOI18N
        add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 50, 150));

        txtName1.setForeground(new java.awt.Color(204, 204, 204));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("Corona extra 355ml");
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, -1));

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

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_pacifico.png")); // NOI18N
        add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 50, 150));

        txtName2.setForeground(new java.awt.Color(204, 204, 204));
        txtName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName2.setText("Pacifico 355ml");
        add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 100, -1));

        txtContador2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador2.setForeground(new java.awt.Color(73, 168, 245));
        txtContador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 30, 15));

        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_modelo.png")); // NOI18N
        add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 60, 150));

        txtName3.setForeground(new java.awt.Color(204, 204, 204));
        txtName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName3.setText("Miller 945ml");
        add(txtName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 100, -1));

        img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img4.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_miller.png")); // NOI18N
        add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 50, 150));

        txtName4.setForeground(new java.awt.Color(204, 204, 204));
        txtName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName4.setText("Modelo especial 355ml");
        add(txtName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, -1));

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

        img5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img5.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer_heineken.png")); // NOI18N
        add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 50, 150));

        txtName5.setForeground(new java.awt.Color(204, 204, 204));
        txtName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName5.setText("Heineken 355ml");
        add(txtName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 120, -1));

        txtContador5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtContador5.setForeground(new java.awt.Color(73, 168, 245));
        txtContador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtContador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 30, 15));

        txtTitulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(188, 183, 174));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("CERVEZAS");
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 40));

        btnMinus1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus1.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus1.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus1.setText("");
        btnMinus1.setBorder(null);
        btnMinus1.setBorderPainted(false);
        btnMinus1.setContentAreaFilled(false);
        btnMinus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus1.setFocusPainted(false);
        btnMinus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus1.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1ActionPerformed(evt);
            }
        });
        add(btnMinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 40));

        btnPlus1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus1.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus1.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus1.setText("");
        btnPlus1.setBorder(null);
        btnPlus1.setBorderPainted(false);
        btnPlus1.setContentAreaFilled(false);
        btnPlus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus1.setFocusPainted(false);
        btnPlus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus1.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1ActionPerformed(evt);
            }
        });
        add(btnPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 40, 40));

        btnMinus2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus2.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus2.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus2.setText("");
        btnMinus2.setBorder(null);
        btnMinus2.setBorderPainted(false);
        btnMinus2.setContentAreaFilled(false);
        btnMinus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus2.setFocusPainted(false);
        btnMinus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus2.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus2ActionPerformed(evt);
            }
        });
        add(btnMinus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 40, 40));

        btnPlus2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus2.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus2.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus2.setText("");
        btnPlus2.setBorder(null);
        btnPlus2.setBorderPainted(false);
        btnPlus2.setContentAreaFilled(false);
        btnPlus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus2.setFocusPainted(false);
        btnPlus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus2.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus2ActionPerformed(evt);
            }
        });
        add(btnPlus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 40, 40));

        btnMinus3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus3.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus3.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus3.setText("");
        btnMinus3.setBorder(null);
        btnMinus3.setBorderPainted(false);
        btnMinus3.setContentAreaFilled(false);
        btnMinus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus3.setFocusPainted(false);
        btnMinus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus3.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus3ActionPerformed(evt);
            }
        });
        add(btnMinus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 40, 40));

        btnPlus3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus3.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus3.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus3.setText("");
        btnPlus3.setBorder(null);
        btnPlus3.setBorderPainted(false);
        btnPlus3.setContentAreaFilled(false);
        btnPlus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus3.setFocusPainted(false);
        btnPlus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus3.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus3ActionPerformed(evt);
            }
        });
        add(btnPlus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 40, 40));

        btnMinus4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus4.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus4.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus4.setText("");
        btnMinus4.setBorder(null);
        btnMinus4.setBorderPainted(false);
        btnMinus4.setContentAreaFilled(false);
        btnMinus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus4.setFocusPainted(false);
        btnMinus4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus4.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus4ActionPerformed(evt);
            }
        });
        add(btnMinus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 40, 40));

        btnPlus4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus4.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus4.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus4.setText("");
        btnPlus4.setBorder(null);
        btnPlus4.setBorderPainted(false);
        btnPlus4.setContentAreaFilled(false);
        btnPlus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus4.setFocusPainted(false);
        btnPlus4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus4.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus4ActionPerformed(evt);
            }
        });
        add(btnPlus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 40, 40));

        btnMinus5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMinus5.setForeground(new java.awt.Color(73, 168, 245));
        btnMinus5.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnMinus5.setText("");
        btnMinus5.setBorder(null);
        btnMinus5.setBorderPainted(false);
        btnMinus5.setContentAreaFilled(false);
        btnMinus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinus5.setFocusPainted(false);
        btnMinus5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus5.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnMinus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus5ActionPerformed(evt);
            }
        });
        add(btnMinus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 40, 40));

        btnPlus5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnPlus5.setForeground(new java.awt.Color(73, 168, 245));
        btnPlus5.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradient.png")); // NOI18N
        btnPlus5.setText("");
        btnPlus5.setBorder(null);
        btnPlus5.setBorderPainted(false);
        btnPlus5.setContentAreaFilled(false);
        btnPlus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus5.setFocusPainted(false);
        btnPlus5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus5.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn2_gradientPressed.png")); // NOI18N
        btnPlus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus5ActionPerformed(evt);
            }
        });
        add(btnPlus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 40, 40));

        jbBorrar.setBackground(new java.awt.Color(28, 51, 132));
        jbBorrar.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(200, 229, 228));
        jbBorrar.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1_gradient.png")); // NOI18N
        jbBorrar.setText("BORRAR");
        jbBorrar.setBorder(null);
        jbBorrar.setBorderPainted(false);
        jbBorrar.setContentAreaFilled(false);
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBorrar.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1_gradientPressed.png")); // NOI18N
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 110, 50));

        jbPedir.setBackground(new java.awt.Color(28, 51, 132));
        jbPedir.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        jbPedir.setForeground(new java.awt.Color(220, 229, 228));
        jbPedir.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1_gradient.png")); // NOI18N
        jbPedir.setText("PEDIR");
        jbPedir.setBorder(null);
        jbPedir.setBorderPainted(false);
        jbPedir.setContentAreaFilled(false);
        jbPedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPedir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPedir.setRolloverIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/btn1_gradientPressed.png")); // NOI18N
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

    private void btnPlus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus3ActionPerformed
        contador[3]++;
        txtContador3.setText(Integer.toString(contador[3]));
    }//GEN-LAST:event_btnPlus3ActionPerformed

    private void btnPlus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus4ActionPerformed
        contador[4]++;
        txtContador4.setText(Integer.toString(contador[4]));
    }//GEN-LAST:event_btnPlus4ActionPerformed

    private void btnPlus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus5ActionPerformed
        contador[5]++;
        txtContador5.setText(Integer.toString(contador[5]));
    }//GEN-LAST:event_btnPlus5ActionPerformed

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
            txtContador.setText(Integer.toString(contador[1]));
        } else {
            txtContador.setText(Integer.toString(contador[1]));
        }
    }//GEN-LAST:event_btnMinus1ActionPerformed

    private void btnMinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus2ActionPerformed
        if (contador[2] > 0) {
            contador[2]--;
            txtContador.setText(Integer.toString(contador[2]));
        } else {
            txtContador.setText(Integer.toString(contador[2]));
        }
    }//GEN-LAST:event_btnMinus2ActionPerformed

    private void btnMinus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus3ActionPerformed
        if (contador[3] > 0) {
            contador[3]--;
            txtContador.setText(Integer.toString(contador[3]));
        } else {
            txtContador.setText(Integer.toString(contador[3]));
        }
    }//GEN-LAST:event_btnMinus3ActionPerformed

    private void btnMinus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus4ActionPerformed
        if (contador[4] > 0) {
            contador[4]--;
            txtContador.setText(Integer.toString(contador[4]));
        } else {
            txtContador.setText(Integer.toString(contador[4]));
        }
    }//GEN-LAST:event_btnMinus4ActionPerformed

    private void btnMinus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus5ActionPerformed
        if (contador[5] > 0) {
            contador[5]--;
            txtContador.setText(Integer.toString(contador[5]));
        } else {
            txtContador.setText(Integer.toString(contador[5]));
        }
    }//GEN-LAST:event_btnMinus5ActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        limpiarContador();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedirActionPerformed
        for (int i=0; i<contador.length; i++) {
            if (contador[i] > 0) {
                name = beerName[i];
                stock = pgRegistrarBebida.beer.getBeerStock(name);
                System.out.println(stock);
                dismunirStock = stock-contador[i];
                System.out.println(name+dismunirStock);
            }
        }
        pgRegistrarBebida.beer.setBeerStock(dismunirStock, name);
        limpiarContador(); // NOTA: Antes de limpiar hacer el pedido
        Mensaje.setText("Su pedido fue enviado satisfactoriamente!");
    }//GEN-LAST:event_jbPedirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMinus1;
    private javax.swing.JButton btnMinus2;
    private javax.swing.JButton btnMinus3;
    private javax.swing.JButton btnMinus4;
    private javax.swing.JButton btnMinus5;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlus1;
    private javax.swing.JButton btnPlus2;
    private javax.swing.JButton btnPlus3;
    private javax.swing.JButton btnPlus4;
    private javax.swing.JButton btnPlus5;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
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
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
