/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.util.Scanner;
import modelo.*;

/**
 * @author morga
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("DATOS DE LOS EQUIPOS");
        String nombre, ciudadOrigen, nombreTecnico, numInscripcion;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del equipo: ");
            nombre = input.nextLine();
            System.out.println("Ingrese la ciudad de origen del equipo: ");
            ciudadOrigen = input.nextLine();
            System.out.println("Ingrese el nombre del tecnico del equipo: ");
            nombreTecnico = input.nextLine();
            System.out.println("Ingrese el No. de inscripcion del equipo: ");
            numInscripcion = input.nextLine();
        }
    }
    
    public static void ShowDatas(Equipo equipos, Campeonato campeonatoMicroF) {
        for (int i = 0; i < 5; i++) {
            System.out.println("LOS EQUIPOS SON: " + );
        }
    }
    
}
