/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.time.LocalDate;
import java.util.Scanner;
import modelo.*;

/**
 * @author morga
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        double area, limitePeso;
        int day, month, year;
        
        System.out.println("DATOS DEL BARCO");
        System.out.println("Digite el area de la plataforma: ");
        area = input.nextDouble();
        System.out.println("Digite el limite de peso: ");
        limitePeso = input.nextDouble();
        System.out.println("-----------------------------------------------");
        System.out.println("DATOS FECHA DE ARRIBO");
        System.out.println("Digite el año: ");
        year = input.nextInt();
        System.out.println("Digite el mes: ");
        month = input.nextInt();
        System.out.println("Digite el día: ");
        day = input.nextInt();
        LocalDate fechaArribo = LocalDate.of(year, month, day);
        System.out.println("-----------------------------------------------");
        System.out.println("DATOS FECHA DE ZARPADO");
        System.out.println("Digite el año: ");
        year = input.nextInt();
        System.out.println("Digite el mes: ");
        month = input.nextInt();
        System.out.println("Digite el día: ");
        day = input.nextInt();
        LocalDate fechaZarpado = LocalDate.of(year, month, day);
        Barco buque = new Barco(area, limitePeso, fechaArribo, fechaZarpado);
        
        // para probar la app
        System.out.println("-----------------------------------------------");
        System.out.println("DATOS DEL PRIMER CONTENEDOR");
        double area1, peso, valor;
        System.out.println("Digite el area del contenedor: ");
        area = input.nextDouble();
        System.out.println("Digite el peso del contenedor: ");
        peso = input.nextDouble();
        System.out.println("Digite el valor del contenedor: ");
        valor = input.nextDouble();
        Contenedor contenedor1 = new Contenedor(area, peso, valor);
        System.out.println("-----------------------------------------------");
        System.out.println(buque.cargarContenedor(contenedor1));
        showDatas(contenedor1, buque); 
        System.out.println("-----------------------------------------------");
        System.out.println("DATOS DEL SEGUNDO CONTENEDOR");
        double area2, peso2, valor2;
        System.out.println("Digite el area del contenedor: ");
        area = input.nextDouble();
        System.out.println("Digite el peso del contenedor: ");
        peso = input.nextDouble();
        System.out.println("Digite el valor del contenedor: ");
        valor = input.nextDouble();
        Contenedor contenedor2 = new Contenedor(area, peso, valor);
        System.out.println("-----------------------------------------------");
        System.out.println(buque.cargarContenedor(contenedor2));
        showDatas(contenedor2, buque); 
    }
    
    public static void showDatas(Contenedor contenedor, Barco buque) {
        System.out.println("AREA PLATAFORMA DISPONIBLE: " + buque.areaDisponible());
        System.out.println("PESO PLATAFORMA DISPONIBLE: " + buque.pesoPermitido());
        System.out.println("FECHA DE ARRIBO: " + buque.getFechaArribo());
        System.out.println("FECHA DE ZARPADO: " + buque.duracionViaje());
        System.out.println("VALOR TOTAL CARGA: " + buque.valorCarga());
        System.out.println("No. CONTENEDORES: " + buque.contenedoresCargados());
    }
    
}
