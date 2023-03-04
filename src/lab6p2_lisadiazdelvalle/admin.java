/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_lisadiazdelvalle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class admin {

    private ArrayList<Usuario> users = new ArrayList();
    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    private ArrayList<Playlist> playlists = new ArrayList();
    private File Archivo = null;

    public admin(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString() {
        return "admin{" + "users=" + users + ", Archivo=" + Archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String linea = "";
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);

            for (Usuario u : users) {
                if (u instanceof Artista) {
                    linea += u.getUser() + ";" + u.getContra() + ";" + ((Artista) u).getNombre() + ";" + u.getTipo() + ";" + u.getEdad() + "\n";
                } else if (u instanceof oyente) {
                    linea += u.getUser() + ";" + u.getContra() + ";" + u.getTipo() + ";" + u.getEdad() + "\n";
                }

//                linea += "\n" + u.getUser() + "|" + u.getContra() + "|" + u.getEdad() + "|" + u.getTipo() + "|";
//                bw.write(linea);
            }
            System.out.println(users.size());
            bw.write(linea);

        } catch (Exception ex) {
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void cargar() {
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            users = new ArrayList();
            if (Archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            if (datos[3].equals("Artista")) {
                                Artista a = new Artista(datos[0], datos[1], datos[2], datos[3], Integer.parseInt(datos[4]));
                                users.add(a);
                            } else if (datos[3].equals("Clientes")) {
                                oyente o = new oyente(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                                users.add(o);
                            }
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {

        }

    }

    public void escribirArchivocancion() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String linea = "";
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);

            for (Cancion c : canciones) {
                linea += c.getTitulo() + ";" + c.getReferenciaAlbum() + ";" + c.getDuracion() + "\n";
            }
            bw.write(linea);

        } catch (Exception ex) {
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void cargarCancion() {
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            users = new ArrayList();
            if (Archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            Cancion c = new Cancion(datos[0], datos[1], datos[2]);
                            canciones.add(c);

                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {

        }
    }

    public void escribirArchivoLan() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String linea = "";
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);

            for (Lanzamiento l : lanzamientos) {
                if (l instanceof Album) {
                    linea += ((Album) l).getCantidadCanciones() + ";" + l.getTitulo() + ";" + l.getFecha() + ";" + l.getLikes() + ";" + ((Album) l).getCanciones() + "\n";
                } else if (l instanceof Singles) {
                    linea += ((Singles) l).getCancion() + ";" + l.getTitulo() + ";" + l.getFecha() + ";" + l.getLikes() + l.getTipo() + "\n";
                }
            }
            bw.write(linea);

        } catch (Exception ex) {
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void cargarLan() {
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            lanzamientos = new ArrayList();
            if (Archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            if (datos[4].equals("Album")) {
                                Album a = new Album(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), datos[4]);
                                lanzamientos.add(a);
                            } else if (datos[4].equals("Single")) {
                                Cancion c = canciones.get(0);
                                Singles s = new Singles(c, datos[1], datos[2], Integer.parseInt(datos[3]), datos[4]);
                                lanzamientos.add(s);
                            }
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {

        }

    }

}
