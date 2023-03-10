/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class Usuario {
    protected String user, contra, tipo;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String user, String contra, String tipo, int edad) {
        this.user = user;
        this.contra = contra;
        this.tipo = tipo;
        this.edad = edad;
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", contra=" + contra + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
