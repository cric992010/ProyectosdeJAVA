import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        int num = 5;
        int i = 0;
        String texto = "";

        while (i <= num) {
            texto = texto + "*";
            System.out.println(texto);
            i += 1;
        }
    }
}
