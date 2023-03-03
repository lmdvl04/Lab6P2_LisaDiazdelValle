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
public class Playlist {
    private String nombre;
    private int conteoLikes;
    private ArrayList <Cancion> canciones = new ArrayList();

    public Playlist() {
    }

    public Playlist(String nombre, int conteoLikes) {
        this.nombre = nombre;
        this.conteoLikes = conteoLikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre=" + nombre + ", conteoLikes=" + conteoLikes + ", canciones=" + canciones + '}';
    }
    
    
    
}
