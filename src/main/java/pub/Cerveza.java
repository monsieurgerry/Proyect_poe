package pub;

public class Cerveza extends Bebidas {
    private String estilo; // oscura, light, etc.
    private boolean envace;
    public Cerveza next;

    public Cerveza() {
        this.estilo = estilo;
        this.envace = envace;
        this.next = next;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean necesitaEnvace() {
        return envace;
    }

    public void setEnvace(boolean envace) {
        this.envace = envace;
    }

    public Cerveza getNext() {
        return next;
    }

    public void setNext(Cerveza next) {
        this.next = next;
    }
}
