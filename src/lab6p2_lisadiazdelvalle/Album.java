/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

import java.util.ArrayList;

/**
 *
 * @author HTS
 */
public class Album extends Lanzamiento {
    private int cantidadCanciones;
    private ArrayList <Cancion> canciones = new ArrayList();

    public Album() {
        super();
    }

    public Album(int cantidadCanciones, String titulo, String fecha, int likes, String tipo) {
        super(titulo, fecha, likes, tipo);
        this.cantidadCanciones = cantidadCanciones;
    }


    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }


    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
