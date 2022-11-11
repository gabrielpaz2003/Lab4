/******************************************************************
* 
* Author: Gabriel Paz. 
* Carnet 221087
* Author: Sergio Orellana
* Carné: 221122
* Author: Andre Marroquin
* Carné: 22266
* Fecha de edicion 11-11-22
* 
 * This class defines the methods of interface CarC. It is a concrete class and
 * will be instanced by the main Ctrl class to perform the user actions.
 * 
 ******************************************************************/

public class RadioC extends Radio implements CarC {

    /**
     * Sirve para poner la llamada en espera
     */
    public void Hold() {
        System.out.println("Tu llamada esta en espera");
    }

    /**
     * Sirve para poner el pronostico del carro tipo A
     */
    public void Weather() {
        System.out.println("El pronostico del clima es que habra frio (asumiendo que todavia es noviembre)");
    }

}
