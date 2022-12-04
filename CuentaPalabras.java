package es;

import java.util.Scanner;

/**
 * Esta app cuenta las palabras que se le introduzcan por teclado
 *
 * @Autor Kevin Castillo
 */
public class CuentaPalabras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        System.out.print("Introduce la cadena de caracteres: ");
        texto = leer.nextLine();
        //Control + Click sobre el nombre de las funciones para seguir el codigo 
        CuentaPalabras.separarPalabras(texto);
    }

    /**
     * Cuenta la cantidad de caracteres en el texto en este caso espacios
     *
     * @param cadena
     * @param caracter
     * @return numero de veces que se repite (int)
     */
    public static int contarRepeticion(String cadena, char caracter) {
        int total = 0;
        char carac;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length() - 1; i++) {
            //Convertirmos la cadena a un caracter con inidice i
            carac = cadena.charAt(i);
            //Comparamos si el caracter ya existe aumentamos uno al contador
            if (caracter == carac) {
                total++;
            }
        }
        return total;
    }

    /**
     * Funcion que separa las palabras
     *
     * @param texto
     */
    public static void separarPalabras(String texto) {
        int num, espacioP;
        StringBuilder str = new StringBuilder();
        //Debemos eliminar los espacios que tenga al inicio o al final del texto con trim
        texto = texto.trim();
        str.append(texto);
        //Utilizamos la variable que usamos antes para contar cuantos espacios hay en total del texto
        num = CuentaPalabras.contarRepeticion(texto, ' ');
        //Controlamos que si el usuario pone un campo vacio o un solo texto devuelva uno o cero
        if (num == 0 && !"".equals(texto)) {
            System.out.println("El numero de palabras es de 1");
        } else {
            System.out.println("El  numero de palabras es de " + num);
        }
        for (int i = 0; i < num; i++) {
            //retorna la posicion del primer espacio que encuentra
            espacioP = str.indexOf(" ");
            //Imprime lo que tenga la subcadena ubicada entre el inicio del texto y la posicion que encontro el espacio
            System.out.println(str.substring(0, espacioP));
            //Eliminamos la que ya fue impresa para que la proxima vez que encuentre un espacio sea una subcadena nueva
            //Sumamos uno para correr el espacio que esta separando la nueva palabra
            str.delete(0, espacioP + 1);
        }
        //Agrego este print final para escribir lo que quedo de la subcadena luego de borrar todas las separadas por espacios
        System.out.println(str);
    }
}
