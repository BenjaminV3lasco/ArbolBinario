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
    
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha)
    {
    return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
}
