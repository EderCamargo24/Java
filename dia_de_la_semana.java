import java.util.Scanner;

public class dia_de_la_semana {
    public static void main(String arg []){

        System.out.println(
            "\nEste programa permite encontrar el día de la semana, suponiendo que el calendario gregoriano "+
            "ha existido siempre y no se le realizará ningún ajuste. Para poder encontrar el día de la semana, "+
            "basta con indicar primero el año, luego el número del mes y, por último, el día del mes.\n"
        );

        Short year,x;
        byte mes,dia,nb,b;
        String N_mes,Enunciado;
        Scanner fecha= new Scanner(System.in);
        System.out.print(
            "Ingrese el año: "
        );
        year=fecha.nextShort();
        System.out.print(
            "Ingrese el mes: "
        );
        mes=fecha.nextByte();
        if (mes>12){
            System.out.print("Hasta la fecha, solo se conoce máximo 12 meses. \nCorrige el mes: ");
            mes=fecha.nextByte();
        }
        System.out.print(
            "Ingrese el día: "
        );
        dia=fecha.nextByte();
        if (dia>31){
            System.out.print("Hasta la fecha, solo se conocen meses con máximo 31 días. \nCorrige el día: ");
            dia=fecha.nextByte();
        }
        
        switch(mes){
            case 1:
            nb=0;
            b=0;
            N_mes="Enero";
            break;
            case 2:
            nb=3;
            b=3;
            if ( dia==29) {
                Boolean Bisiesto;
                Bisiesto=(year%100==0 && year%400!=0) ?false:year%4==0;
                if (!Bisiesto){
                 System.out.print(
                    "Para el año "+year+", el mes de febrero solo tiene 28 días. Corrija el día\nDía: "
                );
                dia=fecha.nextByte();
                }
            }else{
                if (dia>28){
                    System.out.print(
                    "El mes de febrero solo tiene 28 días. Corrija el día\nDía: "
                );
                dia=fecha.nextByte();
                }
            }
            
            N_mes="Febrero";
            break;
            case 3:
            nb=3;
            b=4;
            N_mes="Marzo";
            break;
            case 4:
            nb=6;
            b=0;
            N_mes="Abril";
            break;
            case 5:
            nb=1;
            b=2;
            N_mes="Mayo";
            break;
            case 6:
            nb=4;
            b=5;
            N_mes="Junio";
            break;
            case 7:
            nb=6;
            b=0;
            N_mes="Julio";
            break;
            case 8:
            nb=2;
            b=3;
            N_mes="Agosto";
            break;
            case 9:
            nb=5;
            b=6;
            N_mes="Septiembre";
            break;
            case 10:
            nb=0;
            b=1;
            N_mes="Octubre";
            break;
            case 11:
            nb=3;
            b=4;
            N_mes="Noviembre";
            break;
            case 12:
            nb=5;
            b=6;
            N_mes="Diciembre";
            break;
            default:
            nb=-1;
            b=-1;
            N_mes="";
            System.out.print("mes no conteplado");
        }
    

        x=
        b<0 ? -1:
        (short) (year%4==0 ? ((year-1)%7+((year-1)/4-( 3*(((year-1)/100 +1)/4)))%7+b+dia%7)%7:
        (short)((year-1)%7+((year-1)/4-( 3*(((year-1)/100 +1)/4)))%7+nb+dia%7)%7);

        Enunciado="Para la fecha "+dia+" de "+N_mes+" de "+year+" el día es: ";

        switch(x){
            case 0:
                System.out.print(Enunciado+"Domingo");
                break;
            case 1:
                System.out.print(Enunciado+"Lunes");
                break;
            case 2:
                System.out.print(Enunciado+"Martes");
                break;
            case 3:
                System.out.print(Enunciado+"Miércoles");
                break;
            case 4:
                System.out.print(Enunciado+"Jueves");
                break;
            case 5:
                System.out.print(Enunciado+"Viernes");
                break;
            case 6:
                System.out.print(Enunciado+"Sábado");
                break;
            default:
                System.out.print(" fecha no contemplada");
                break;
        }
    }
}
