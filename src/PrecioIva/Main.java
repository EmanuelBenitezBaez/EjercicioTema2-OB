package PrecioIva;

import java.util.Scanner;

/*Enunciado del ejercicio:
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
*/

public class Main {
    public static void main(String[] args) {
        
 Scanner leerIVA = new Scanner(System.in);
 double precio,IVA,precioConIVA;
 System.out.println("Introduce el precio");
 precio = leerIVA.nextDouble();

        IVA= calcularIVA(precio);
        precioConIVA = IVA+precio;
        System.out.println("El precio sin IVA es: "+ precio );

        System.out.println("El precio con IVA es: "+ precioConIVA);

    }
            public static double calcularIVA(double precio) {
        double IVA;
        IVA=precio * 0.21;
        return IVA;
            }
        }



