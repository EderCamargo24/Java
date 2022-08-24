import java.util.Scanner;

public class Imprimir_par_o_impar {
    public static void main(String arg[]){
        Scanner respuesta= new Scanner(System.in);
        String par_impar;
        byte r;
        int n,m;
        System.out.print("Ingrese 1 si desea imprimir los primeros n impares.\n"+
        "Ingrese 2 si desea imprimir los primeros n pares. \nRespuesta: ");
        r=respuesta.nextByte();
        
        switch (r){
            case 1:
            par_impar="impares";
            break;
            case 2:
            par_impar="pares";
            break;
            default:
            par_impar="";
            break;
        }
        if (r==1 || r==2){
            System.out.print("Ingrese el número de "+par_impar+" que desea encontrar.\nRespuesta: ");
            n=respuesta.nextInt();
            m=1;
        }else{
            n=0;
            m=n;
        }
        for (int i=m;i<=n;i++){
            switch(r){
                case 1:
                System.out.println(2*i-1);
                break;
                case 2:
                System.out.println(2*i);
                break;
                default:
                System.out.println("Usted no seleccionó una opción correcta.");
                break;

            }
        }
    }
}
