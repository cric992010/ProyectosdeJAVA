import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor introduzca el numero del que quiera realizar la raiz cuadrada");
        double numero = scanner.nextDouble();
        double candidatoAraizCuadrada = 0.0;
        while (candidatoAraizCuadrada * candidatoAraizCuadrada <= numero){
            candidatoAraizCuadrada+= 0.01;
            System.out.println("Sera el numero " + candidatoAraizCuadrada + " ? " + "Su cuadrado es " + candidatoAraizCuadrada * candidatoAraizCuadrada);

        }
        candidatoAraizCuadrada -= 0.01;
        System.out.println("La raiz cuadrada que se calculo es: "+ candidatoAraizCuadrada);
        System.out.println("La raiz cuadrada real es: " + Math.sqrt(numero));
    }
}
