/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Andres Varela
 */
public class hilocompra extends Thread {

    private JTable tablacompra;
    private String usuario;
    private String contra;

    public hilocompra(JTable tablacompra, String usuario, String contra) {
        this.tablacompra = tablacompra;
    }

    @Override
    public void run() {
        DefaultTableModel m = (DefaultTableModel) tablacompra.getModel();
        m.setRowCount(0);
        AdminConcesionaria j = new AdminConcesionaria("./Consesionaria.cns");
        j.cargarArchivo();
        int size = j.getLista().size();
        for (int i = 0; i < 10; i++) {
            for (carro c : j.getLista().get(i).getC()) {
                Object[] temp = {c.getMarca(), c.getModelo(), c.getPrecio(), c.getYear_fabricación()};
                m.addRow(temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }

    }

}
