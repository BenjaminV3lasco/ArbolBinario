package arbolbinario;

public class ArbolBinarioo {
    protected Nodo raiz;
    
    public ArbolBinarioo()
    {
    raiz = null;
    }
    
    public ArbolBinarioo(Nodo raiz)
    {
    this.raiz = raiz;
    }
    
    public Nodo getRaiz() {
        return this.raiz;
    }
    
    public Nodo raizArbol()
    {
    return raiz;
    }
    
    // Comprueba el estatus del árbol
    boolean esVacio()
    {
    return raiz == null;
    }
    
    public static Nodo nuevoArbol(Nodo ramaIzdo, Object dato, Nodo ramaDcho)
    {
    return new Nodo(ramaIzdo, dato, ramaDcho);
    }
    // Recorrido de un árbol binario en preorden
    public void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.getIzquierdo());
            preorden(r.getDerecho());
        }
    }

    // Recorrido de un árbol binario en inorden
    public void inorden(Nodo r) {
        if (r != null) {
            inorden(r.getIzquierdo());
            r.visitar();
            inorden(r.getDerecho());
        }
    }

    // Recorrido de un árbol binario en postorden
    public void postorden(Nodo r) {
        if (r != null) {
            postorden(r.getIzquierdo());
            postorden(r.getDerecho());
            r.visitar();
        }
    }
}
