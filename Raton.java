/*****************************************************************
* Raton.java
* Dean & Dean
*
* Este programa solicita al usuario adivinar un número seleccionado
* de manera aleatoria.
*****************************************************************/

public class Raton {
    private int edad = 0; // edad del ratón en días
    private double peso = 1.0; // peso del ratón en gramos
    private double tasaCrecimientoPorcentual; // incremento por día
    //*********************************************************

    // Este metodo asigna la tasa de crecimiento del raton.
    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual)
    {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    } // fin setTasaCrecimientoPorcentual

    //*********************************************************
    // Este método simula un día de crecimiento para un ratón.

    public void crecer()
    {
        this.peso +=(.01 * this.tasaCrecimientoPorcentual * this.peso);
        this.edad++;
    } // fin crecer

    //*********************************************************

    // Este método imprime la edad y peso del ratón.
    public void desplegar()
    {
        System.out.printf("Edad = %d, peso = %.3f\n",
        this.edad, this.peso);
    } // fin desplegar
} // fin de la clase Raton

