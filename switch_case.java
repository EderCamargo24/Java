import java.util.Scanner;

public class switch_case {
    public static void main(String arg []){
        byte mes;
        short year;
        Scanner fecha= new Scanner(System.in);
        System.out.print("\nInserte el número del mes: ");
        mes=(byte) fecha.nextByte();
        switch(mes){
            case 1:case 3: case 5: case 7: case 8: case 10 : case 12:
            System.out.println(
                "El mes número "+mes+" tiene 31 días."
            );
            break;
        case 2:
            System.out.print(
                "Debido a que el mes "+mes+" depende de si el año es biciesto o no, necesitamos "+
                "saber el año para el cual requiere saber los días de este mes.\n"+
                "Inserte el año: "
            );
            year=(short) fecha.nextShort();
            if (year%4==0){
                System.out.print(
                "El mes número "+mes+
                " del año "+year+" tiene 29 días."
                );
            }else
             System.out.print(
                    "El mes número "+mes+
                    " del año "+year+" tiene 28 días."
                );
            break;
        case 4: case 6: case 9: case 11:
            System.out.print(
                "El mes número "+mes+" tiene 30 días."
            );
            break;
        default:
            System.out.print(
                "Mes no contemplado"
            );
        }        
    }

}
