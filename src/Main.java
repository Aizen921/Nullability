// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            frazioni(null, 6);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }


        try {
            frazioni(6, null);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }


        frazioni(6,3);
    }

    public static void frazioni(Integer numeratore, Integer denominatore) {

        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("numeratore e donominatore non possono essere null");
        }
        int risultato = numeratore / denominatore;
        System.out.println("il risultato è: " + risultato);
    }
}

