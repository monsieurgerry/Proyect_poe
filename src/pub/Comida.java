package pub;

import javax.swing.table.DefaultTableModel;
import pub.frames.*;

public class Comida {
  private String nombre;
  private String tipo;
  private int precio;
  private int calorias;
  private String tamano;
  public Comida next;

  public Comida() {
    this.nombre = nombre;
    this.tipo = tipo;
    this.precio = precio;
    this.calorias = calorias;
    this.tamano = tamano;
    this.next = next;
  }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }

  public String getTipo() { return tipo; }
  public void setTipo(String tipo) { this.tipo = tipo; }

  public int getPrecio() { return precio; }
  public void setPrecio(int precio) { this.precio = precio; }

  public int getCalorias() { return calorias; }
  public void setCalorias(int calorias) { this.calorias = calorias; }

  public String getTamano() { return tamano; }
  public void setTamano(String tamano) { this.tamano = tamano; }

  public Comida getNext() { return next; }
  public void setNext(Comida next) { this.next = next; }

  public static class Pila {
    Comida pila;
    private int cantNodos;

    public Pila() {
      pila = null;
      cantNodos = 0;
    }

    public void push(String n, String t, int p, int c, String s) {
      Comida nuevo = new Comida();
      nuevo.setNombre(n);
      nuevo.setTipo(t);
      nuevo.setPrecio(p);
      nuevo.setCalorias(c);
      nuevo.setTamano(s);
      if (pila == null) {
        pila = nuevo;
      } else {
        Comida aux = pila;
        pila = nuevo;
        nuevo.setNext(aux);
      }
      cantNodos++;
    } // push

    public String[] print() { // Agregar a tabla
      Comida aux = pila;
      String[] data = new String[100];
      if (pila == null) {
        System.out.println("No existen platillos registrados");
      } else {
        while (aux != null) {
          data = new String[] {
              aux.getNombre(), aux.getTipo(), Integer.toString(aux.getPrecio()),
              Integer.toString(aux.getCalorias()), aux.getTamano()};

          DefaultTableModel tabla =(DefaultTableModel)pgVerComida.Table.getModel();
          tabla.addRow(data);
          aux = aux.getNext(); // Avanzar al sig nodo
        }
      }
      return data;
    } // recorrer

    public void pop() {
      Comida aux = pila;
      if (pila == null) {
        System.out.println("No existen platillos registrados");
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
    public void setNodes(int cantNodos) { this.cantNodos = cantNodos; }
  }
}
