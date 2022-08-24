import java.util.Scanner;

public class for_factorial {
    public static void main(String arg []){
        long n,f=1;
        Scanner valor= new Scanner(System.in);
        System.out.print("\nIngrese el número para poder hallar su factorial: ");
        n=valor.nextLong();
        for (int i=2;i<=n;i++){
            f*=i;
        }
        System.out.print(n+"! = "+f);
    }
}
