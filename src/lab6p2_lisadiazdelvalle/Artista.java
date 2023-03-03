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
public class Artista extends Usuario{
    private String nombre;
    
    private ArrayList <Cancion> canciones = new ArrayList();
    private ArrayList <Album> albumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nombre, String user, String contra, String tipo, int edad) {
        super(user, contra, tipo, edad);
        this.nombre = nombre;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    

    @Override
    public String toString() {
        return super.toString()+"Artista{" + "nombre=" + nombre + ", canciones=" + canciones + ", albumes=" + albumes + '}';
    }
    
    
    
}
