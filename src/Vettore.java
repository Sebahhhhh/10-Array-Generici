public class Vettore<T> {
    private T[] vettore;
    private int count;

    @SuppressWarnings("unchecked")
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
}