
package arbolbinario;

public class Nodo
{
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    public Nodo(Object valor)
    {
    dato = valor;
    izdo = dcho = null;
    }
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho)
    {
    this(dato);
    izdo = ramaIzdo;
    dcho = ramaDcho;
    }
    // Operaciones de acceso
    public Object valorNodo(){ return valor; }
    public Nodo subarbolIzdo(){ return izdo; }
    public Nodo subarbolDcho(){ return dcho; }
    public void nuevoValor(Object d){ dato = d; }
    public void ramaIzdo(Nodo n){ izdo = n; }
    public void ramaDcho(Nodo n){ dcho = n; }
}
