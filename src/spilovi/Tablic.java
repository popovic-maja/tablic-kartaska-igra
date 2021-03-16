package spilovi;

public class Tablic {
    public static void main(String[] args) {

        KartaskaIgra kartaskaIgra = new KartaskaIgra();

        // ucitavanje karata
        int[] majineKarte = kartaskaIgra.ucitajKarte("maja");
        int[] perineKarte = kartaskaIgra.ucitajKarte("pera");

        // racunanje pobednika
        int pobednik = kartaskaIgra.izracunajPobednika(majineKarte, perineKarte);
        if (pobednik == 1) {
            System.out.println("Pobedila je Maja!");
        } else if (pobednik == -1) {
            System.out.println("PobediO je Pera!");
        } else {
            System.out.println("Igra je neresena!");
        }
    }
}
