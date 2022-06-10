package pub;

import javax.swing.table.DefaultTableModel;
import pub.frames.*;

public class Cerveza extends Bebidas {
  private String estilo; // oscura, light, etc.
  private boolean envace;
  public Cerveza next;

  public Cerveza() {
    this.estilo = estilo;
    this.envace = envace;
    this.next = next;
  }

  public String getEstilo() { return estilo; }
  public void setEstilo(String estilo) { this.estilo = estilo; }

  public boolean necesitaEnvace() { return envace; }
  public void setEnvace(boolean envace) { this.envace = envace; }

  public Cerveza getNext() { return next; }
  public void setNext(Cerveza next) { this.next = next; }

  public static class Pila {
    int beerStock;
    String envace;

    Cerveza beer;
    private int cantNodos;

    public Pila() {
      beer = null;
      cantNodos = 0;
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
    } // push

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
          data = new String[] {aux.getNombre(),
                               aux.getMarca(),
                               Integer.toString(aux.getCantidad()),
                               Integer.toString(aux.getTamano()),
                               Float.toString(aux.getAlcohol()),
                               aux.getEstilo(),
                               envace};

          DefaultTableModel tabla = (DefaultTableModel)pgVerBebidas.beerTable.getModel();
          tabla.addRow(data);
          aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
      return data;
    } // recorrer

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

    public int getNodes() { return cantNodos; }
    public void setNodes(int cantNodos) { this.cantNodos = cantNodos; }

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
}
