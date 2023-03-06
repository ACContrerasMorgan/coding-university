/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package vista;
import java.util.Scanner;
import modelo.claseCoche;

/**
 * @author morga
 */
public class PruebaCoche {
    public static void main(String[] args) {
        claseCoche Coche1 = new claseCoche();
        // LLENAR DATOS DEL COCHE
        Scanner input = new Scanner(System.in);
        System.out.print("Digite el color del coche: ");
        Coche1.setColor(input.nextLine());
        System.out.print("Digite la marca del coche: ");
        Coche1.setMarca(input.nextLine());
        System.out.print("Digite el modelo del coche: ");
        Coche1.setModel(input.nextLine());
        System.out.print("Digite la matricula del coche: ");
        Coche1.setId(input.nextLine());
        System.out.print("Digite los caballos de fuerza del coche: ");
        Coche1.setCaballos(input.nextInt());
        System.out.print("Digite el No de puertas del coche: ");
        Coche1.setNumDoors(input.nextInt());
        
        System.out.println(Coche1.toString());
    }
    
}
