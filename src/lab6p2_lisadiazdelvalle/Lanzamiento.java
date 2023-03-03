/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class Lanzamiento {
    protected String titulo, fecha;
    protected int likes;
        private String tipo;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, String fecha, int likes, String tipo) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
        this.tipo = tipo;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    

    @Override
    public String toString() {
        return "Lanzamiento{" + "titulo=" + titulo + ", fecha=" + fecha + ", likes=" + likes + '}';
    }
    
    
}
