package spilovi;

import java.util.Scanner;

//Zadatak predstavlja jedan deo kartaške igre Tablić.
//- Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. Karte učitavati kao cele brojeve -
// ​kec ​je broj 11, žandar 12, dama 13 i kralj 14. Tražiti od korisnika da učita koliko karata ima,
// a nakon toga koje su to karte. Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.
//
//- Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da ​mala dvojka​ i dupla desetka ​nemaju
// specijalno znacenje.
//
//- Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).
//
//- Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.
public class KartaskaIgra {

    private final Scanner scanner = new Scanner(System.in);

    int spil = 52;

    public int[] ucitajKarte(String igrac) {

        // ucitavanje broj karata
        System.out.println("Unesite broj karata igaca: " + igrac);
        int brojKarata = scanner.nextInt();

        // pravljenje niza
        int[] nizKarata = new int[brojKarata];

        // ucitavanje karata
        for (int i = 0; i < nizKarata.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". kartu igraca: " + igrac);
            int brojKarte = scanner.nextInt();

            // provera da li je karta validna
            if (brojKarte < 1 || brojKarte > 14) {
                System.out.println("Uneli ste nevalidnu kartu! Pokusajte ponovo.");
                i--;
                continue;
            }

            // ako jeste validna karta, dodamo je u spil (niz)
            nizKarata[i] = brojKarte;
        }

        // vratimo napravljeni niz karata
        return nizKarata;
    }

    public int izracunajBrojStihova(int[] karte) {
        int brojStihova = 0;
        for (int i : karte) {
            if (i > 9) {
                brojStihova++;
            }
        }
        return brojStihova;
    }


    // 1 ako je prvi pobedio
    // -1 ako je drgi pobedio
    // 0 ako je nereseno
    public int izracunajPobednika(int[] kartePrvogIgraca, int[] karteDrugogIgraca) {
        int prvi = izracunajBrojStihova(kartePrvogIgraca);
        int drugi = izracunajBrojStihova(karteDrugogIgraca);
        if (prvi < drugi) {
            return -1;
        } else if (prvi > drugi) {
            return 1;
        } else {
            return 0;
        }
    }
}
