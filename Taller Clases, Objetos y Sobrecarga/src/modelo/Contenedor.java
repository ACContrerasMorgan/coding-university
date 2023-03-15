/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author morga
 */
public class Contenedor {
    private double area;
    private double peso;
    private double valor;
    
    // método constructor default
    public Contenedor() {
        this.area = 0;
        this.peso = 0;
        this.valor = 0;
    }
    
    // método constructor sobrecargado
    public Contenedor(double area, double peso, double valor) {
        this.area = area;
        this.peso = peso;
        this.valor = valor;
    }
    
    // métodos getters
    public double getArea() {
        return this.area;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    // métodos setters
    public void setArea(double Area) {
        this.area = area;
    }
    public void setPeso(double Peso) {
        this.peso = peso;
    }
    public void setValor(double Valor) {
        this.valor = valor;
    }
}
