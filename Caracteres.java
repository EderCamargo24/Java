public class Caracteres{
    public static void main(String[] args) {
        String letras="Hola, Mundo",numero="1230000";
        Float decimal=(float) 5.0;
        System.out.println("Mensaje: "+letras);
        System.out.println("Caracter: "+ decimal);
        /*
        Extraer los valores de una variable tipo String y convertirlos a un tipo específico.
        Para realizar esto, se hace uso del método tipo.valueOf(valor). De donde tipo es 
        el tipo al que se desea convertir: String, Boolean, Integer, Float, Double, Long, short, etc.
        Nota: si la variable es de tipo String y posee un punto decimar, si se desea convertir a tipo 
        Integer, no se podrá, ya que el método no lo permite.
        */
        System.out.println("\nMétodo valueOf()\n");
        System.out.println("Valores extaídos y convertidos:\n");
        System.out.println("Formato String: "+(String.valueOf(decimal)));
        System.out.println("Formato Boolean: "+Boolean.valueOf(numero));
        System.out.println("Formato Integer: "+Integer.valueOf(numero));
        System.out.println("Formato Float: "+Float.valueOf(numero));
        System.out.println("Formato Double: "+Double.valueOf(numero));
        System.out.println("Formato Long: "+Long.valueOf(numero));

        /*
        Convertir de una variable de tipo String a tipo numérico. Para esto, se hace uso del método 
        N_tipo.parseN_tipo(valor)
        Donde N_tipo es el tipo numérico al que se convertirá. Si se desea convertir un String que contiene 
        puntos a tipo numérico, no se podrá por este método.
        */
        String a="12",b="7.8",c="5.9";
        int n,m;
        float r,s;

        System.out.println("\nMétodo parse\n");

        n=Integer.parseInt(a);
        m=Integer.parseInt(a);
        r=Float.parseFloat(a);
        s=Float.parseFloat(b);

        System.out.println("Valor de n: "+ n);
        System.out.println("Valor de m: "+m);
        System.out.println("Valor de r: "+r);
        System.out.println("Valor de s: "+s);
        System.out.println("Valor de c: "+Float.valueOf(c));
        

    }
}