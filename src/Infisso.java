public class Infisso {
    private String materiale;
    private double altezza;
    private double larghezza;

    public Infisso(String materiale, double altezza, double larghezza) {
        this.materiale = materiale;
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public String getMateriale() {
        return materiale;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }


    public String toString() {
        return "Infisso materiale=" + materiale + ", altezza=" + altezza + ", larghezza=" + larghezza + "";
    }
    public boolean equals(Object o) {
        if (o instanceof Infisso) {
            Infisso i = (Infisso) o;
            return this.materiale.equals(i.materiale) && this.altezza == i.altezza && this.larghezza == i.larghezza;
        }
        return false;
    }
}
