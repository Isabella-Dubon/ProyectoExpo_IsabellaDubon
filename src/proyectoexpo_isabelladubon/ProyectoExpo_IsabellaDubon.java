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
        playlist.agregarCancion("My Kind of Woman", "Mac DeMarco", "2", 125, "Indie Pop", true);
        playlist.agregarCancion("Blinding Lights", "The Weeknd", "After Hours", 200, "SynthPop", true);
        playlist.agregarCancion("Come As You Are", "Nirvana", "Nevermind", 301, "Grunge", true);
        playlist.agregarCancion("Take On Me", "a-ha", "Hunting High and Low", 225, "SynthPop", false);
        playlist.agregarCancion("Bohemian Rhapsody", "Queen", "A Night at the Opera", 354, "Rock", true);
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
            System.out.println("3. Mostrar Lista de Canciones");
            System.out.println("4. Reproducir Cancion");
            System.out.println("5. Cancion: Es Favorita?");
            System.out.println("6. Agregar Cancion");
            System.out.println("7. Eliminar Cancion");
            System.out.println("8. Salir");
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }while (opcion != 8);
        
    }
    
}
