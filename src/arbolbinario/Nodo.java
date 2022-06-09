
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
    this.dato = dato;
    this.izdo = izdo;
    this.dcho = dcho;
    }
     public Nodo getIzquierdo() {
        return this.izdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izdo = izdo;
    }

    public Nodo getDerecho() {
        return this.dcho;
    }

    public void setDerecho(Nodo derecho) {
        this.dcho = dcho;
    }
    
    void visitar()
    {
    System.out.print(dato + " ");
    }
}
