import java.util.Scanner;

public class LaSentenciaIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = 5;

        System.out.println("Adivina el numero que estoy pensando del 1 al 10");
        int numeroIngresado = scanner.nextInt();

        String color;
        if(numeroIngresado  == numeroPensado){
            color = "\033[0;32m";
            System.out.println(color + "enorabuena");
        }else{
            color = "\033[0;31m";
            System.out.println(color + "esa no es jijiiji");
        }
    }
}
