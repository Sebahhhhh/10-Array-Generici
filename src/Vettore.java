public class Vettore<T> {
    private T[] vettore;
    private int count;

    public Vettore(int size) {
        vettore = (T[]) new Object[size];
        count = 0;
    }

    public void aggiungi(T elemento) {
        if (count < vettore.length) {
            vettore[count++] = elemento;
        } else {
            System.out.println("PIENO");
        }
    }

    public void visualizza() {
        for (int i = 0; i < count; i++) {
            System.out.println(vettore[i]);
        }
    }

    public T ricerca(Object criterio) {
        for (int i = 0; i < count; i++) {
            if (vettore[i] instanceof Mobile && criterio instanceof Double) {
                Mobile mobile = (Mobile) vettore[i];
                if (mobile.getPeso() == (Double) criterio) {
                    return vettore[i];
                }
            } else if (vettore[i] instanceof Infisso && criterio instanceof String) {
                Infisso infisso = (Infisso) vettore[i];
                if (infisso.getMateriale().equals(criterio)) {
                    return vettore[i];
                }
            }
        }
        return null;
    }
}