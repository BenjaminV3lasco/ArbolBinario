
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
    public Nodo(Nodo ramaIzdo, Object dato, Nodo ramaDcho)
    {
    this.dato = dato;
    this.izdo = ramaIzdo;
    this.dcho = ramaDcho;
    }
     public Nodo getIzquierdo() {
        return this.izdo;
    }

    public void setIzquierdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDerecho() {
        return this.dcho;
    }

    public void setDerecho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    void visitar()
    {
    System.out.print(dato + " ");
    }
}
