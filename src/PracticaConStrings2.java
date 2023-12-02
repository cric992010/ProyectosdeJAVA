public class PracticaConStrings2 {
    public static void main(String[] args) {
        String miString = "abcde";
        char caracter;

        caracter = miString.charAt(2);

        System.out.println("El caracter en la posicion 2 es: " + caracter);


        String resultadorConCat = miString.concat("fefwfwe");
        System.out.println(" el resultado de concat es " + resultadorConCat);

        resultadorConCat.length();
    }
}
