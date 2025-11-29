/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexpo_isabelladubon;
import java.util.Scanner;
/**
 *
 * @author miria
 */
public class Cancion {
    //Atributos
    private String titulo;
    private String artista;
    private String album;
    private int duracion;
    private String genero;
    private boolean favorito;
    
    //Constructor
    public Cancion(String titulo, String artista, String album, int duracion, String genero, boolean favorito) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.favorito = favorito;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    //Metodos
    @Override
    public String toString() {
        return titulo + "\n" +
                "Artista: " + artista + "\n" +
                "Album: " + album + "\n" +
                "Duracion: " + duracion + "s" + "\n" +
                "Genero: " + genero + "\n" +
                "Marcado como Favorito: " + favorito ;
        
    }
    
    public void reproducir (){
        int duracionRestante = duracion;
        do{
            System.out.println("Reproduciendo:");
            System.out.println(titulo);
            System.out.println(artista + "," + album);
            System.out.println("0:00 |----------------------| " + duracionRestante);
            if (favorito == true){
                System.out.println("   <3     |<     ||     >|");
            }
            if (!favorito){
                System.out.println("         |<     ||     >|");
            }
            duracionRestante--;
        }while (duracionRestante >= 0);
    }
    
    public void esFavorita (){
        Scanner sc = new Scanner(System.in);
        if (favorito == true){
                System.out.println("Esta agregada a Favoritos.");
            }
            if (!favorito){
                System.out.println("No esta agregada a Favoritos.");
                System.out.println("Deseas agregarla? (0 = no, 1 = si): ");
                int agregar;
                do{
                    agregar = sc.nextInt();
                    switch (agregar){
                        case 0:
                            break;
                        case 1:
                            favorito = true;
                            System.out.println("La cancion ha sido agregada a Favoritos.");
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                }while (agregar < 0 || agregar > 1);
            }
    }
    
}
