/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Andres Varela
 */
public class HiloGaraje extends Thread {

    private JTable tablagaraje;
    private String usuario;
    private String contra;

    public HiloGaraje(JTable tablagaraje, String usuario, String contra) {
        this.tablagaraje = tablagaraje;
    }

    @Override
    public void run() {
        DefaultTableModel m=(DefaultTableModel)tablagaraje.getModel();
        m.setRowCount(0);
        AdminJugador j = new AdminJugador("./Usuario.usr");
        j.cargarArchivo();
        for (jugador object : j.getLista()) {
            if (usuario.equals(object.getUsuario()) && contra.equals(object.getContraseña())) {
                for (carro c : object.getC()) {
                    Object[]temp={c.getMarca(),c.getModelo(),c.getPrecio(),c.getYear_fabricación()};
                    m.addRow(temp);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        }

    }

}
