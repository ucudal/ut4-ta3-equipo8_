
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolBB arbol = new TArbolBB();
        TArbolBB arbol2 = new TArbolBB();

        // cargar las claves del archivo "claves.txt"
        arbol.insertar(new TElementoAB(10, null));
        arbol.insertar(new TElementoAB(1, null));
        arbol.insertar(new TElementoAB(84, null));
        arbol.insertar(new TElementoAB(20, null));
        arbol.insertar(new TElementoAB(45, null));
        arbol.insertar(new TElementoAB(23, null));
        arbol.insertar(new TElementoAB(7, null));
        arbol.insertar(new TElementoAB(100, null));
        
        System.out.println(arbol.obtenerTamanio());
        System.out.println(arbol2.obtenerTamanio());

    }

}
