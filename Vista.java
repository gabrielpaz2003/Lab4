
/******************************************************************
* 
* Author: Gabriel Paz. 
* Carnet 221087
* Fecha de edicion 09-11-2022
* 
* This is the part of the program where all the menus are called from
* 
******************************************************************/
class Vista {

  /******************************************************************
   * 
   * This menu is the first thing sommeone sees when they start the program
   * 
   ******************************************************************/

  public void SetRadioMode() {
    System.out.println("\n\nChoose your radio mode!");
    System.out.println("1. Modo Radio");
    System.out.println("2. Modo reproduccion");
    System.out.println("3. Modo Telefono");
    System.out.println("4. Caracteristicas especiales de tu radio");
    System.out.println("5. Apagar Radio");
    System.out.println("6. Salir de la Radio\n\n");

    System.out.println("Selecciona una opcion 1-5");
  }

  public void ModoRadio() {
    System.out.println("\n\nQue deseas hacer!");
    System.out.println("1. Subir Volumen");
    System.out.println("2. Bajar Volumen");
    System.out.println("3. Siguiente Emisora");
    System.out.println("4. Emisora Previa");
    System.out.println("5. Guardar Emisora (nombre)");
    System.out.println("6. Salir\n\n");

    System.out.println("Selecciona una opcion 1-6");
  }

  public void ModoReproduccion() {
    System.out.println("\n\nQue deseas hacer!");
    System.out.println("1. Seleccionar una playlist");
    System.out.println("2. Siguiente Cancion");
    System.out.println("3. Cancion Anterior");
    System.out.println("4. Escuchar cancion especifica");
    System.out.println("5. Salir\n\n");

    System.out.println("Selecciona una opcion 1-5");
  }

  public void ModoTelefono() {
    System.out.println("\n\nQue deseas hacer!");
    System.out.println("1. Conectar telefono");
    System.out.println("2. Desconectar telefono");
    System.out.println("3. Mostrar Contactos");
    System.out.println("4. Llamar a un contacto");
    System.out.println("5. Salir\n\n");

    System.out.println("Selecciona una opcion 1-5");
  }

  public void ModoTelefonoCarroS() {
    System.out.println("\n\nQue deseas hacer!");
    System.out.println("1. Connectar telefono");
    System.out.println("2. Desconectar telefono");
    System.out.println("3. Llamar a un contacto");
    System.out.println("4. Escuchar cancion especifica");
    System.out.println("5. Cambiar tipo de aux");
    System.out.println("6. Salir\n\n");

    System.out.println("Selecciona una opcion 1-6");
  }
}
