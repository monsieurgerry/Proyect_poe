package pub;

public class Bebidas {
    private String nombre;
    private String marca;
    private int cantidad;
    private int tamano;
    private float alcohol;

    public Bebidas() {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.tamano = tamano;
        this.alcohol = alcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }
}
