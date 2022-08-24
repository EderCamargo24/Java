public class BecaUniversitaria {
    //
    // Atributos
    private int tiempo=0;
    private double monto=0, interes=0;
    //
    // ...
    //
    // Constructores
    //
    // ...
    //
    // Métodos
    //
    public double calcularInteresSimple(){
        return Math.round(monto*interes*tiempo/100);
    }

    // ...
    public double calcularInteresCompuesto(){
        return Math.round(monto*(Math.pow(1+interes/100,tiempo)-1));
    }
    // ...
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        double comparar;
        String salida;

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
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }
}



    // ...
    //Sección principal: Instanciación de clase y uso de métodos.

    

    public static void main(String arg []){
        BecaUniversitaria probar= new BecaUniversitaria();
        System.out.println(probar.calcularInteresSimple());
        System.out.println(probar.calcularInteresCompuesto());
        System.out.println(probar.compararInversion(60,13000,1.4));
        System.out.println(probar.compararInversion());

    }
}
