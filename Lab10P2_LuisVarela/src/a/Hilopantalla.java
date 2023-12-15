/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Luis Andres Varela
 */
public class Hilopantalla extends Thread {

    private JPanel pantalla;
    private JPanel usuario;
    private int num1;
    private int num2;
    private JProgressBar barra1;
    private JProgressBar barra2;

    public Hilopantalla(JPanel pantalla, JPanel usuario, int num1, int num2, JProgressBar barra1, JProgressBar barra2) {
        this.pantalla = pantalla;
        this.usuario = usuario;
        this.num1 = num1;
        this.num2 = num2;
        this.barra1 = barra1;
        this.barra2 = barra2;
    }

    @Override
    public void run() {
        barra1.setMinimum(0);
        barra1.setMaximum(num1);
        barra2.setMinimum(0);
        barra2.setMaximum(num2);
        for (int i = 0; i <=num1; i++) {
            barra1.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        barra2.setVisible(true);
        for (int i = 0; i <=num2; i++) {
            barra2.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        pantalla.setVisible(false);
        usuario.setVisible(true);
    }

}
