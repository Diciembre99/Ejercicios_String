
package es;

import java.util.Scanner;

/**
 *Esta app hace 
 * @Autor Kevin Castillo
 */
public class ComparaCadenas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String texto, texto2;
        System.out.print("Introduce la primera cadena de caracterers: ");
        texto= leer.nextLine();
        System.out.print("Introduce la segunda cadena de caracteres: ");
        texto2=leer.nextLine();
        if (texto.compareToIgnoreCase(texto2)==0) {
            System.out.println("La cadena de caracteres son iguales");
        }else{
            if (texto.compareToIgnoreCase(texto)>0) {
                System.out.println("La cadena uno es menor que la dos");
                
            }else{
                System.out.println("La cadena uno es mayor que la dos");
            }
        }
        
        
    }
}
