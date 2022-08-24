public class Series_Maclaurin {
    
    double coeficiente, Sm,x=0;
    int exponente,n1=10;
    funciones funcion= new funciones();

    Double sen(Double x,int n){
        Sm=0;

        for (int i=0;i<n1;i++){
            exponente=(int) (2*i+1);
            coeficiente=Math.pow(-1.0, i)/funcion.factorial(exponente);
            Sm+=coeficiente*Math.pow(x,exponente);
        }
        return Sm;
    }

    Double cos(double x, int n){
        Sm=0;


        for (int i=0;i<n1;i++){
            exponente=(int)(2*i);
            coeficiente=Math.pow(-1.0,i)/funcion.factorial(exponente);
            Sm+=coeficiente*Math.pow(x,exponente);
        }
        return Sm;
    }

    Double exp(double x, int n){
        Sm=0;


        for(int i=0;i<n1;i++){
            Sm+=Math.pow(x,i)/funcion.factorial(i);
        }
        return Sm;
    }

    public static void main(String arg []){
        Double x=Math.PI;
        int n=15;

        Series_Maclaurin serie= new Series_Maclaurin();
        System.out.println("Seno de "+ x+": "+serie.sen(x,n));
        System.out.println("Coseno de "+ x+": "+serie.cos(x,n));
        System.out.println("Exponencial de "+ x+": "+serie.exp(x,n));
    }
}
