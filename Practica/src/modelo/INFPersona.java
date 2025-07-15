/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MI PC
 */
public class INFPersona {
    
    private String Nombre;
    private int Identificacion;
    private int Edad;
    private double Puntaje;

    public INFPersona(String Nombre, int Identificacion, int Edad, double Puntaje) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
        this.Puntaje = Puntaje; //empezara en 0
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(double Puntaje) {
        this.Puntaje = Puntaje;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}
