
package es;

import java.util.Scanner;

/**
 *Esta app compara dos Strings y te dice cual es la mayor
 * @Autor Kevin Castillo
 */
public class ComparaCadenas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto, texto2;
        //Hacemos que el usuario inserte las dos cadenas
        System.out.print("Introduce la primera cadena de caracterers: ");
        texto= leer.nextLine();
        System.out.print("Introduce la segunda cadena de caracteres: ");
        texto2=leer.nextLine();
        //Para saber cual es mayor debemos usar compareToIgnoreCase para no tener encuenta si son mayusculas o no
        //La igualamos a cero porque este atributo retorna 0 si son iguales y menos de cero si son menores o mas que cero si son mayores
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
