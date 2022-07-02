import java.util.Scanner;

public class Clasificar_triangulos {
    public static void main(String arg []){
        /*
        Este programa pide las dimensiones de los lados de un triángulo 
        y retorna la clasificación de un triángulo según las mediddas de sus lados, así como su área
        y la longitud de sus alturas.
         */

        System.out.println(
            "\nEste programa pide las dimensiones de los lados de un triángulo "+
            "y retorna su clasificación según las mediddas de sus lados, así como, su área, "+
            "y la longitud de sus alturas."
            );

        Scanner lado= new Scanner(System.in);//Este método iniciacila una variable que permite luego obtener valores por consola
        String valor;
        float a,b,c,Ar,s;
        Boolean llave,c1=false,c2=false;

        System.out.print("\nIngrese la longitud de lado a: ");
        valor= lado.next();//El método .next() permite leer por teclado y almacenar la lectura en una var tipo String
        a=Float.parseFloat(valor);//El método Float.paseFloat(valor) convierte una variable tipo String a tipo Float
        System.out.print("Ingrese la longitud de lado b: ");
        valor=lado.next();
        b=Float.parseFloat(valor);
        System.out.print("Ingrese la longitud de lado c: ");
        valor=lado.next();
        c=Float.parseFloat(valor);
        System.out.println("\na= "+a+"\nb= "+b+"\nc= "+c);


        /*
        Este segmento de código verifica que los lados suministrados sean los de un triángulo.
        */
        llave= (a>=b+c || b>=a+c || c>=a+b) ? false: true;//El método condicion ? valor si: valor no, es equivalente a un if(){} else{}

        /*
         Este bloque clasifica un triángulo según sus lados en: Equilatero, Isosceles o escaleno.
        */
        
        if ((a==b && a==c) && llave){
            System.out.println("\nEl triángulo de lados "+a+", "+b+", "+c+" es equilatero\n");
        }else if ((a==b || a==c || b==c) && llave){
            System.out.println("\nEl triángulo de lados "+a+", "+b+", "+c+" es Isosceles\n");
        }else if (llave){
            System.out.println("\nEl triángulo de lados "+a+", "+b+", "+c+" es Escaleno\n");
        }else{
            System.out.println("\nLos valores "+a+", "+b+", "+c+" no corresponden a los lados de un triángulo\n");
        }

        /* 
          Este bloque clasifica un triángulo según sus ángulos: Obtusángulo, Acutángulo o Rectángulo.
        */

        if (llave){
            c1=
                /*
                A continuación, se usa el teorema de pitágoras para determinar si el triángulo es rectángulo.
                */

                Math.pow(a, 2)==Math.pow(b,2)+Math.pow(c,2) || 
                Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2) || 
                Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2);
                //El método Math.pow(a,n), permite calucular el equivalente a a**n
        
            c2=
                /*
                Aquí se aplica el método del if simple. Se toma información de si el triángulo es rectángulo
                para así determinar si es obtusángulo o acutángulo, en caso de no ser rectángulo. 
                Básicamente, se busca que si almenos el coseno de uno de sus ángulos es menor a cero, esto es
                suficiente para afirmar que existe un ángulo obtuso.
                Para este caso, se usa el teoréma del coseno, y se usa la definición de que el coseno de un ángulo 
                entre 90° y 180° es menor a cero.
                */
                c1 ? false:
                (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)<0 ||
                (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c)<0 ||
                (Math.pow(a,2)+Math.pow(c,2)-Math.pow(c,2))/(2*a*c)<0;
            }

        if (c1){
            System.out.println("¡Y también es Rectángulo!\n");
        }else if (c2){
            System.out.println("¡Y también es Obtusángulo!\n");
        }else if (llave){
            /*
            Aquí se usa la información de si las medidas de los lados corresponden a un triángulo. Si se ha llegado
            hasta aquí, es porque se ha descartado que el triángulo formado por las medidas suministradas para sus lados
            no corresponde a un triángulo rectángulo ni a uno obtusángulo.
            */
            System.out.println("¡Y también es Acutángulo!\n");

            /*
            Para hallar el área se usa el teorema de Erón, el cual establece que el área de cualquier triángulo 
            es equivalente a la raíz cuadrada del producto de su semiperímetro por la diferencia de éste con cada
            medida de los lados del triángulo.
            */
            s=(a+b+c)/2;
            Ar=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));//El método Math.sqrt(a) es el equivalente a extraer raíz cuadrada
            System.out.println("El área es "+Ar+" unidades cuadradas");
            System.out.println(
                "Las alturas para las bases "+
                "("+a+", "+b+", "+c+") son, en su respectivo orden, "+
                "("+2*Ar/a +", "+2*Ar/b +", "+2*Ar/c +")\n"
                );
        }

    }
}
