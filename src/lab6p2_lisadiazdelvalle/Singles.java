/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class Singles extends Lanzamiento{
    Cancion cancion;

    public Singles() {
        super();
    }

    public Singles(Cancion cancion, String titulo, String fecha, int likes, String tipo) {
        super(titulo, fecha, likes, tipo);
        this.cancion = cancion;
    } 

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString()+"Singles{" + "cancion=" + cancion + '}';
    }
    
    
    
    
}
