/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Punto;

/**
 * @author morga
 */
public class PruebaPunto {
    public static void main(String[] args) {
        // CREACIÓN DEL OBJETO DE LA CLASE PUNTO COORDENADAS A Y B
        Punto Punto1 = new Punto();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite el valor en X: ");
        Punto1.setX(input.nextDouble());
        System.out.print("Digite el valor en Y: ");
        Punto1.setY(input.nextDouble());
        
        System.out.println(Punto1.equals(Punto1));
        System.out.println(Punto1.distanciaOrigen());
        System.out.println(Punto1.distanciaOrigen(Punto1));
    }
    
}
