import java.util.Scanner;

public class bisiesto {
    public static void main(String  arg []){
        Boolean Bisiesto=false;
        Scanner fecha= new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int year=fecha.nextInt();
        Bisiesto=(year%100==0 && year%400!=0) ?false:year%4==0;
        if (Bisiesto){
            System.out.print("El fecha "+year+" es bisiesto");
        }else{
            System.out.print("El fecha "+year+" no es bisiesto");
        }   
    }
}
