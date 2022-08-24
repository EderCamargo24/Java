import java.util.Scanner;

public class listas {
    public static void main(String arg[]){
        byte n=0;
        byte[] listado;
        Scanner valor= new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        n=valor.nextByte();
        if (n!=0){
            listado=new byte[n];            
        }
    }
    
}
