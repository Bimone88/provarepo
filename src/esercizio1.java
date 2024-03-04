public class Esercizio1 {
    //dedede
    public static void main(String[] args) {
        // Moltiplica
        int prodotto = moltiplica(5, 10);
        System.out.println("Il prodotto è: " + prodotto);

        // Concatena
        String concatenata = concatena("Hello", "123");
        System.out.println("Stringa concatenata: " + concatenata);

        // InserisciInArray
        String[] array = {"primo", "secondo", "terzo", "quarto", "quinto"};
        String[] nuovoArray = inserisciInArray(array, "inserito");
        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String testo, int numero) {
        return testo + numero;
    }

    public static String[] inserisciInArray(String[] array, String nuovoElemento) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve contenere esattamente 5 elementi.");
        }
        String[] nuovoArray = new String[6];
        for (int i = 0, j = 0; i < nuovoArray.length; i++) {
            if (i == 2) {
                nuovoArray[i] = nuovoElemento;
            } else {
                nuovoArray[i] = array[j++];
            }
        }
        return nuovoArray;
    }
}