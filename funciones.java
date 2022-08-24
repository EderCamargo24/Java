import java.util.Scanner;
public class funciones {
    long factorial(long n){
        long f=1;
        if (n<0){
            f=-1;
        }else if(n<=1){
            f=1;
        }else{
            for(long i=2;i<=n;i++){
                f*=i;
            }
        }
        return f;
    }
    long sumatoria(long n){
        long s=0;
        for (long i=0;i<=n;i++){
            s+=i;
        }
        return s;
    }

    public static void main(String arg []){
        long n;
        Scanner valor= new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n=valor.nextLong();
        funciones resultado= new funciones();
        System.out.print("Resultado de "+n+"! es: "+resultado.factorial(n)+
        " y el resultado de la sumatoria desde i=1 hasta n="+n+" es: "+resultado.sumatoria(n));


    }

}
