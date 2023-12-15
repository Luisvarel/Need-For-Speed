/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Andres Varela
 */
public class carro implements Serializable {

    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    private String pais;
    private Date year_fabricación;
    private boolean reconstruido;
    private int Horsepower;
    private int VelocidadPunta;
    private int Tiempo;
    private ArrayList<partes> p = new ArrayList();
    private static final long SerialVersionUID = 102L;

    public carro(String marca, String modelo, Color color, double precio, String pais, Date year_fabricación, boolean reconstruido, int Horsepower, int VelocidadPunta, int Tiempo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.year_fabricación = year_fabricación;
        this.reconstruido = reconstruido;
        this.Horsepower = Horsepower;
        this.VelocidadPunta = VelocidadPunta;
        this.Tiempo = Tiempo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getYear_fabricación() {
        return year_fabricación;
    }

    public void setYear_fabricación(Date year_fabricación) {
        this.year_fabricación = year_fabricación;
    }

    public boolean isReconstruido() {
        return reconstruido;
    }

    public void setReconstruido(boolean reconstruido) {
        this.reconstruido = reconstruido;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int Horsepower) {
        this.Horsepower = Horsepower;
    }

    public int getVelocidadPunta() {
        return VelocidadPunta;
    }

    public void setVelocidadPunta(int VelocidadPunta) {
        this.VelocidadPunta = VelocidadPunta;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public ArrayList<partes> getP() {
        return p;
    }

    public void setP(ArrayList<partes> p) {
        this.p = p;
    }

}
