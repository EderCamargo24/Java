import java.util.Scanner;

import javax.swing.ScrollPaneLayout;

public class par_impar {
    public static void main(String arg []) {
        /*
        Este programa permite saber si un número es par o impar
         */
        String a;
        Scanner var= new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n=var.nextInt();
        if (n%2==0)
            System.out.println("¡El número "+n+" es par!");
        else
            System.out.println("¡El número "+n+" es impar!");
        //El siguiente bloque de código hace lo mismo que el anterior
        a=(n%2==0) ? "¡El número "+n+" es par!" : "¡El número "+n+" es impar!";
        System.out.println(a);
    }
    
}
