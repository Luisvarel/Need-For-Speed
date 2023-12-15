/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class concesionaria implements Serializable {

    private String nombre;
    private String locación;
    ArrayList<carro> c = new ArrayList();
    private static final long SerialVersionUID = 120L;

    public concesionaria(String nombre, String locación) {
        this.nombre = nombre;
        this.locación = locación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocación() {
        return locación;
    }

    public void setLocación(String locación) {
        this.locación = locación;
    }

    public ArrayList<carro> getC() {
        return c;
    }

    public void setC(ArrayList<carro> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return ""+nombre;
    }
    
}
