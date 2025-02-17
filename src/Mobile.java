 public class Mobile {
    private double peso;
    private double prezzo;

    public Mobile(double peso, double prezzo) {
        this.peso = peso;
        this.prezzo = prezzo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrezzo() {
        return prezzo;
    }


    public String toString() {
        return "Mobile peso=" + peso + ", prezzo=" + prezzo + "";
    }
    public boolean equals(Object o) {
        if (o instanceof Mobile) {
            Mobile m = (Mobile) o;
            return this.peso == m.peso && this.prezzo == m.prezzo;
        }
        return false;
    }
 }

