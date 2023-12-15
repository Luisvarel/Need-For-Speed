/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luis Andres Varela
 */
public class jugador implements Serializable {

    private int saldo;
    private Date FechaNacimiento;
    private String Nombre;
    private String correo;
    private String PaisResidencia;
    private String usuario;
    private String contraseña;
    private ArrayList<carro> c = new ArrayList();
    private static final long SerialVersionUID = 555L;

    public jugador(Date FechaNacimiento, String Nombre, String correo, String PaisResidencia, String usuario, String contraseña) {
        this.saldo = 150000;
        this.FechaNacimiento = FechaNacimiento;
        this.Nombre = Nombre;
        this.correo = correo;
        this.PaisResidencia = PaisResidencia;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaisResidencia() {
        return PaisResidencia;
    }

    public void setPaisResidencia(String PaisResidencia) {
        this.PaisResidencia = PaisResidencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<carro> getC() {
        return c;
    }

    public void setC(ArrayList<carro> c) {
        this.c = c;
    }
    
}
