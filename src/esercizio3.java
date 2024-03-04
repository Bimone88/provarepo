import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perimetro del rettangolo
        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();
        double perimetroRettangolo = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        // Pari o dispari
        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));

        // Perimetro del triangolo e area con la formula di Erone
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double latoA = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double latoB = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double latoC = scanner.nextDouble();
        double areaTriangolo = perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("L'area del triangolo è: " + areaTriangolo);

        scanner.close();
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        return numero % 2;
    }

    public static double perimetroTriangolo(double a, double b, double c) {
        double semiperimetro = (a + b + c) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }
}