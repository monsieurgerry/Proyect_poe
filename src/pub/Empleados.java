package pub;

import pub.frames.*;
import javax.swing.table.DefaultTableModel;

public class Empleados {
    private String nombre;
    private String apellido;
    private String puesto;
    private int edad;
    private int numCel;
    public Empleados next;

    public Empleados() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;
        this.numCel = numCel;
        this.next = next;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumCel() {
        return numCel;
    }

    public Empleados getNext() {
        return next;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumCel(int numCel) {
        this.numCel = numCel;
    }

    public void setNext(Empleados next) {
        this.next = next;
    }

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
}
