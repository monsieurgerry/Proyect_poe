package pub.frames;

import pub.Cerveza;
import pub.VinosLicores;
import javax.swing.table.DefaultTableModel;

public class pgRegistrarBebida extends javax.swing.JPanel {

  public static class Pila {

    int beerStock;
    String envace;
    boolean find = false;

    Cerveza beer;
    VinosLicores wine;
    private int cantNodos;

    public Pila() {
      beer = null;
      wine = null;
      cantNodos=0;
    }

    public void pushBeer(String n, String m, int c, int t, float a, String s, boolean e) { // Agregar cervezas
      Cerveza nuevo = new Cerveza();
      nuevo.setNombre(n);
      nuevo.setMarca(m);
      nuevo.setCantidad(c);
      nuevo.setTamano(t);
      nuevo.setAlcohol(a);
      nuevo.setEstilo(s);
      nuevo.setEnvace(e);
      if (beer == null) {
        beer = nuevo;
      } else {
        Cerveza aux = beer;
        beer = nuevo;
        nuevo.setNext(aux);
      }
      cantNodos++;
    } //push

    public String[] printBeer() { // Agregar cervezas a Tabla
      Cerveza aux = beer;
      String[] data = new String[100];
      if (beer == null) {
        System.out.println("No existen cervezas registradas");
      } else {
        while (aux != null) {
            if (aux.necesitaEnvace() == true) {
                envace = "si";
            } else {
                envace = "no";
            }
            data = new String[]{aux.getNombre(),aux.getMarca(),Integer.toString(aux.getCantidad()),
                Integer.toString(aux.getTamano()),Float.toString(aux.getAlcohol()),aux.getEstilo(),
                envace};

            DefaultTableModel tabla = (DefaultTableModel)pgVerBebidas.beerTable.getModel();
            tabla.addRow(data);
            aux = aux.getNext(); // Avanzar al sig nodo

        }
      }
      return data;
    } //recorrer

    public void popBeer() { // Eliminar cervezas
      Cerveza aux = beer;
      if (beer == null) {
        System.out.println("No existen cervezas registradas");
      } else {
        if (aux.getNext() == null) { // Si el siguiente es null solo hay 1
          beer = null;
        } else {
          beer = aux.getNext(); // Sino se elimina el primero
        }
      }
      cantNodos--;
    }

    public void pushWine(String n, String m, int c, int t, float a, String b, String o) { // Agregar botellas
      VinosLicores nuevo = new VinosLicores();
      nuevo.setNombre(n);
      nuevo.setMarca(m);
      nuevo.setCantidad(c);
      nuevo.setTamano(t);
      nuevo.setAlcohol(a);
      nuevo.setTipoBotella(b);
      nuevo.setOrigen(o);
      if (wine == null) {
        wine = nuevo;
      } else {
        VinosLicores aux = wine;
        wine = nuevo;
        nuevo.setNext(aux);
      }
      cantNodos++;
    } //push

    public String[] printWine() { // Agregar botellas a tabla
      VinosLicores aux = wine;
      String[] data = new String[100];
      if (wine == null) {
        System.out.println("No existen botellas registradas");
      } else {
        while (aux != null) {
            data = new String[]{aux.getNombre(),aux.getMarca(),Integer.toString(aux.getCantidad()),
                Integer.toString(aux.getTamano()),Float.toString(aux.getAlcohol()),aux.getTipoBotella(),
                aux.getOrigen()};

            DefaultTableModel tabla = (DefaultTableModel)pgVerBebidas.wineTable.getModel();
            tabla.addRow(data);
            aux = aux.getNext(); // Avanzar al sig nodo

        }
      }
      return data;
    } //recorrer

    public void popWine() { // Eliminar primera botella en pila
      VinosLicores aux = wine;
      if (wine == null) {
        System.out.println("No existen botellas registradas");
      } else {
        if (aux.getNext() == null) { // Si el siguiente es null solo hay 1
          wine = null;
        } else {
          wine = aux.getNext(); // Sino se elimina el primero
        }
      }
      cantNodos--;
    }

    public int getNodes() { return cantNodos; }
    public void setNodes(int cantNodos) { this.cantNodos=cantNodos; }

    public int getBeerStock(String name) {
        Cerveza aux = beer;
        while (aux.getNext() != null) {
            if (name.equals(aux.getNombre())) {
                beerStock = aux.getCantidad();
            }
            aux = aux.getNext();
        }
        return beerStock;
    }

    public void setBeerStock(int beerStock, String name) {
        this.beerStock = beerStock;
        Cerveza aux = beer;
        while (aux.getNext() != null) {
            if (name.equals(aux.getNombre())) {
                aux.setCantidad(beerStock);
            }
            aux = aux.getNext();
        }
    }
  }

    public static Pila bebida = new Pila();
    public pgRegistrarBebida() {
        initComponents();
        beerPanel.setVisible(false);
        winePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBebidas = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        bRegistrar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        jrbWine = new javax.swing.JRadioButton();
        jrbBeer = new javax.swing.JRadioButton();
        imgWine = new javax.swing.JLabel();
        imgBeer = new javax.swing.JLabel();
        beerPanel = new javax.swing.JPanel();
        txBName = new javax.swing.JLabel();
        txBMarca = new javax.swing.JLabel();
        txBLitros = new javax.swing.JLabel();
        txBPer = new javax.swing.JLabel();
        txBInventario = new javax.swing.JLabel();
        beerName = new javax.swing.JTextField();
        beerMarca = new javax.swing.JTextField();
        beerLitros = new javax.swing.JTextField();
        beerAlcohol = new javax.swing.JTextField();
        beerInventario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txBEstilo = new javax.swing.JLabel();
        beerEstilo = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txBEnvace = new javax.swing.JLabel();
        beerEnvace = new javax.swing.JRadioButton();
        winePanel = new javax.swing.JPanel();
        txWName = new javax.swing.JLabel();
        txWMarca = new javax.swing.JLabel();
        txWLitros = new javax.swing.JLabel();
        txWPer = new javax.swing.JLabel();
        txWInventario = new javax.swing.JLabel();
        wineName = new javax.swing.JTextField();
        wineMarca = new javax.swing.JTextField();
        wineLitros = new javax.swing.JTextField();
        wineAlcohol = new javax.swing.JTextField();
        wineInventario = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        txWTipo = new javax.swing.JLabel();
        wineTipo = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        txWOrigen = new javax.swing.JLabel();
        wineOrigen = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(27, 31, 37));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(188, 183, 174));
        Title.setFont(new java.awt.Font("SF Pro Display", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(188, 183, 174));
        Title.setText("REGISTRO DE BEBIDA");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 40, -1, -1));

        bRegistrar.setBackground(new java.awt.Color(28, 51, 132));
        bRegistrar.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setBorder(null);
        bRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        add(bRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 200, 40));

        bEliminar.setBackground(new java.awt.Color(28, 51, 132));
        bEliminar.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("ELIMINAR");
        bEliminar.setBorder(null);
        bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 200, 40));

        bVolver.setBackground(new java.awt.Color(28, 51, 132));
        bVolver.setFont(new java.awt.Font("FreeSans", 0, 13)); // NOI18N
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("VOLVER");
        bVolver.setBorder(null);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 200, 40));
        add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 720, 20));

        grupoBebidas.add(jrbWine);
        jrbWine.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jrbWine.setForeground(new java.awt.Color(188, 183, 174));
        jrbWine.setText("Vinos & Licores");
        jrbWine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbWineActionPerformed(evt);
            }
        });
        add(jrbWine, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 150, 30));

        grupoBebidas.add(jrbBeer);
        jrbBeer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jrbBeer.setForeground(new java.awt.Color(188, 183, 174));
        jrbBeer.setText("Cervezas");
        jrbBeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBeerActionPerformed(evt);
            }
        });
        add(jrbBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 110, 30));

        imgWine.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/wine.png")); // NOI18N
        add(imgWine, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 40, 60));

        imgBeer.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/beer.png")); // NOI18N
        add(imgBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 50, 60));

        beerPanel.setBackground(new java.awt.Color(27, 31, 37));

        txBName.setBackground(new java.awt.Color(188, 183, 174));
        txBName.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBName.setForeground(new java.awt.Color(188, 183, 174));
        txBName.setText("Nombre de la cerveza:");

        txBMarca.setBackground(new java.awt.Color(188, 183, 174));
        txBMarca.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBMarca.setForeground(new java.awt.Color(188, 183, 174));
        txBMarca.setText("Marca de la cerveza:");

        txBLitros.setBackground(new java.awt.Color(188, 183, 174));
        txBLitros.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBLitros.setForeground(new java.awt.Color(188, 183, 174));
        txBLitros.setText("Cantidad en litros:");

        txBPer.setBackground(new java.awt.Color(188, 183, 174));
        txBPer.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBPer.setForeground(new java.awt.Color(188, 183, 174));
        txBPer.setText("% de alcohol:");

        txBInventario.setBackground(new java.awt.Color(188, 183, 174));
        txBInventario.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBInventario.setForeground(new java.awt.Color(188, 183, 174));
        txBInventario.setText("Cantidad en inventario:");

        beerName.setBackground(new java.awt.Color(27, 31, 37));
        beerName.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerName.setForeground(new java.awt.Color(204, 204, 204));
        beerName.setBorder(null);

        beerMarca.setBackground(new java.awt.Color(27, 31, 37));
        beerMarca.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerMarca.setForeground(new java.awt.Color(204, 204, 204));
        beerMarca.setBorder(null);

        beerLitros.setBackground(new java.awt.Color(27, 31, 37));
        beerLitros.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerLitros.setForeground(new java.awt.Color(204, 204, 204));
        beerLitros.setBorder(null);

        beerAlcohol.setBackground(new java.awt.Color(27, 31, 37));
        beerAlcohol.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerAlcohol.setForeground(new java.awt.Color(204, 204, 204));
        beerAlcohol.setBorder(null);

        beerInventario.setBackground(new java.awt.Color(27, 31, 37));
        beerInventario.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerInventario.setForeground(new java.awt.Color(204, 204, 204));
        beerInventario.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator2.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator3.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator4.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator5.setForeground(new java.awt.Color(73, 168, 245));

        txBEstilo.setBackground(new java.awt.Color(188, 183, 174));
        txBEstilo.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBEstilo.setForeground(new java.awt.Color(188, 183, 174));
        txBEstilo.setText("Estilo de cerveza:");

        beerEstilo.setBackground(new java.awt.Color(27, 31, 37));
        beerEstilo.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        beerEstilo.setForeground(new java.awt.Color(204, 204, 204));
        beerEstilo.setBorder(null);

        jSeparator11.setForeground(new java.awt.Color(73, 168, 245));

        txBEnvace.setBackground(new java.awt.Color(188, 183, 174));
        txBEnvace.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txBEnvace.setForeground(new java.awt.Color(188, 183, 174));
        txBEnvace.setText("Necesita envace:");

        javax.swing.GroupLayout beerPanelLayout = new javax.swing.GroupLayout(beerPanel);
        beerPanel.setLayout(beerPanelLayout);
        beerPanelLayout.setHorizontalGroup(
            beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beerPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(txBEstilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beerEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBName)
                                .addGap(11, 11, 11)
                                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beerName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBMarca)
                                .addGap(25, 25, 25)
                                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beerMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBLitros)
                                .addGap(45, 45, 45)
                                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beerLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBPer)
                                .addGap(78, 78, 78)
                                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beerAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBInventario)
                                .addGap(8, 8, 8)
                                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(txBEnvace)
                                .addGap(53, 53, 53)
                                .addComponent(beerEnvace)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        beerPanelLayout.setVerticalGroup(
            beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beerPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBName)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(beerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBMarca)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(beerMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBLitros)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(beerLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBPer)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(beerAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txBInventario)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addComponent(beerInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(beerPanelLayout.createSequentialGroup()
                        .addGroup(beerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txBEstilo)
                            .addGroup(beerPanelLayout.createSequentialGroup()
                                .addComponent(beerEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(txBEnvace))
                    .addComponent(beerEnvace))
                .addGap(18, 18, 18))
        );

        add(beerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 430, 290));

        winePanel.setBackground(new java.awt.Color(27, 31, 37));

        txWName.setBackground(new java.awt.Color(188, 183, 174));
        txWName.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWName.setForeground(new java.awt.Color(188, 183, 174));
        txWName.setText("Nombre de la botella:");

        txWMarca.setBackground(new java.awt.Color(188, 183, 174));
        txWMarca.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWMarca.setForeground(new java.awt.Color(188, 183, 174));
        txWMarca.setText("Marca de la botella:");

        txWLitros.setBackground(new java.awt.Color(188, 183, 174));
        txWLitros.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWLitros.setForeground(new java.awt.Color(188, 183, 174));
        txWLitros.setText("Cantidad en litros:");

        txWPer.setBackground(new java.awt.Color(188, 183, 174));
        txWPer.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWPer.setForeground(new java.awt.Color(188, 183, 174));
        txWPer.setText("% de alcohol:");

        txWInventario.setBackground(new java.awt.Color(188, 183, 174));
        txWInventario.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWInventario.setForeground(new java.awt.Color(188, 183, 174));
        txWInventario.setText("Cantidad en inventario:");

        wineName.setBackground(new java.awt.Color(27, 31, 37));
        wineName.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineName.setForeground(new java.awt.Color(204, 204, 204));
        wineName.setBorder(null);

        wineMarca.setBackground(new java.awt.Color(27, 31, 37));
        wineMarca.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineMarca.setForeground(new java.awt.Color(204, 204, 204));
        wineMarca.setBorder(null);

        wineLitros.setBackground(new java.awt.Color(27, 31, 37));
        wineLitros.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineLitros.setForeground(new java.awt.Color(204, 204, 204));
        wineLitros.setBorder(null);

        wineAlcohol.setBackground(new java.awt.Color(27, 31, 37));
        wineAlcohol.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineAlcohol.setForeground(new java.awt.Color(204, 204, 204));
        wineAlcohol.setBorder(null);

        wineInventario.setBackground(new java.awt.Color(27, 31, 37));
        wineInventario.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineInventario.setForeground(new java.awt.Color(204, 204, 204));
        wineInventario.setBorder(null);

        jSeparator13.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator14.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator15.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator16.setForeground(new java.awt.Color(73, 168, 245));

        jSeparator17.setForeground(new java.awt.Color(73, 168, 245));

        txWTipo.setBackground(new java.awt.Color(188, 183, 174));
        txWTipo.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWTipo.setForeground(new java.awt.Color(188, 183, 174));
        txWTipo.setText("Tipo de alcohol:");

        wineTipo.setBackground(new java.awt.Color(27, 31, 37));
        wineTipo.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineTipo.setForeground(new java.awt.Color(204, 204, 204));
        wineTipo.setBorder(null);

        jSeparator18.setForeground(new java.awt.Color(73, 168, 245));

        txWOrigen.setBackground(new java.awt.Color(188, 183, 174));
        txWOrigen.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txWOrigen.setForeground(new java.awt.Color(188, 183, 174));
        txWOrigen.setText("Lugar de origen:");

        wineOrigen.setBackground(new java.awt.Color(27, 31, 37));
        wineOrigen.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        wineOrigen.setForeground(new java.awt.Color(204, 204, 204));
        wineOrigen.setBorder(null);

        jSeparator19.setForeground(new java.awt.Color(73, 168, 245));

        javax.swing.GroupLayout winePanelLayout = new javax.swing.GroupLayout(winePanel);
        winePanel.setLayout(winePanelLayout);
        winePanelLayout.setHorizontalGroup(
            winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(txWOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wineOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(winePanelLayout.createSequentialGroup()
                                .addComponent(txWLitros)
                                .addGap(45, 45, 45)
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wineLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(winePanelLayout.createSequentialGroup()
                                .addComponent(txWPer)
                                .addGap(78, 78, 78)
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wineAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(winePanelLayout.createSequentialGroup()
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txWName)
                                    .addComponent(txWMarca))
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(winePanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(wineMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(winePanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(wineName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(winePanelLayout.createSequentialGroup()
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txWInventario)
                                    .addComponent(txWTipo))
                                .addGap(8, 8, 8)
                                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wineTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wineInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        winePanelLayout.setVerticalGroup(
            winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWName)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWMarca)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWLitros)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWPer)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWInventario)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txWTipo)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(winePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(winePanelLayout.createSequentialGroup()
                        .addComponent(wineOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txWOrigen))
                .addGap(10, 10, 10))
        );

        add(winePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
      bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pgInicio pg = new pgInicio();
      EmpleadoMenu.showPanel(pg);
      this.setVisible(false);
    }//GEN-LAST:event_bVolverActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        bRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        if (jrbBeer.isSelected()) {
            bebida.pushBeer(beerName.getText(),beerMarca.getText(),Integer.parseInt(beerInventario.getText()),
                        Integer.parseInt(beerLitros.getText()),Float.parseFloat(beerAlcohol.getText()),
                        beerEstilo.getText(),beerEnvace.isSelected());

            Mensaje.setForeground(new java.awt.Color(39,237,33));
            Mensaje.setText("Cerveza registrada satisfactoriamente");

        } else if (jrbWine.isSelected()) {
            bebida.pushWine(wineName.getText(),wineMarca.getText(),Integer.parseInt(wineInventario.getText()),
                        Integer.parseInt(wineLitros.getText()),Float.parseFloat(wineAlcohol.getText()),
                        wineTipo.getText(),wineOrigen.getText());
            Mensaje.setForeground(new java.awt.Color(39,237,33));
            Mensaje.setText("Botella registrada satisfactoriamente");
        } else {
            Mensaje.setForeground(new java.awt.Color(204, 0, 0));
            Mensaje.setText("Necesita seleccionar un producto");
        }
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        if (jrbBeer.isSelected()) {
            bebida.popBeer(); // Elimina la primera cerveza en la pila
            Mensaje.setForeground(new java.awt.Color(204, 0, 0));
            Mensaje.setText("Cerveza eliminada satisfactoriamente");
        } else if (jrbWine.isSelected()) { // Elimina la primera botella en la pila
            bebida.popWine();
            Mensaje.setForeground(new java.awt.Color(39,237,33));
            Mensaje.setText("Botella eliminada satisfactoriamente");
        } else {
            Mensaje.setForeground(new java.awt.Color(204, 0, 0));
            Mensaje.setText("Necesita seleccionar un producto");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void jrbBeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBeerActionPerformed
        winePanel.setVisible(false);
        beerPanel.setVisible(true);
    }//GEN-LAST:event_jrbBeerActionPerformed

    private void jrbWineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbWineActionPerformed
        beerPanel.setVisible(false);
        winePanel.setVisible(true);
    }//GEN-LAST:event_jrbWineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Title;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton bVolver;
    private javax.swing.JTextField beerAlcohol;
    private javax.swing.JRadioButton beerEnvace;
    private javax.swing.JTextField beerEstilo;
    private javax.swing.JTextField beerInventario;
    private javax.swing.JTextField beerLitros;
    private javax.swing.JTextField beerMarca;
    private javax.swing.JTextField beerName;
    private javax.swing.JPanel beerPanel;
    private javax.swing.ButtonGroup grupoBebidas;
    private javax.swing.JLabel imgBeer;
    private javax.swing.JLabel imgWine;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton jrbBeer;
    private javax.swing.JRadioButton jrbWine;
    private javax.swing.JLabel txBEnvace;
    private javax.swing.JLabel txBEstilo;
    private javax.swing.JLabel txBInventario;
    private javax.swing.JLabel txBLitros;
    private javax.swing.JLabel txBMarca;
    private javax.swing.JLabel txBName;
    private javax.swing.JLabel txBPer;
    private javax.swing.JLabel txWInventario;
    private javax.swing.JLabel txWLitros;
    private javax.swing.JLabel txWMarca;
    private javax.swing.JLabel txWName;
    private javax.swing.JLabel txWOrigen;
    private javax.swing.JLabel txWPer;
    private javax.swing.JLabel txWTipo;
    private javax.swing.JTextField wineAlcohol;
    private javax.swing.JTextField wineInventario;
    private javax.swing.JTextField wineLitros;
    private javax.swing.JTextField wineMarca;
    private javax.swing.JTextField wineName;
    private javax.swing.JTextField wineOrigen;
    private javax.swing.JPanel winePanel;
    private javax.swing.JTextField wineTipo;
    // End of variables declaration//GEN-END:variables
}
