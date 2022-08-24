public class BecaUniversitaria {


    private int tiempo;

    private double monto;

    private double interes;

    double comparar;
    String salida;

    public BecaUniversitaria() {
        tiempo = 0;
        monto = 0;
        interes = 0;
    }

    public BecaUniversitaria(int pTiempo, double pCapital, double pInteres) {
        this.tiempo = pTiempo;
        this.monto = pCapital;
        this.interes = pInteres;
    }


    public double calcularInteresSimple(){
        return (double) Math.round(monto*interes*tiempo/100);
    }


 
    public double calcularInteresCompuesto(){
        return (double) Math.round(monto*(Math.pow(1+interes/100,tiempo)-1));
    }

    

    public String compararInversion (int pTiempo, double pMonto, double pInteres){
    

        this.tiempo=pTiempo;
        this.monto=pMonto;
        this.interes=pInteres;
        
        // BecaUniversitaria metodo= new BecaUniversitaria();
        comparar=calcularInteresCompuesto()-calcularInteresSimple();
        
        salida=(comparar==0.0) ? "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada." :"La diferencia entre la proyección de interés compuesto e interés simple es: $"+
        comparar;

        return salida;
        }

        public String compararInversion (){
            comparar=calcularInteresCompuesto()-calcularInteresSimple();
            salida=(comparar==0.0) ? "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada." :"La diferencia entre la proyección de interés compuesto e interés simple es: $"+
        comparar;
            return salida;
        }
}
