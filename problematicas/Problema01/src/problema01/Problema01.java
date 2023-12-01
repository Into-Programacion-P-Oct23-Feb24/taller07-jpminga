/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;

        int edad;
        double Estatura;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        int contadorIteraciones = 0;
        int contadorIteraciones1 = 1;
        double promedioEdad;
        double promedioEstaturas=0;
        
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        while (bandera) {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador=entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            Estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            promedioEstaturas = promedioEstaturas+Estatura;

            contadorIteraciones = contadorIteraciones + 1;

            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d,%.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    Estatura);

            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        }

        promedioEdad = (double) sumaEdades / contadorIteraciones;

        cadenaReporte = String.format("%sPromedio de edades: %.2f\n",
                cadenaReporte, promedioEdad);

        promedioEstaturas = promedioEstaturas / contadorIteraciones;
        
        cadenaReporte = String.format("%sPromedio de Estaturas: %.2f\n",
                cadenaReporte, promedioEstaturas);
        
        System.out.printf("%s\n", cadenaReporte);
    }
    
}
