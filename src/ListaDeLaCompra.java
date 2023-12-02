import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> miListaDeLaCompra = new ArrayList<String>();
        miListaDeLaCompra.add("patata");
        miListaDeLaCompra.add("leche");
        miListaDeLaCompra.add("manzanas");

        System.out.println("mi ista contiene " + miListaDeLaCompra);

        ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);

        miListaDeEnero.add("Harina");
        System.out.println("Mi lista de la compra es " + miListaDeLaCompra +" y mi lista de enero es "+ miListaDeEnero);

        System.out.println("el primer elemento de mi lista de compra de enero es " + miListaDeEnero.get(0));

        miListaDeEnero.set(1, "Leche entera");
        System.out.println("mi lista de enero es ahora "+ miListaDeEnero);

        miListaDeEnero.remove(0);
        System.out.println("mi lista eliminando es " + miListaDeEnero);

        miListaDeEnero.remove("manzanas");
        System.out.println("mi lista con otr elemento eliminado es" + miListaDeEnero);

        miListaDeEnero.size();
    }
}
