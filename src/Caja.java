public class Caja<T> {
    T elemento;
    Caja(T elemento){
        this.elemento=elemento;
    }

    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean perteneceElContenidoAlaMISMaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }
}

//Clase de tipo generico