import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el dia de la semana en que quiere su cita");
        String dia = scanner.nextLine();
        switch (dia){
            case "lunes":
                System.out.println("el lunes puede venir de 11 a 12");
                break;
            case "martes":
                System.out.println("el marter puede venir de 2 a 3pm");
                break;
            case "miercoles":
                System.out.println("el miercoles no se chambea");
                break;
            case "jueves":
                System.out.println("tampoco se chambea en jueves");
                break;
            case "viernes":
                System.out.println("hoy vienes tal ves a las 4pm");
                break;
            case "sabado":
                System.out.println("hoy todo el dia");
                break;
            case "domingo":
                System.out.println("hoy no se chambea en domingo");
                break;
            default:
                System.out.println("introduce un dia valio, we");

        }
    }
}
