/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class AdminJugador {

    private ArrayList<jugador> ListaJugadores = new ArrayList();
    private File archivo = null;

    public AdminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<jugador> getLista() {
        return ListaJugadores;
    }

    public void setlista(ArrayList<jugador> ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void agregar(jugador a) {
        ListaJugadores.add(a);
    }

    public void cargarArchivo() {
        try {
            ListaJugadores = new ArrayList();
            jugador temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (jugador) objeto.readObject()) != null) {
                        ListaJugadores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (jugador t : ListaJugadores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
