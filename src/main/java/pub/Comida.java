package pub;

public class Comida {
    private String nombre;
    private String tipo;
    private int precio;
    private int calorias;
    private String tamano;
    public Comida next;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Comida getNext() {
        return next;
    }

    public void setNext(Comida next) {
        this.next = next;
    }

    public Comida() {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.calorias = calorias;
        this.tamano = tamano;
        this.next = next;
    }
}
