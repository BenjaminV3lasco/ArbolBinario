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
}
