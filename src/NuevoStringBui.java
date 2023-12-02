import java.util.Scanner;

public class NuevoStringBui {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        boolean validator = false;
        while(!validator) {

            System.out.println("Ingresa la cadena a revertir");
            String cadena = scanner.nextLine();

            if (cadena.equals("9")){
                validator = true;
            } else {
                StringBuilder canedaReversa = new StringBuilder(cadena);
                canedaReversa.reverse();

                System.out.println(canedaReversa);
            }
        }

    }
}
