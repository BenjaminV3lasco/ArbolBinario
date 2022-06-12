package arbolbinario;
import java.util.Scanner;
public class ArbolBinario {

        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int respuesta, respuesta_arbol;
        ArbolBinarioo arbol;
        Nodo t1, t2, t;
        PilaVector pila = new PilaVector();
        
         t1 = ArbolBinarioo.nuevoArbol(null, new Tarea ("Tarea N°1","Pensar el algoritmo"), null);
         t2 = ArbolBinarioo.nuevoArbol(null, new Tarea("Tarea N°2", "Plantearlo en papel"), null);
         t  = ArbolBinarioo.nuevoArbol(t1, new Tarea("Tarea N°3", "Escribirlo en un lenguaje de programación"), t2);
            pila.insertar(t);

        t1 = ArbolBinarioo.nuevoArbol(null, new Tarea("Tarea N°4","Crear funciones y métodos"), null);
        t2 = ArbolBinarioo.nuevoArbol(null, new Tarea("Tarea N°5", "Comprobar si compila"), null);
        t = ArbolBinarioo.nuevoArbol(t1, new Tarea ("Tarea N°6", "Subirlo a GitHub"), t2);
            pila.insertar(t);
        arbol = new ArbolBinarioo(t);
        
        //Menú
            System.out.println("¡Bienvenido al menú para crear un árbol binario!");
        do{
            System.out.println("\nIngrese 1 para insertar un nodo");
            System.out.println("Ingrese 2 para recorrer el árbol");
            System.out.println("Ingrese 3 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>3){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar un nodo");
                System.out.println("Ingrese 2 para recorrer el árbol");
                System.out.println("Ingrese 3 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                System.out.println("¡Los nodos fueron insertados de manera correcta!");
                    break;
                case 2:
                   System.out.println("¿Como desea recorrer el árbol?");
                   System.out.println("1. Recorrido Inorden");
                   System.out.println("2. Recorrido Preorden");
                   System.out.println("3. Recorrido Postorden");
                   respuesta_arbol=sc.nextInt();
                   sc.nextLine();
                    switch(respuesta_arbol){
                        case 1:
                    System.out.println("Recorrido en Inorden:");
                    arbol.inorden(t); 
                    break;
                        case 2:
                    System.out.println("Recorrido en Preorden:");
                    arbol.preorden(t);
                     break;
                        case 3:
                     System.out.println("Recorrido en Postorden:");
                     arbol.postorden(t);
                     break;
                    }
                    break;
                }    
        }while(respuesta<3);
    }
}
