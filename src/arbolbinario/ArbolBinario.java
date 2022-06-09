package arbolbinario;
import java.util.Scanner;
public class ArbolBinario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        ArbolBinario arbol;
        Nodo num1, num2, num;
        PilaVector pila = new PilaVector();
        do{
            System.out.println("¡Buenos dias!");
            System.out.println("Ingrese 1 para insertar un nodo");
            System.out.println("Ingrese 2 para eliminar un nodo");
            System.out.println("Ingrese 3 para recorrer el árbol");
            System.out.println("Ingrese 4 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>4){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar un nodo");
                System.out.println("Ingrese 2 para eliminar un nodo");
                System.out.println("Ingrese 3 para recorrer el árbol");
                System.out.println("Ingrese 4 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                    
                    break;
               case 2:
                    
                    break;
               case 3:
                    
                    break;
                }    
        }while(respuesta<4);
    }
}
