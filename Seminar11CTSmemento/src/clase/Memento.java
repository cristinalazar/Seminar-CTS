package clase;

public class Memento {

    private String echipaGazda;
    private String echipaOaspeti;
    private int nrSpectatori;

    public Memento(String echipaGazda, String echipaOaspeti, int nrSpectatori) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
        this.nrSpectatori = nrSpectatori;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspeti() {
        return echipaOaspeti;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }
}
