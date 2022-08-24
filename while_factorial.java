import java.util.Scanner;

public class while_factorial {
    public static void main(String arg []){
        long n,f=1;
        String valor;
        Scanner respuesta= new Scanner(System.in);
        System.out.print("\nIngrese un número entero: ");
        n=respuesta.nextLong();
        valor=String.valueOf(n);
        while (n>0){
            f*=n;
            n--;
        }
        System.out.print(valor+"! = "+f);
    }
}
