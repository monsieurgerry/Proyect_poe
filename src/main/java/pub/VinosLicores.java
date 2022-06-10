package pub;

import javax.swing.table.DefaultTableModel;
import pub.frames.*;

public class VinosLicores extends Bebidas {
  private String tipoBotella;
  private String origen;
  public VinosLicores next;

  public VinosLicores() {
    this.tipoBotella = tipoBotella;
    this.origen = origen;
    this.next = next;
  }

  public String getTipoBotella() { return tipoBotella; }
  public void setTipoBotella(String tipoBotella) {
    this.tipoBotella = tipoBotella;
  }

  public String getOrigen() { return origen; }
  public void setOrigen(String origen) { this.origen = origen; }

  public VinosLicores getNext() { return next; }
  public void setNext(VinosLicores next) { this.next = next; }

  public static class Pila {
    VinosLicores wine;
    private int cantNodos;

    public Pila() {
      wine = null;
      cantNodos = 0;
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
    } // push

    public String[] printWine() { // Agregar botellas a tabla
      VinosLicores aux = wine;
      String[] data = new String[100];
      if (wine == null) {
        System.out.println("No existen botellas registradas");
      } else {
        while (aux != null) {
          data = new String[] {aux.getNombre(),
                               aux.getMarca(),
                               Integer.toString(aux.getCantidad()),
                               Integer.toString(aux.getTamano()),
                               Float.toString(aux.getAlcohol()),
                               aux.getTipoBotella(),
                               aux.getOrigen()};

          DefaultTableModel tabla = (DefaultTableModel)pgVerBebidas.wineTable.getModel();
          tabla.addRow(data);
          aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
      return data;
    } // recorrer

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
    public void setNodes(int cantNodos) { this.cantNodos = cantNodos; }
  }
}
