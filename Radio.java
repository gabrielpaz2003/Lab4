
/******************************************************************
* 
* Author: Gabriel Paz. Andre Marroquin
* Carnet 221087, 22266
* Fecha de edicion 10-11-2022
* 
* This class is abstract and serves as the "mother" class. It includes all the generic actions a radio can do
* 
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

public abstract class Radio {

    Scanner scan = new Scanner(System.in);

    protected Double Emisora = 89.0;
    protected int Volume = 0;

    /******************************************************************
     * 
     * Methods to raise / lower volume
     * 
     ******************************************************************/

    public void RaiseVolume(Radio CurrentRadio) {
        CurrentRadio.setVolume(CurrentRadio.getVolume() + 1);

        System.out.println("El volumen es " + CurrentRadio.getVolume());

    }

    public void LowerVolume(Radio CurrentRadio) {
        CurrentRadio.setVolume(CurrentRadio.getVolume() - 1);

        System.out.println("El volumen es " + CurrentRadio.getVolume());
    }

    /******************************************************************
     * 
     * Methods to raise / lower Station
     * 
     ******************************************************************/

    public void ChangeStationUp(Radio CurrentRadio) {
        CurrentRadio.setEmisora(CurrentRadio.getEmisora() + 0.5);
        System.out.println(Emisora);

    }

    public void ChangeStationDown(Radio CurrentRadio) {
        CurrentRadio.setEmisora(CurrentRadio.getEmisora() - 0.5);

        System.out.println(Emisora);
    }

    /******************************************************************
     * 
     * Save a new station
     * 
     ******************************************************************/

    public void SaveStation(ArrayList CurrentList) {
        String CurrentSong;

        System.out.println("Cual Estacion quieres agregar? (nombre)");

        CurrentSong = scan.nextLine();

        CurrentList.add(CurrentSong);

        System.out.print(CurrentList);
    }

    /******************************************************************
     * 
     * Play a playlist
     * 
     ******************************************************************/

    public void PlayPlaylist(ArrayList CurrentList) {
        int PlaylistIndex;

        System.out.println("Elige una cancion de esta playlist! (su numero de posicion en la lista)");
        System.out.print(CurrentList);

        PlaylistIndex = scan.nextInt();
        PlaylistIndex = PlaylistIndex - 1;

        System.out.print(CurrentList.get(PlaylistIndex) + " Is playing right now");
    }

    /******************************************************************
     * 
     * Change song forwards or backwards
     * 
     ******************************************************************/

    public void ChangeSongForward(ArrayList CurrentList) {
        int PlaylistIndex;

        System.out.println("Elige una cancion de esta playlist! (su numero de posicion en la lista)");
        System.out.print(CurrentList);

        PlaylistIndex = scan.nextInt();
        PlaylistIndex = PlaylistIndex + 1;

        System.out.print(CurrentList.get(PlaylistIndex) + " Is playing right now");
    }

    public void ChangeSongBackwards(ArrayList CurrentList) {
        int PlaylistIndex;

        System.out.println("Elige una cancion de esta playlist! (su numero de posicion en la lista)");
        System.out.print(CurrentList);

        PlaylistIndex = scan.nextInt();
        PlaylistIndex = PlaylistIndex + 1;

        System.out.print(CurrentList.get(PlaylistIndex) + " Is playing right now");
    }

    /******************************************************************
     * 
     * Connect / disconnect a phone
     * 
     ******************************************************************/

    public void ConnectPhone() {
        String Phone;

        System.out.println("Cual es el nombre del telefono que quieres conectar?");
        Phone = scan.nextLine();

        System.out.println("El dispositivo " + Phone + " a sido conectado exitosamente");

    }

    public void DisconnectPhone() {
        String Phone;

        System.out.println("Cual es el nombre del telefono que quieres desconectar?");
        Phone = scan.nextLine();

        System.out.println("El dispositivo " + Phone + " a sido desconectado exitosamente");

    }

    /******************************************************************
     * 
     * Show Contact List
     * 
     ******************************************************************/

    public void ShowContacts(ArrayList CurrentList) {
        System.out.println("La lista de tus contactos es: ");
        System.out.println(CurrentList);
    }

    /******************************************************************
     * 
     * Make a call
     * 
     ******************************************************************/

    public void MakeACall() {
        int PhoneNum;

        System.out.println("Ingresa el numero de telefono al que quieres llamar");

        PhoneNum = scan.nextInt();

        System.out.println("Llamando a: " + PhoneNum);

    }

    /******************************************************************
     * 
     * To string @override
     * 
     ******************************************************************/

    public String toString() {
        return "Hi " + Volume;
    }

    /******************************************************************
     * 
     * Setters and getters below
     * 
     ******************************************************************/

    public Double getEmisora() {
        return Emisora;
    }

    public void setEmisora(Double Emisora) {
        this.Emisora = Emisora;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

}