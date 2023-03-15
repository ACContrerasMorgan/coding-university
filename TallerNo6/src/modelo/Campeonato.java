/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author morga
 */
public class Campeonato {
    private String nombre;
    private int duracionMeses;
    private Equipo equipos[];
    
    // método constructor default
    public Campeonato() {
        this.nombre = "";
        this.duracionMeses = 0;
        this.equipos = null;
    }
    
    // método getters
    public String getNombre() {
        return this.nombre;
    }
    public int getDuracionMeses() {
        return this.duracionMeses;
    }
    public Equipo[] getEquipos() {
        return this.equipos;
    }
    
    // métodos setters
    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }
    public void setDuracionMeses(int DuracionMeses) {
        this.duracionMeses = duracionMeses;
    }
    public void setEquipos(Equipo Equipos) {
        this.equipos = equipos;
    }
    
    // métodos premiación ganador
    public String premiacionGanador() {
        return "EL EQUIPO GANADOR ES: ";
    }
    
    // métodos equipos participantes
    public String equiposParticipantes() {
        return "LOS EQUIPOS PARTICIPANTES SON: ";
    }
}
