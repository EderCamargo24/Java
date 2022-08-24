/*******************************
 * Metodo_charAt.java
 * LordSirama
 * 
 * Pese a que este programa se llama Metodo_charAt, también recoge otros métodos como length
 * y el equals.
 */
import java.util.Scanner;

public class Metodo_charAt {
    public static void main(String arg []){
        Scanner leer=new Scanner(System.in);
        String palabra;
        byte n,m;
        System.out.print("Ingrese una palabra o frase: ");
        palabra=leer.nextLine();
        m=(byte) palabra.length();
        m--;
        System.out.print("Digite un valor entre 0 y "+m+": ");
        n=leer.nextByte();
        if (n>=0 && n<=m){
            System.out.print(
                "En la posición "+n+
                " se encuentra el caracter "+palabra.charAt(n)
                );
        }else{
            System.out.print(
                "Lo siento, no digitaste un valor entre "+0+" y "+m--
            );
        }

        
        
    }
    
}
