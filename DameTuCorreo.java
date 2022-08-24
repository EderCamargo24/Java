import java.util.Scanner;

public class DameTuCorreo {
    public static void main(String arg[]){
        Scanner dato=new Scanner(System.in);
        System.out.print("Introduce tu email: ");
        String email=dato.nextLine();
        do{
            System.out.println("Tu email no es válido.");
            System.out.print("Introduce tu email: ");
            email=dato.next();

        }while(email.indexOf("@")<0||email.length()<3);{
        System.out.println("Tu dirección de correo electrónico ha sido admitida.");
    }
}
}
