/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexpo_isabelladubon;
import java.util.Scanner;

 class ProyectoExpo_IsabellaDubon {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Playlist playlist = new Playlist("Mi Musica","Fulanito","Esta es mi playlist.");
        playlist.agregarCancion("My Kind of Woman", "Mac DeMarco", "2", 3.18, "Indie Pop", true);
        playlist.agregarCancion("Blinding Lights", "The Weeknd", "After Hours", 3.20, "SynthPop", false);
        playlist.agregarCancion("Come As You Are", "Nirvana", "Nevermind", 3.39, "Grunge", true);
        playlist.agregarCancion("Take On Me", "a-ha", "Hunting High and Low", 3.46, "SynthPop", false);
        playlist.agregarCancion("Bohemian Rhapsody", "Queen", "A Night at the Opera", 5.55, "Rock", true);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        int opcion;
        do{
            System.out.println("-----Reproductor de Musica-----");
            System.out.println("1. Mostrar Info Cancion");
            System.out.println("2. Mostrar Info Playlist");
            System.out.println("3. Cambiar Nombre Playlist");
            System.out.println("4. Cambiar Creador Playlist");
            System.out.println("5. Cambiar Descripcion Playlist");
            System.out.println("6. Mostrar Lista de Canciones");
            System.out.println("7. Reproducir Cancion");
            System.out.println("8. Cancion: Es Favorita?");
            System.out.println("9. Agregar Cancion");
            System.out.println("10. Eliminar Cancion");
            System.out.println("11. Salir");
            System.out.println();
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    playlist.listaCanciones();
                    System.out.print("Elija una cancion (0-9): ");
                    int cancion;
                    do{
                        cancion = sc.nextInt();
                        switch (cancion){
                            case 0:
                                Cancion cancion1 = playlist.getCancion(0);
                                if (cancion1 != null){
                                    System.out.println(cancion1.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 1:
                                Cancion cancion2 = playlist.getCancion(1);
                                if (cancion2 != null){
                                    System.out.println(cancion2.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                Cancion cancion3 = playlist.getCancion(2);
                                if (cancion3 != null){
                                    System.out.println(cancion3.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                Cancion cancion4 = playlist.getCancion(3);
                                if (cancion4 != null){
                                    System.out.println(cancion4.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 4:
                                Cancion cancion5 = playlist.getCancion(4);
                                if (cancion5 != null){
                                    System.out.println(cancion5.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 5:
                                Cancion cancion6 = playlist.getCancion(5);
                                if (cancion6 != null){
                                    System.out.println(cancion6.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 6:
                                Cancion cancion7 = playlist.getCancion(6);
                                if (cancion7 != null){
                                    System.out.println(cancion7.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 7:
                                Cancion cancion8 = playlist.getCancion(7);
                                if (cancion8 != null){
                                    System.out.println(cancion8.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 8:
                                Cancion cancion9 = playlist.getCancion(8);
                                if (cancion9 != null){
                                    System.out.println(cancion9.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 9:
                                Cancion cancion10 = playlist.getCancion(9);
                                if (cancion10 != null){
                                    System.out.println(cancion10.toString());
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                        
                    }while (cancion < 0 || cancion > 9);
                    break;
                case 2:
                    System.out.println(playlist.toString());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo nombre: ");
                    sc.nextLine();
                    String nombreNew = sc.nextLine();
                    playlist.setNombre(nombreNew);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo nombre creador: ");
                    sc.nextLine();
                    String creadorNew = sc.nextLine();
                    playlist.setCreador(creadorNew);
                    break;
                case 5:
                    System.out.println("Ingrese descripcion: ");
                    sc.nextLine();
                    String descNew = sc.nextLine();
                    playlist.setDescripcion(descNew);
                    break;
                case 6:
                    playlist.listaCanciones();
                    break;
                case 7:
                    System.out.print("Elija una cancion (0-9): ");
                    int reproducir;
                    do{
                        reproducir = sc.nextInt();
                        switch (reproducir){
                            case 0:
                                Cancion cancion1 = playlist.getCancion(0);
                                if (cancion1 != null){
                                    cancion1.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 1:
                                Cancion cancion2 = playlist.getCancion(1);
                                if (cancion2 != null){
                                    cancion2.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                Cancion cancion3 = playlist.getCancion(2);
                                if (cancion3 != null){
                                    cancion3.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                Cancion cancion4 = playlist.getCancion(3);
                                if (cancion4 != null){
                                    cancion4.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 4:
                                Cancion cancion5 = playlist.getCancion(4);
                                if (cancion5 != null){
                                    cancion5.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 5:
                                Cancion cancion6 = playlist.getCancion(5);
                                if (cancion6 != null){
                                    cancion6.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 6:
                                Cancion cancion7 = playlist.getCancion(6);
                                if (cancion7 != null){
                                    cancion7.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 7:
                                Cancion cancion8 = playlist.getCancion(7);
                                if (cancion8 != null){
                                    cancion8.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 8:
                                Cancion cancion9 = playlist.getCancion(8);
                                if (cancion9 != null){
                                    cancion9.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 9:
                                Cancion cancion10 = playlist.getCancion(9);
                                if (cancion10 != null){
                                    cancion10.reproducir();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                        
                    }while (reproducir < 0 || reproducir > 9);
                    break;
                case 8:
                    System.out.print("Elija una cancion (0-9): ");
                    int favorita;
                    do{
                        favorita = sc.nextInt();
                        switch (favorita){
                            case 0:
                                Cancion cancion1 = playlist.getCancion(0);
                                if (cancion1 != null){
                                    cancion1.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 1:
                                Cancion cancion2 = playlist.getCancion(1);
                                if (cancion2 != null){
                                    cancion2.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                Cancion cancion3 = playlist.getCancion(2);
                                if (cancion3 != null){
                                    cancion3.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                Cancion cancion4 = playlist.getCancion(3);
                                if (cancion4 != null){
                                    cancion4.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 4:
                                Cancion cancion5 = playlist.getCancion(4);
                                if (cancion5 != null){
                                    cancion5.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 5:
                                Cancion cancion6 = playlist.getCancion(5);
                                if (cancion6 != null){
                                    cancion6.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 6:
                                Cancion cancion7 = playlist.getCancion(6);
                                if (cancion7 != null){
                                    cancion7.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 7:
                                Cancion cancion8 = playlist.getCancion(7);
                                if (cancion8 != null){
                                    cancion8.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 8:
                                Cancion cancion9 = playlist.getCancion(8);
                                if (cancion9 != null){
                                    cancion9.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            case 9:
                                Cancion cancion10 = playlist.getCancion(9);
                                if (cancion10 != null){
                                    cancion10.esFavorita();
                                }else{
                                    System.out.println("No hay una cancion.");
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                        
                    }while (favorita < 0 || favorita > 9);
                    break;
                case 9:
                    sc.nextLine();
                    System.out.println("Ingrese el titulo:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese el artista:");
                    String artista = sc.nextLine();
                    System.out.println("Ingrese el album:");
                    String album = sc.nextLine();
                    System.out.println("Ingrese la duracion:");
                    double duracion = sc.nextDouble();
                    System.out.println("Ingrese el genero:");
                    sc.nextLine();
                    String genero = sc.nextLine();
                    System.out.println("Agregar a favoritos? (true/false)");
                    boolean favorito = sc.nextBoolean();
                    playlist.agregarCancion(titulo, artista, album, duracion, genero, favorito);
                    break;
                case 10:
                    System.out.println("Elija una cancion para eliminar (0-9):");
                    int eliminar;
                    do{
                        eliminar = sc.nextInt();
                        playlist.eliminarCancion(eliminar);
                    }while(eliminar < 0 || eliminar > 9);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }while (opcion != 11);
        
    }
    
}
