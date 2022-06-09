package pub;

public class VinosLicores {
    private String nombre;
    private String marca;
    private int cantidad;
    private int tamano;
    private float alcohol;
    public VinosLicores next;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTamano() {
        return tamano;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public VinosLicores getNext() {
        return next;
    }

    public void setNext(VinosLicores next) {
        this.next = next;
    }

    public VinosLicores() {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.tamano = tamano;
        this.alcohol = alcohol;
        this.next = next;
    }
}
