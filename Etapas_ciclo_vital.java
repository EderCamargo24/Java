import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Etapas_ciclo_vital {
    public static void main(String arg []){
        Scanner edad= new Scanner(System.in);
        System.out.print("\nIngrese su edad en años: ");
        byte Edad=edad.nextByte();
        if (Edad<=5){
            System.out.println("Primera Infancia");
        }else if (Edad<=11){
            System.out.println("Infancia");
        }else if(Edad<18){
            System.out.println("Juventud y Adolescencia");
        }else if (Edad<=26){
            System.out.println("Adulto joven");
        }else if(Edad<60){
            System.out.println("Adulto");
        }else{
            System.out.println("Persona mayor");
        }
    }
    
}
