import java.util.Scanner;

public class do_while_factorial {
    public static void main(String args []){
        long f,n;
        String valor;
        Scanner respuesta= new Scanner(System.in);
        System.out.print("\nIngrese un número entero: ");
        n=respuesta.nextLong();
        f=n>0 ?(long) n:1;
        valor=String.valueOf(n);
        do{
            n--;
            f*=n>0 ? n:1;
        }while(n>0);
        System.out.print(valor+"! = "+f);
    }
}
