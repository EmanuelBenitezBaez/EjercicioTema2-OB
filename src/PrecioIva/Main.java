package PrecioIva;

import java.util.Scanner;

/*Enunciado del ejercicio:
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
*/

public class Main {
    public static void main(String[] args) {
        



                int iva=21;                                 //valor de iva

                Scanner scanner =new Scanner(System.in);
                System.out.println("Introduce un precio: ");
                double variable = scanner.nextDouble();     //precio sin IVA
                double variable2;                           //precio con IVA
                variable2 = calcularIva(variable, iva);

                System.out.println("Precio con IVA: "+variable2);

            }
            private static double calcularIva(double variable, int valor) {
                double variable1;
                variable1 = variable + variable*valor/100;
                return variable1;
            }
        }



