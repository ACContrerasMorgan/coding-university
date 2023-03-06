/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author morga
 */
// ATRIBUTOS DE LA CLASE
public class claseCoche {
    private String color;
    private String marca;
    private String model;
    private int caballos;
    private int numDoors;
    private String id;
    
    // BLOQUE CONSTRUCTOR
    public claseCoche() {
        this.color = "";
        this.marca = "";
        this.model = "";
        this.caballos = 0;
        this.numDoors = 0;
        this.id = "";
    }
    
    // GETTERS
    public String getColor() {
        return this.color;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getModel() {
        return this.model;
    }
    public double getCaballos() {
        return this.caballos;
    }
    public int getNumDoors() {
        return this.numDoors;
    }
    public String getId() {
        return this.id;
    }
    
    // SETTERS
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    // MÉTODOS DE LA CLASE
    @Override
    
    public String toString() {
        return ("Coche color = " + this.color + " Marca = " + this.marca + " Modelo = " + this.model + " Caballos de Fuerza = " + this.caballos + " No. Puertas = " + this.numDoors + " Matricula = " + this.id);
    } 
    
}
