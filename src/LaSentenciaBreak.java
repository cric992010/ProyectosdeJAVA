public class LaSentenciaBreak {
    public static void main(String[] args) {
        int numeroencontrado;
        for (numeroencontrado = 2567; numeroencontrado <= 3642; numeroencontrado++){
            System.out.println("Sera el numero ? " + numeroencontrado);
            if ((numeroencontrado % 2 == 0) && (numeroencontrado % 3 == 0) && (numeroencontrado % 5 ==0)){
                break;
            }
        }
        if (numeroencontrado > 3642){
            System.out.println("No ahy ningun numero entre 2567 y 3642 que sea multiplo de 2,3 y 5");
        } else {
            System.out.println("numero encontrado " + numeroencontrado);
        }
    }
}
