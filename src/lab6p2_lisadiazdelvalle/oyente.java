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
public class oyente extends Usuario{
    private ArrayList <Cancion> cancionesLike = new ArrayList();
    private ArrayList <Playlist> playlists = new ArrayList();
    private ArrayList <Playlist> playlistsLike = new ArrayList();

    public oyente() {
        super();
    }

    public oyente( String user, String contra, int edad) {
        super(user, contra, edad);
        
    }


    public ArrayList<Cancion> getCancionesLike() {
        return cancionesLike;
    }

    public void setCancionesLike(ArrayList<Cancion> cancionesLike) {
        this.cancionesLike = cancionesLike;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Playlist> getPlaylistsLike() {
        return playlistsLike;
    }

    public void setPlaylistsLike(ArrayList<Playlist> playlistsLike) {
        this.playlistsLike = playlistsLike;
    }

    @Override
    public String toString() {
        return super.toString()+"oyente{"+" cancionesLike=" + cancionesLike + ", playlists=" + playlists + ", playlistsLike=" + playlistsLike + '}';
    }
    
    
}
