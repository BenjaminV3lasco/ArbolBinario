package arbolbinario;
import java.util.Scanner;
public class ArbolBinario {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        ArbolBinarioo arbol;
        Nodo t1, t2, t;
        PilaVector pila = new PilaVector();
        
        t1 = ArbolBinarioo.nuevoArbol(null, new Tarea ("Floki","Lou"), null);
        t2 = ArbolBinarioo.nuevoArbol(null, new Tarea("Rocki", "Lou"), null);
        t  = ArbolBinarioo.nuevoArbol(t1, new Tarea("Lena", "Emma"), t2);

        pila.insertar(t);

        t1 = ArbolBinarioo.nuevoArbol(null, new Tarea("sad","asdasd"), null);
        t2 = ArbolBinarioo.nuevoArbol(null, new Tarea("Pitu", "Vale"), null);
        t = ArbolBinarioo.nuevoArbol(t1, new Tarea ("Birra", "Mica"), t2);

        pila.insertar(t);

        t2 = (Nodo) pila.quitar();
        t1 = (Nodo) pila.quitar();
        t = ArbolBinarioo.nuevoArbol(t1,new Tarea("Nerom", "Agus"), t2);
        arbol = new ArbolBinarioo(t);
        //Menú
        do{
            System.out.println("\n¡Buenos dias!");
            System.out.println("Ingrese 1 para recorrer el árbol en Inorden");
            System.out.println("Ingrese 2 para recorrer el árbol en Preorden");
            System.out.println("Ingrese 3 para recorrer el árbol en Postorden");
            System.out.println("Ingrese 4 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>4){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para recorrer el árbol en Inorden");
                System.out.println("Ingrese 2 para recorrer el árbol en Preorden");
                System.out.println("Ingrese 3 para recorrer el árbol en Postorden");
                System.out.println("Ingrese 4 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                    System.out.println("Recorrido en Inorden:");
                    
                    arbol.inorden(t);
                    break;
               case 2:
                    
                    System.out.println("Recorrido en Preorden:");
                    ;
                    arbol.preorden(t);
                    break;
               case 3:
                    
                    System.out.println("Recorrido en Postorden:");
                    
                    arbol.postorden(t);
                    break;
                }    
        }while(respuesta<4);
    }
}
