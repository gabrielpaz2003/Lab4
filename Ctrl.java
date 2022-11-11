
/******************************************************************
* 
* Author: Gabriel Paz. 
* Carnet 221087
* Fecha de edicion 10-11-22
* 
* This is the main part of the program and will control the user inputs
* 
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Ctrl {
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
        ArrayList<String> Playlist = new ArrayList<String>();
        ArrayList<String> Contacts = new ArrayList<String>();

        Playlist.add("Over and Over");
        Playlist.add("Walk!!");
        Playlist.add("Burn it down");
        Playlist.add("Jingle Bells");
        Playlist.add("Cold outside");

        EmisoraList.add("Yosi sideral");
        EmisoraList.add("Mente fresca");
        EmisoraList.add("Radio ranchera");
        EmisoraList.add("Honestamente no conozco otra estacion de radio");

        Contacts.add("Mama");
        Contacts.add("Papa");
        Contacts.add("Tu crush");
        Contacts.add("That old highschool friend you keep meaning to call");

         /******************************************************************
        * 
        * These options will be all centered around Radio type C
        * 
        ******************************************************************/

                int OpcionRadioC = 0;

                while (OpcionRadioC != 5) {

                    UserView.SetRadioMode();
                    OpcionRadioC = scan.nextInt();

                    if (OpcionRadioC == 1) {

                        int OpcionModoRadioC = 0;

                        while (OpcionModoRadioC != 6) {
                            scan = new Scanner(System.in);

                            UserView.ModoRadio();
                            OpcionModoRadioC = scan.nextInt();

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

                    } else if (OpcionRadioC == 2) {

                        int OpcionModoReproduccionC = 0;

                        while (OpcionModoReproduccionC != 5) {
                            scan = new Scanner(System.in);

                            UserView.ModoReproduccion();
                            OpcionModoReproduccionC = scan.nextInt();

                            /******************************************************************
                             * 
                             * Modo reproduccion
                             * 
                             ******************************************************************/

                            if (OpcionModoReproduccionC == 1) {

                                RadioTipoC.PlayPlaylist(Playlist);

                            } else if (OpcionModoReproduccionC == 2) {

                                RadioTipoC.ChangeSongForward(Playlist);

                            } else if (OpcionModoReproduccionC == 3) {

                                RadioTipoC.ChangeSongBackwards(Playlist);

                            } else if (OpcionModoReproduccionC == 4) {

                            }

                        }

                    } else if (OpcionRadioC == 3) {

                        int OpcionModoTelefonoC = 0;

                        while (OpcionModoTelefonoC != 5) {

                            UserView.ModoTelefono();
                            OpcionModoTelefonoC = scan.nextInt();

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

                    } else if (OpcionRadioC == 4) {

                        int OpcionModoSpecialC = 0;

                        while (OpcionModoSpecialC != 3) {

                            System.out.println("Opciones especiales para carro A");
                            System.out.println("1. Poner llamada en hold");
                            System.out.println("2. Mostrar Pronostico del clima");
                            OpcionModoSpecialC = scan.nextInt();

                            if (OpcionModoSpecialC == 1) {

                                RadioTipoC.Hold();

                            } else if (OpcionModoSpecialC == 2) {
                                RadioTipoC.Weather();
                            }

                        }

                    }

                } 
    }
}
