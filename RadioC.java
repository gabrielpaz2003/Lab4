
/******************************************************************
 * 
 * Author: Gabriel Paz. Andre Marroquin, Carnet 221087, 22266 Fecha de edicion 10-11-2022
 * 
 * This class defines the methods of interface CarC. It is a concrete class and
 * will be instanced by the main Ctrl class to perform the user actions.
 * 
 ******************************************************************/

public class RadioC extends Radio implements CarC {

    public void Hold() {
        System.out.println("Tu llamada esta en espera");
    }

    public void Weather() {
        System.out.println("El pronostico del clima es que habra frio (asumiendo que todavia es noviembre)");
    }

}
