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
public class AdminConcesionaria {
    
    private ArrayList<concesionaria> ListaConcesionaria  = new ArrayList();
    private File archivo = null;

    public AdminConcesionaria(String path) {
        archivo = new File(path);
    }

    public ArrayList<concesionaria> getLista() {
        return ListaConcesionaria;
    }

    public void setlista(ArrayList<concesionaria> ListaConcesionaria) {
        this.ListaConcesionaria = ListaConcesionaria;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void agregar(concesionaria a) {
        ListaConcesionaria.add(a);
    }

    public void cargarArchivo() {
        try {
            ListaConcesionaria = new ArrayList();
            concesionaria temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (concesionaria) objeto.readObject()) != null) {
                        ListaConcesionaria.add(temp);
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
            for (concesionaria t : ListaConcesionaria) {
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
