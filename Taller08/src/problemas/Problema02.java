/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String mensajeFinal = "";
        double op1;
        int op = 0;

        for (int i = 20; i <= 100; i += 4) {
            op1 = 0.55555*(i - 32);
          
            op += 1;
            System.out.println("Operación "+ op
                    + "Fahrenheit:"+ i+
                    "===> Celcius:"  +op1);
           
        }
        
    }
}

