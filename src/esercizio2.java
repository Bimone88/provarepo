import java.util.Scanner;

public class esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente di inserire tre stringhe
        System.out.println("Per favore, inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();

        System.out.println("Ora, inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();

        System.out.println("Infine, inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine();

        // Concateno le stringhe in ordine di inserimento
        String concatenazione = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazione);

        // Concateno le stringhe in ordine inverso
        String concatenazioneInversa = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        scanner.close(); // Chiudi lo scanner quando hai finito di usarlo
    }
}
