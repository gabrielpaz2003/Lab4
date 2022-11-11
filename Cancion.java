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
* Class Cancion
* 
******************************************************************/

import java.time.Duration;

public class Cancion {
    private String Nombre;
    private Duration Duracion;
    private String Genero;
    private String Autor;
    private int Numero;

    public Cancion() {
        Nombre = "";
        Genero = "";
        Autor = "";
        Duracion = Duration.ofMinutes(0);
        Numero = 0;
    }
    public Cancion(int Numero , String Nombre, Duration Duracion, String Genero, String Autor) {
        this.Numero = Numero;
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Autor = Autor;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.Nombre;
    }

    
    /** 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    /** 
     * @return Duration
     */
    public Duration getDuracion() {
        return this.Duracion;
    }

    
    /** 
     * @param Duracion
     */
    public void setDuracion(Duration Duracion) {
        this.Duracion = Duracion;
    }

    
    /** 
     * @return String
     */
    public String getGenero() {
        return this.Genero;
    }

    
    /** 
     * @param Genero
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    
    /** 
     * @return String
     */
    public String getAutor() {
        return this.Autor;
    }

    
    /** 
     * @param Autor
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    
    /** 
     * @return int
     */
    public int getNumero() {
        return this.Numero;
    }

    
    /** 
     * @param Numero
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return 
        "Nunero:  " + getNumero() +
        "\nAutor:  " + getAutor() + 
        "\nGenero: " + getGenero() +
        "\nNombre: " + getNombre() + 
        "\nDuracion: " + getDuracion() + 
        "\n\n";
    }

    

}
