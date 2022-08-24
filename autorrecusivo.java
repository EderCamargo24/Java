import java.util.Scanner;

public class autorrecusivo {
    long factorial(Integer n){
        if (n>1){
            return n*factorial(n-1);
        }else if(n>=0) {
            return 1;
        }else {
            return -1;
        }
    }

    long sumatoria(Integer n){
        if (n>0){
            return n+sumatoria(n-1);
        }else if (n<0){
            return n+sumatoria(n+1);
        }else{
            return 0;
        }
    }

    long fibonacci(Integer n){
        
        if(n==0){
            return 0;
        }else if (n==1 || n==2){
            return 1;
        }else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void main(String arg []){
        int n;
        autorrecusivo metodo= new autorrecusivo();
        Scanner valor= new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n=valor.nextInt();
        System.out.println(n+"! = "+metodo.factorial(n));
        System.out.println("Sumatoria: "+metodo.sumatoria(n));
        System.out.println("Fibonacci: "+metodo.fibonacci(n));
    }
}
