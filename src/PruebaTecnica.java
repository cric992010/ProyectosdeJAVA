import java.util.ArrayList;
import java.util.Scanner;

/**
 * Test
 * Autor: Edgar Valentin Ruiz Padilla
 */
public class PruebaTecnica {
    public static void main(String[] args) {
        // Se insancia un arraylist de tipo String
        ArrayList<String> palabras = new ArrayList<String>();
        String palabra;
        int contador = 0;
        boolean repetida = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Inserta una palabra: ");
            palabra = sc.nextLine();
            if (palabras.contains(palabra)) {
                // obtenemos el indice de la palabra repetida
                contador = palabras.indexOf(palabra);
                repetida = true;
            }
            // Se agrega la palabra al arraylist
            palabras.add(palabra);
        } while (!repetida);
        System.out.println("Ya ha insertado dicha palabra en el orden " + (contador + 1));
    }

}
