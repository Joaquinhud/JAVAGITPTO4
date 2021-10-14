/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gitpto4;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conejo {
    
private long id;
private String nombre;
private double peso;
private Integer edad;
private Integer altura;
private String dueño;

    public Conejo() {
    }

    public Conejo(long id, String nombre, double peso, Integer edad, Integer altura, String dueño) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
        this.dueño = dueño;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }


        
}
