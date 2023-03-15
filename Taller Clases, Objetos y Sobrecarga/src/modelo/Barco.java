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
    public Barco(double area, double limitePeso, LocalDate fechaArribo, LocalDate fechaZarpado) {
        this.area = area;
        this.estado = "Arribado";
        this.limitePeso = limitePeso;
        this.fechaArribo = fechaArribo;
        this.fechaZarpado = fechaZarpado;
        this.valorContenedor = valorContenedor;
        this.cantidad = cantidad;
    }
    
    // métodos getters
    public double getArea() {
        return this.area;
    }
    public String getEstado() {
        return this.estado;
    }
    public double getLimitePeso() {
        return this.limitePeso;
    }
    public LocalDate getFechaArribo() {
        return this.fechaArribo;
    }
    public LocalDate getFechaZarpado() {
        return this.fechaZarpado;
    }
    public double getValorContenedor() {
        return this.valorContenedor;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    // métodos setters
    public void setArea(double Area) {
        this.area = area;
    }
    public void setEstado(String Estado) {
        this.estado = estado;
    }
    public void setLimitePeso(double LimitePeso) {
        this.limitePeso = limitePeso;
    }
    public void setFechaArribo(LocalDate FechaArribo) {
        this.fechaArribo = fechaArribo;
    }
    public void setFechaZarpado(LocalDate FechaZarpado) {
        this.fechaZarpado = fechaZarpado;
    }
    
    // método cargar contenedor
    public String cargarContenedor(double area, double peso, double valor) {
        if (this.estado.equals("Zarpado")) {
            return "No es posible cargar el contenedor, el barco ya zarpó.";
        }
        else {
            if (this.area - area < 0) {
                return "No es posible cargar el contenedor, el area se sobrepasó.";
            }
            else {
                if (this.limitePeso - peso < 0) {
                    return "No es posible cargar el contenedor, el peso se sobrepasó.";
                }
                else {
                    this.area = this.area - area;
                    this.limitePeso = this.limitePeso - peso;
                    this.valorContenedor = this.valorContenedor + valor;
                    this.cantidad = this.cantidad + 1;
                    return "Operación exitosa, contenedor cargado.";
                }
            }
        }
    }
    
    // método sobrecargado cargar contenedor
    public String cargarContenedor(Contenedor contenedor) {
        return this.cargarContenedor(contenedor.getArea(), contenedor.getPeso(), contenedor.getValor());
    }
    
    // método area disponible
    public double areaDisponible() {
        return area;
    }
    
    // método peso permitido
    public double pesoPermitido() {
        return limitePeso;
    }
    
    // método valor de carga
    public double valorCarga() {
        return valorContenedor;
    }
    
    // método contenedores cargados
    public int contenedoresCargados() {
        return cantidad;
    }
    
    // método duración del viaje
    public LocalDate duracionViaje() {
        return fechaZarpado;
    }
}
