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
public class AdminCircuito {
    
    private ArrayList<circuito> ListaCircuito = new ArrayList();
    private File archivo = null;

    public AdminCircuito(String path) {
        archivo = new File(path);
    }

    public ArrayList<circuito> getLista() {
        return ListaCircuito;
    }

    public void setlista(ArrayList<circuito> ListaCarro) {
        this.ListaCircuito = ListaCarro;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void agregar(circuito a) {
        ListaCircuito.add(a);
    }

    public void cargarArchivo() {
        try {
            ListaCircuito = new ArrayList();
            circuito temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (circuito) objeto.readObject()) != null) {
                        ListaCircuito.add(temp);
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
            for (circuito t : ListaCircuito) {
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
