public class logica{
    public static void main(String[] args) {
        boolean a=true,b=false;
        boolean c1,c2,c3,c4;
        //Tabla de verdad para la conjunción
        c1=a && a;
        c2=a && b;
        c3=b && a;
        c4=b && b;
        System.out.println("\nTabla de verdad para la conjunción\n");
        System.out.println(a+" & "+a+" : "+c1);
        System.out.println(a+" & "+b+" : "+c2);
        System.out.println(b+" & "+a+" : "+c3);
        System.out.println(b+" & "+b+" : "+c4);
        //Tabla de verdad para la disjunción
        c1=a||a;
        c2=a||b;
        c3=b||a;
        c4=b||b;
        System.out.println("\nTabla de verdad para la disjunción\n");
        System.out.println(a+" o "+a+" : "+c1);
        System.out.println(a+" o "+b+" : "+c2);
        System.out.println(b+" o "+a+" : "+c3);
        System.out.println(b+" o "+b+" : "+c4);

        //Tautología

        
    }
}
