/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class Cancion {
    private String titulo,referenciaAlbum;
    private String duracion;

    public Cancion() {
    }

    public Cancion(String titulo, String referenciaAlbum, String duracion) {
        this.titulo = titulo;
        this.referenciaAlbum = referenciaAlbum;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferenciaAlbum() {
        return referenciaAlbum;
    }

    public void setReferenciaAlbum(String referenciaAlbum) {
        this.referenciaAlbum = referenciaAlbum;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", referenciaAlbum=" + referenciaAlbum + ", duracion=" + duracion + '}';
    }
    
    
    
}
