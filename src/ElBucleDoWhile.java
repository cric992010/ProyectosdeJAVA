import java.util.Scanner;

public class ElBucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        do{
            System.out.println("Introduzca un numero y le mostraremos la raiz cuadrada. Para salir indroduce 0");
            numero = scanner.nextDouble();
            if (numero == 0){
                System.out.println("Hasta la vista");
            }else{
                System.out.println("la raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
            }
        }while(numero != 0);
    }
}
