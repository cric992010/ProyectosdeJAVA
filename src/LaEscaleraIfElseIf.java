import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe un numero entero y te dare informacion sobre el");
        int numeroIntroducido = scanner.nextInt();
        if (numeroIntroducido < 3){
            System.out.println("el numero introducido es menor que 3");
        } else if (numeroIntroducido < 5) {
            System.out.println("el numero esta entre 3 y 5");
        } else if (numeroIntroducido < 8) {
            System.out.println("El numero que has introducido esta entre 5 y 8");
        } else{
            System.out.println("El numero introducido es mayor y igual a 8");
        }
    }
}
