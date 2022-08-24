import java.util.Scanner;

public class for_sumatoria_n {
    public static void main(String arg []){
        long s=0;
        int m,n,t=1;
        Scanner valor= new Scanner(System.in);
        System.out.print("\nIngrese el valor desde donde inicia la sumatoria.\ni = ");
        m=valor.nextInt();
        System.out.print("\nAhora ingrese el valor donde finaliza la sumatoria.\nn = ");
        n=valor.nextInt();
        if (n<m){
            t=m;
            m=n;
            n=t;
        }
        for (int i=m;i<=n;i++){
            s+=i;
        }
        System.out.println("\nLa sumatoria desde i="+m+" hasta n="+n+" es: "+s+"\n");
    }
}
