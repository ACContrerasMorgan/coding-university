/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;

/**
 * @author morga
 */
public class Barco {
    private double area;
    private String estado;
    private double limitePeso;
    private LocalDate fechaArribo;
    private LocalDate fechaZarpado;
    private double valorContenedor;
    private int cantidad;
    
    // método constructor default
    public Barco() {
        this.area = 0;
        this.estado = "Arribado";
        this.limitePeso = 0;
        this.fechaArribo = null;
        this.fechaZarpado = null;
        this.valorContenedor = 0;
        this.cantidad = 0;
    }
    
    // método constructor sobrecargado
    
}
