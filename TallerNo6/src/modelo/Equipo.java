/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author morga
 */
public class Equipo {
    private String nombre;
    private String ciudadOrigen;
    private String nombreTecnico;
    private int numInscripcion;
    private Campeonato campeonatoMicroF[];
    
    // método constructor default
    public Equipo() {
        this.nombre = "";
        this.ciudadOrigen = "";
        this.nombreTecnico = "";
        this.numInscripcion = 0;
        this.campeonatoMicroF = null;
    }
    
    // métodos getters
    public String getNombre() {
        return this.nombre;
    }
    public String getCiudadOrigen() {
        return this.ciudadOrigen;
    }
    public String getNombreTecnico() {
        return this.nombreTecnico;
    }
    public int getNumInscripcion() {
        return this.numInscripcion;
    }
    public Campeonato[] getCampeonatoMicroF() {
        return this.campeonatoMicroF;
    }
    
    // métodos setters 
    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }
    public void setCiudadOrigen(String CiudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    public void setNombreTecnico(String NombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }
    public void setNumInscripcion(int NumInscripcion) {
        this.numInscripcion = numInscripcion;
    }
    public void setCampeonatoMicroF(Campeonato CampeonatoMicroF) {
        this.campeonatoMicroF = campeonatoMicroF;
    }
}
