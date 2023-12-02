import java.util.ArrayList;
import java.util.Scanner;

/*
Realizar un programa que pida por consola una palabra cíclicamente. Cuando el usuario haya insertado una palabra que ya insertó previamente,
el programa mostrará el órden en que dicha palabra ya se había insertado anteriormente y terminará elprograma.

Por ejemplo:
Inserta una palabra: hola
Inserta una palabra: mundo
Inserta una palabra: mi
Inserta una palabra: primer
Inserta una palabra: programa
Inserta una palabra: mundo
Ya ha insertado dicha palabra en el orden 2.
Termina programa

Nota personal, anexe nada mas un break para cuando el usuario quiera salir del programa presionando la letra "q"
 */

public class PalabraCiclica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> cadenaDePalabrasIngresadas = new ArrayList<>();

        boolean validator = false;
        while (!validator) {
            System.out.println("Ingresa una palabra que no se repita, Si quieres salir presiona 'q'");
            String palabraCiclica = entrada.nextLine();

            if (palabraCiclica.equals("q")) {
                validator = true;
            } else {
                if (cadenaDePalabrasIngresadas.contains(palabraCiclica)) {
                    System.out.println("Tu cadena fue " + cadenaDePalabrasIngresadas);
                    System.out.println("Tu palabra "+ palabraCiclica +" a sido ingresada en la sección " + cadenaDePalabrasIngresadas.indexOf(palabraCiclica));
                    validator = true;
                } else {
                    cadenaDePalabrasIngresadas.add(palabraCiclica);

                }
            }

        }
    }
}