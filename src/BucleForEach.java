public class BucleForEach {
    public static void main(String[] args) {
        int[] numeros = {4, 8, -6, 128, 64, -36, 73, -5, -44, 8};

        int minimo, maximo;
        minimo = maximo = numeros[0];

        for(int i = 0; i <= numeros.length - 1; i++){
            if(numeros[i] > maximo) maximo = numeros[i];
            if(numeros[i] < minimo) minimo = numeros[i];
        }
        System.out.println("El valo minimo del array es " + minimo + " Y el valor maximo del array es "+ maximo);

        minimo = maximo = numeros[0];

        for (int entero: numeros){
            System.out.println("en esta ireacion entero tiene el valor de " + entero);
            if(entero>maximo) maximo = entero;
            if(entero<minimo) minimo = entero;
        }
        System.out.println("El valo minimo del array es " + minimo + " Y el valor maximo del array es "+ maximo);

        int[][] arrayDeDosDimensiones = {{8,2,6}, {-6,3,0}, {-10, 6, 6}, {-10,6,6}};
        for (int[] arrayDeUnaDimension: arrayDeDosDimensiones){
            System.out.println("en esta iteracion ArrayDeUnaDimension contiene " + arrayDeUnaDimension.toString());
        }
    }
}
