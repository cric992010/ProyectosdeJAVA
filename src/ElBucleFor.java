import java.util.Scanner;

public class ElBucleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el primer numero");
        int primerOperando = scanner.nextInt();
        System.out.println("introduzca el segundo numero");
        int segundoOperando = scanner.nextInt();

        int resultado = 0;
        for (int i = 0; i < segundoOperando; i++){
            System.out.println("Iteración numero: " + i);
            resultado = resultado + primerOperando;
        }
        System.out.println("El resultado de multiplicar :" + primerOperando + " por " + segundoOperando + " es igual a " + resultado);
    }
}
