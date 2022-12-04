package es;

import java.util.Scanner;

/**
 * Esta app hace
 *
 * @Autor Kevin Castillo
 */
public class BuscarCadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringBuilder subcadena = new StringBuilder();
        StringBuilder subcadena1 = new StringBuilder();
        StringBuilder subcadena2 = new StringBuilder();
        System.out.print("Escribe la cadena  de caracteres: ");
        subcadena.append(leer.nextLine());
        if (BuscarCadena.Espar(subcadena1.length())) {
            subcadena1.append(subcadena.substring(subcadena.length()/2));
        }else{
            subcadena1.append(subcadena.substring((subcadena.length()/2)+1));
        }
         subcadena2.append(subcadena.substring(0,subcadena.length()/2));
         System.out.println("La primera subcadena es "+ subcadena2);
         System.out.println("La segunda subcadena es "+subcadena1);
         System.out.println("La salida solicitada es "+subcadena1.append(subcadena2));
    }
    public static boolean Espar(int num) {
        boolean par = false;
        if (num % 2 == 0) {
            par = true;
        }
        return par;
    }
}
