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
    public Nodo raizArbol()
    {
    return raiz;
    }
    // Comprueba el estatus del árbol
    boolean esVacio()
    {
    return raiz == null;
    }
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha)
    {
    return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    
    
    public static void preorden(Nodo r)
    {
    if (r != null)
    {
    r.visitar();
    preorden (r.subarbolIzdo());
    preorden (r.subarbolDcho());
    }
    }
    // Recorrido de un árbol binario en inorden
    public static void inorden(Nodo r)
    {
    if (r != null)
    {
    inorden (r.subarbolIzdo());
    r.visitar();
    inorden (r.subarbolDcho());
    }
    }
    // Recorrido de un árbol binario en postorden
    public static void postorden(Nodo r)
    {
    if (r != null)
    {
    postorden (r.subarbolIzdo());
    postorden (r.subarbolDcho());
    r.visitar();
    }
    }
}
