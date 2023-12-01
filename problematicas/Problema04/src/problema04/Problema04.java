/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= 0;
        int d= 3;
        int contador = 0;
        String cadenaA = "1";

        while (contador <= 6) {
            if (contador % 2 == 0) {
                n = +1 / d;
                cadenaA = String.format("%s- 1/%d ", cadenaA, d);

            } else {

                n = -1 / d;

                cadenaA = String.format("%s+ 1/%d ", cadenaA, d);
            }
            d = d + 2;
            contador = contador + 1;
        }
        System.out.printf("%s\n", cadenaA);
    }
    
}
