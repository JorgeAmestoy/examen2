public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola= EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola ) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana ) System.out.println("ERROR VENTANA");

        //EntradaSalida.salida("Hola",EntradaSalida.SALIDA_IMPRESORA);

        //pregunta por un String
        String nombre =EntradaSalida.entradaString("¿Cual es tu nombre?");
        //saco por consola el String recibido
        EntradaSalida.salida(nombre,EntradaSalida.SALIDA_CONSOLA);

        String direccion =EntradaSalida.entradaString("¿Cual es tu direccion?");
        EntradaSalida.salida(direccion,EntradaSalida.SALIDA_CONSOLA);

        int edad = EntradaSalida.entradaString2("¿Cual es tu edad?");
        EntradaSalida.salida(String.valueOf(edad),EntradaSalida.SALIDA_CONSOLA);
        //Hola
        //hola


    }
}