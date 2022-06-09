// TODO: integer de celular es muy largo, adaptarlo con -- Long --
package pub.frames;

import pub.Empleados;
import javax.swing.table.DefaultTableModel;

public class pgRegistrarEmpleado extends javax.swing.JPanel {

  public static class Pila {
    Empleados pila;
    private int cantNodos;

    public Pila() {
      pila = null;
      cantNodos=0;
    }

    public void push(String n, String a, String p, int e, int c) {
      Empleados nuevo = new Empleados();
      nuevo.setNombre(n);
      nuevo.setApellido(a);
      nuevo.setPuesto(p);
      nuevo.setEdad(e);
      nuevo.setNumCel(c);
      if (pila == null) {
        pila = nuevo;
      } else {
        Empleados aux = pila;
        pila = nuevo;
        nuevo.setNext(aux);
      }
      cantNodos++;
    } //push

    public void recorrer() {
      Empleados aux = pila;
      if (pila == null) {
        System.out.println("No existen empleados registrados");
      } else {
        while (aux != null) {
          System.out.println(aux.getNombre()+aux.getApellido()+aux.getPuesto()+
                  aux.getEdad()+aux.getNumCel());
          aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
    } //recorrer

    public String[] print() { // Agregar a tabla
      Empleados aux = pila;
      String[] data = new String[100];
      if (pila == null) {
        System.out.println("No existen empleados registrados");
      } else {
        while (aux != null) {
            data = new String[]{aux.getNombre(),aux.getApellido(),aux.getPuesto(),
                Integer.toString(aux.getEdad()),Integer.toString(aux.getNumCel())};
            DefaultTableModel tabla = (DefaultTableModel)pgVerEmpleado.Table.getModel();
            tabla.addRow(data);
            aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
      return data;
    } //recorrer

    public void pop() {
      Empleados aux = pila;
      if (pila == null) {
        System.out.println("No existen empleados registrados");
      } else {
        if (aux.getNext() == null) { // Si el siguiente es null solo hay 1
          pila = null;
        } else {
          pila = aux.getNext(); // Sino se elimina el primero
        }
      }
      cantNodos--;
    }
    public int getNodes() { return cantNodos; }
    public void setNodes(int cantNodos) { this.cantNodos=cantNodos; }
  }

  public static Pila pila = new Pila();
  public pgRegistrarEmpleado() {
    initComponents();
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        txName = new javax.swing.JLabel();
        txApellido = new javax.swing.JLabel();
        txPuesto = new javax.swing.JLabel();
        txEdad = new javax.swing.JLabel();
        txCel = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfPuesto = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfNumCel = new javax.swing.JTextField();
        bRegistrar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Mensaje = new javax.swing.JLabel();
        imWaiter = new javax.swing.JLabel();
        imQuestion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 31, 37));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(188, 183, 174));
        Title.setFont(new java.awt.Font("SF Pro Display", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(188, 183, 174));
        Title.setText("REGISTRO DE EMPLEADO");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        txName.setBackground(new java.awt.Color(188, 183, 174));
        txName.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txName.setForeground(new java.awt.Color(188, 183, 174));
        txName.setText("Nombre del Empleado:");
        add(txName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txApellido.setBackground(new java.awt.Color(188, 183, 174));
        txApellido.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txApellido.setForeground(new java.awt.Color(188, 183, 174));
        txApellido.setText("Apellido del Empleado:");
        add(txApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txPuesto.setBackground(new java.awt.Color(188, 183, 174));
        txPuesto.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txPuesto.setForeground(new java.awt.Color(188, 183, 174));
        txPuesto.setText("Puesto del Empleado:");
        add(txPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txEdad.setBackground(new java.awt.Color(188, 183, 174));
        txEdad.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txEdad.setForeground(new java.awt.Color(188, 183, 174));
        txEdad.setText("Edad del Emplado:");
        add(txEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txCel.setBackground(new java.awt.Color(188, 183, 174));
        txCel.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        txCel.setForeground(new java.awt.Color(188, 183, 174));
        txCel.setText("Numero de celular:");
        add(txCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jtfNombre.setBackground(new java.awt.Color(27, 31, 37));
        jtfNombre.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(204, 204, 204));
        jtfNombre.setBorder(null);
        add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 530, -1));

        jtfApellido.setBackground(new java.awt.Color(27, 31, 37));
        jtfApellido.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        jtfApellido.setForeground(new java.awt.Color(204, 204, 204));
        jtfApellido.setBorder(null);
        add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 530, -1));

        jtfPuesto.setBackground(new java.awt.Color(27, 31, 37));
        jtfPuesto.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        jtfPuesto.setForeground(new java.awt.Color(204, 204, 204));
        jtfPuesto.setBorder(null);
        add(jtfPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 530, -1));

        jtfEdad.setBackground(new java.awt.Color(27, 31, 37));
        jtfEdad.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(204, 204, 204));
        jtfEdad.setBorder(null);
        add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 530, -1));

        jtfNumCel.setBackground(new java.awt.Color(27, 31, 37));
        jtfNumCel.setFont(new java.awt.Font("SF Pro", 0, 14)); // NOI18N
        jtfNumCel.setForeground(new java.awt.Color(204, 204, 204));
        jtfNumCel.setBorder(null);
        add(jtfNumCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 530, -1));

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
        add(bRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 200, 40));

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
        add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 200, 40));

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
        add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 200, 40));

        jSeparator1.setForeground(new java.awt.Color(73, 168, 245));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 530, -1));

        jSeparator2.setForeground(new java.awt.Color(73, 168, 245));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 530, 10));

        jSeparator3.setForeground(new java.awt.Color(73, 168, 245));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 530, 10));

        jSeparator4.setForeground(new java.awt.Color(73, 168, 245));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 530, 10));

        jSeparator5.setForeground(new java.awt.Color(73, 168, 245));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 530, 10));
        add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 720, 20));

        imWaiter.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/waiter.png")); // NOI18N
        add(imWaiter, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 420, 350));

        imQuestion.setIcon(new javax.swing.ImageIcon("/home/gerry/Documents/ceti/3Semestre/poe/3parcial/NightProwler/src/main/java/images/questionMark.png")); // NOI18N
        add(imQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 70, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
      bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pgInicio pg = new pgInicio();
      EmpleadoMenu.showPanel(pg);
      this.setVisible(false);
    }//GEN-LAST:event_bVolverActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
      bRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pila.push(jtfNombre.getText(),jtfApellido.getText(),jtfPuesto.getText(),
              Integer.parseInt(jtfEdad.getText()),Integer.parseInt(jtfNumCel.getText()));
      Mensaje.setForeground(new java.awt.Color(39,237,33));
      Mensaje.setText("Empleado registrado satisfactoriamente");
      pila.recorrer();
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
      bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
      pila.pop();
      Mensaje.setForeground(new java.awt.Color(204, 0, 0));
      Mensaje.setText("Usuario eliminado");
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Title;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel imQuestion;
    private javax.swing.JLabel imWaiter;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNumCel;
    private javax.swing.JTextField jtfPuesto;
    private javax.swing.JLabel txApellido;
    private javax.swing.JLabel txCel;
    private javax.swing.JLabel txEdad;
    private javax.swing.JLabel txName;
    private javax.swing.JLabel txPuesto;
    // End of variables declaration//GEN-END:variables
}
