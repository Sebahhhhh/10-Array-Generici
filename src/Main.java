public class Main {
    public static void main(String[] args) {
        Vettore<Mobile> vettoreMobili = new Vettore<>(5);
        Vettore<Infisso> vettoreInfissi = new Vettore<>(5);

        Mobile mobile1 = new Mobile(10.5, 100.50);
        Mobile mobile2 = new Mobile(25.0, 250.0);
        vettoreMobili.aggiungi(mobile1);
        vettoreMobili.aggiungi(mobile2);

        Infisso infisso1 = new Infisso("Vetro", 1.0, 1.0);
        Infisso infisso2 = new Infisso("Ferro", 2.5, 5.2);
        vettoreInfissi.aggiungi(infisso1);
        vettoreInfissi.aggiungi(infisso2);

        System.out.println("Mobili:");
        vettoreMobili.visualizza();

        System.out.println("Infissi:");
        vettoreInfissi.visualizza();

        System.out.println("Ricerca Mobile con peso 10.5:");
        Mobile foundMobile = vettoreMobili.ricerca(10.5);
        System.out.println(foundMobile);

        System.out.println("Ricerca Infisso con materiale 'Ferro':");
        Infisso foundInfisso = vettoreInfissi.ricerca("Ferro");
        System.out.println(foundInfisso);
    }
}