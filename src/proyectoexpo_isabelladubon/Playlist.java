/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexpo_isabelladubon;

/**
 *
 * @author miria
 */
public class Playlist {
    //Atributos
    private String nombre;
    private String creador;
    private String descripcion;
    private Cancion[] canciones;
    private int cantCanciones;
    private int duracionTotal;

    //Constructor
    public Playlist(String nombre, String creador, String descripcion) {
        this.nombre = nombre;
        this.creador = creador;
        this.descripcion = descripcion;
        this.canciones = new Cancion[10];
        this.cantCanciones = 0;
        this.duracionTotal = 0;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public double getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }
    
    //Metodos

    @Override
    public String toString() {
        return nombre + "\n" +
                "Creador: " + creador + "\n" +
                "Descripcion:" + "\n"+ descripcion + "\n" +
                "Cantidad de Canciones: " + cantCanciones + "\n" +
                "Duracion: " + duracionTotal + "s";
    }
    
    public void agregarCancion (String titulo, String artista, String album, int duracion, String genero, boolean favorito){
        Cancion nuevo = new Cancion(titulo,artista,album,duracion,genero,favorito);
        boolean agregado = false; //valida que la cancion esta agregada
        for (int i = 0; i < canciones.length; i++){
            if (canciones[i] == null){ //busca un espacio nulo en el arreglo
                canciones[i] = nuevo;
                agregado = true;
                System.out.println("La cancion se ha agregado a |"+ nombre +"|");
                break;
            }
        }
        if (!agregado){
            System.out.println("La playlist está llena. No se puede agregar más canciones.");
        }
        System.out.println();
    }
    
    public void eliminarCancion (){
        
    }
}
