package pub;

public class Empleados {
    private String nombre;
    private String apellido;
    private String puesto;
    private int edad;
    private int numCel;
    public Empleados next;

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

    public Empleados() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;
        this.numCel = numCel;
        this.next = next;
    }
}
