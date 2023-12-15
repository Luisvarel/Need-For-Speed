/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.io.Serializable;

/**
 *
 * @author Luis Andres Varela
 */
public class partes implements Serializable {

    private String marca;
    private String clasificación;
    private double precio;
    private static final long SerialVersionUID = 123L;

    public partes(String marca, String clasificación, double precio) {
        this.marca = marca;
        this.clasificación = clasificación;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClasificación() {
        return clasificación;
    }

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
