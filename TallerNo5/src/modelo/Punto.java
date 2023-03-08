/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author morga
 */
// ATRIBUTOS DE LA CLASE
public class Punto {
    private double x;
    private double y;
    
// BLOQUE CONSTRUCTOR   
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

// SEGUNDO BLOQUE CONSTRUCTOR SOBRE CARGADO
    public Punto(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
// MÉTODOS GETTER
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    
// MÉTODOS SETTER
    public void setX(Double X) {
        this.x = x;
    }
    public void setY(Double Y) {
        this.y = y;
    }
    
// MÉTODO PARA COMPROBAR SI UN OBJ DE CLASE PUNTO ES IGUAL A OTRO QUE SE PASA COMO ARGUMENTO
    public boolean equals(Punto Punto1) {
        if (this == Punto1) {
            return true;
        }
        if (Punto1 instanceof Punto) {
            Punto otro = (Punto)Punto1;
            return ((x == otro.x) && (y == otro.y));
        }
        else {
            return false;
        }
    }
    
// MÉTODO PARA COMPROBAR SI UN OBJ DE CLASE PUNTO ES IGUAL A OTRO QUE SE PASA COMO ARGUMENTO
    public double distanciaOrigen() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    
    public double distanciaOrigen(Punto Punto1) {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}

