/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int d = 3;
        int contador = 0;
        String cadena1 = "1";
        do {
            if (contador % 2 == 0) {
                n = +1 / d;
                cadena1 = String.format("%s- 1/%d ",
                        cadena1,
                        d);
            } else {
                n = -1 / d;
                cadena1 = String.format("%s+ 1/%d ",cadena1,d);
            }
            d = d + 2;
            contador = contador + 1;
        } while (contador <= 6);
        System.out.printf("%s\n", cadena1);
    }
    
}
