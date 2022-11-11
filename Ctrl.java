
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
* This is the main part of the program and will control the user inputs
* 
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Ctrl {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Crear perro y pe
        int opcion = 0;
        Vista UserView = new Vista();

        /******************************************************************
         * 
         * We create the 3 different types of radios we will be using during the
         * simulation
         * 
         ******************************************************************/

        RadioC RadioTipoC = new RadioC();

        /******************************************************************
         * 
         * These are some general purpose lists that will help the user test the program
         * 
         ******************************************************************/

        ArrayList<String> EmisoraList = new ArrayList<String>();
        ArrayList<String> Contacts = new ArrayList<String>();

        EmisoraList.add("Yosi sideral");
        EmisoraList.add("Mente fresca");
        EmisoraList.add("Radio ranchera");
        EmisoraList.add("Emisora Unidas");

        Contacts.add("Mama");
        Contacts.add("Papa");
        Contacts.add("Tu crush");
        Contacts.add("That old highschool friend you keep meaning to call");

         /******************************************************************
        * 
        * These options will be all centered around Radio type C
        * 
        ******************************************************************/

        int OpcionRadioC = 1;

        while (OpcionRadioC >= 1 && OpcionRadioC <= 5) {

            UserView.SetRadioMode();
            try{
                OpcionRadioC = scan.nextInt();
                scan.nextLine();

                switch(OpcionRadioC){
                    case 1:{
                        int OpcionModoRadioC = 0;

                        while (OpcionModoRadioC != 6) {
                            scan = new Scanner(System.in);

                            UserView.ModoRadio();
                            OpcionModoRadioC = scan.nextInt();
                            scan.nextLine();

                            if (OpcionModoRadioC == 1) {

                                /******************************************************************
                                 * 
                                 * Raise volume
                                 * 
                                 ******************************************************************/

                                RadioTipoC.RaiseVolume(RadioTipoC);

                            } else if (OpcionModoRadioC == 2) {

                                RadioTipoC.LowerVolume(RadioTipoC);

                            } else if (OpcionModoRadioC == 3) {

                                RadioTipoC.ChangeStationUp(RadioTipoC);

                            } else if (OpcionModoRadioC == 4) {
                                RadioTipoC.ChangeStationDown(RadioTipoC);

                            } else if (OpcionModoRadioC == 5) {
                                RadioTipoC.SaveStation(EmisoraList);
                            }
                        }
                        break;
                    }
                    case 2:{
                        int OpcionModoReproduccionC = 0;

                        while (OpcionModoReproduccionC != 5) {
                            scan = new Scanner(System.in);

                            UserView.ModoReproduccion();
                            OpcionModoReproduccionC = scan.nextInt();
                            scan.nextLine();

                            /******************************************************************
                             * 
                             * Modo reproduccion
                             * 
                             ******************************************************************/

                            if (OpcionModoReproduccionC == 1) {

                                RadioTipoC.PlayPlaylist();

                            } else if (OpcionModoReproduccionC == 2) {

                                RadioTipoC.ChangeSongForward();

                            } else if (OpcionModoReproduccionC == 3) {

                                RadioTipoC.ChangeSongBackwards();

                            } else if (OpcionModoReproduccionC == 4) {
                                System.out.println("Ingresa la cancion que deseas escuchar");
                                String cancion = scan.nextLine();
                                System.out.println("Ahora mismo se esta escuchando la cancion " + cancion);
                            }
                        }
                        break;
                    }
                    case 3:{
                        int OpcionModoTelefonoC = 0;

                        while (OpcionModoTelefonoC != 5) {

                            UserView.ModoTelefono();
                            OpcionModoTelefonoC = scan.nextInt();
                            scan.nextLine();

                            if (OpcionModoTelefonoC == 1) {
                                RadioTipoC.ConnectPhone();

                            } else if (OpcionModoTelefonoC == 2) {

                                RadioTipoC.DisconnectPhone();

                            } else if (OpcionModoTelefonoC == 3) {

                                RadioTipoC.ShowContacts(Contacts);

                            } else if (OpcionModoTelefonoC == 4) {

                                RadioTipoC.MakeACall();
                            }

                        }

                        break;
                    }
                    case 4:{
                        int OpcionModoSpecialC = 0;

                        while (OpcionModoSpecialC != 3) {

                            System.out.println("Opciones especiales para carro A");
                            System.out.println("1. Poner llamada en hold");
                            System.out.println("2. Mostrar Pronostico del clima");
                            System.out.println("3. Salir de esta opcion");
                            OpcionModoSpecialC = scan.nextInt();
                            scan.nextLine();

                            if (OpcionModoSpecialC == 1) {

                                RadioTipoC.Hold();

                            } else if (OpcionModoSpecialC == 2) {
                                RadioTipoC.Weather();
                            }

                        }

                        break;
                    }
                    case 5:{
                        String pregunta = "No";
                        while(pregunta.equalsIgnoreCase("No")){
                            System.out.println("Radio Apagada...");
                            System.out.println("¿Quieres encender la radio? (Si/No)");
                            pregunta = scan.nextLine();
                        }
                        OpcionRadioC = 1;
                        break;
                    }
                }
            //Esto es en caso de que el usuario llegue colocar un caracter que no acepta el programa o si no hay datos creados 
            }catch(Exception e){
                System.out.println("Has ingresado uno o varios caracteres incorrectos o no hay datos existentes, intenta nuevamente");
                scan.next();
                OpcionRadioC = 1;
            }  
        } 
        //Se le muestra un mensaje de despedida al usuario
        System.out.println("Gracias por utilizar nuestro programa, hasta luego...");
    }
}
