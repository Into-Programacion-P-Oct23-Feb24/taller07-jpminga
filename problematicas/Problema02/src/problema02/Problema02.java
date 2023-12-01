/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 10;
        int resultado = 2;
        int num1 = 1;
        while (num1 <= limite) {
            System.out.println(resultado);
            resultado = resultado + num1 * 2 + 2 ;
            num1 = num1 + 1;
        }
    }
    
}
