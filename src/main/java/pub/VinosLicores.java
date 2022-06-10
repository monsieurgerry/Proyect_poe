package pub;

public class VinosLicores extends Bebidas {
    private String tipoBotella;
    private String origen;
    public VinosLicores next;

    public VinosLicores() {
        this.tipoBotella = tipoBotella;
        this.origen = origen;
        this.next = next;
    }

    public String getTipoBotella() {
        return tipoBotella;
    }

    public void setTipoBotella(String tipoBotella) {
        this.tipoBotella = tipoBotella;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public VinosLicores getNext() {
        return next;
    }

    public void setNext(VinosLicores next) {
        this.next = next;
    }
}
