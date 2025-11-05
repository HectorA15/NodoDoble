package nodosdobles;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        boolean exit = false;
        int opcion;
        String titulo;
        String artista;
        int duracion;

        Cancion cancion;

        Scanner sc = new Scanner(System.in);

        while (exit == false) {

            System.out.println("Selecciona una opcion:");
            System.out.println("1. INSERTAR FRENTE");
            System.out.println("2. Insertar ULTIMO");
            System.out.println("3. Insertar INDICE");
            System.out.println("4. ELIMINAR FRENTE");
            System.out.println("5. Eliminar ULTIMO");
            System.out.println("6. Eliminar INDICE");
            System.out.println("7. Vaciar LISTA");
            System.out.println("8. IMPRIMIR LISTA");
            System.out.println("9. Mostrar FRENTE");
            System.out.println("10. Mostrar ULTIMO");
            System.out.println("11. TAMANIO de la lista");
            System.out.println("12. Salir");

            System.out.print("Entrada: ");
            if (!sc.hasNextInt()) {
                System.out.println("Opcion invalida, ingrese un numero entero");
                sc.next();
                System.out.print("Entrada: ");
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (opcion) {

                case 1:
                    System.out.print("Titulo: ");
                    titulo = sc.next();
                    System.out.print("Artista: ");
                    artista = sc.next();
                    System.out.print("Duracion: ");
                    duracion = sc.nextInt();

                    System.out.println();
                    cancion = new Cancion(titulo, artista, duracion);

                    lista.insertarAlFrente(cancion);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Titulo: ");
                    titulo = sc.next();
                    System.out.print("Artista: ");
                    artista = sc.next();
                    System.out.print("Duracion: ");
                    duracion = sc.nextInt();

                    System.out.println();
                    cancion = new Cancion(titulo, artista, duracion);

                    lista.insertarAlFinal(cancion);
                    System.out.println();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Indice: ");
                    int indice = sc.nextInt();
                    System.out.print("Titulo: ");
                    titulo = sc.next();
                    System.out.print("Artista: ");
                    artista = sc.next();
                    System.out.print("Duracion: ");
                    duracion = sc.nextInt();

                    System.out.println();
                    cancion = new Cancion(titulo, artista, duracion);
                    
                    
                    lista.insertarIndice(indice, cancion);
                    break;
                case 4:
                    lista.eliminarFrente();
                    break;
                case 5:
                    lista.eliminarUltimo();
                    break;
                case 6:
                    //lista.eliminarIndice();
                    break;

                case 7:
                    lista.vaciarLista();
                    break;

                case 8:
                    lista.imprimirLista();
                    break;
                case 9:
                    System.out.println(lista.getFrente());

                    break;
                case 10:
                    System.out.println(lista.getUltimo());

                    break;
                case 11:
                    System.out.println(lista.cuentaNodos());

                    break;
                case 12:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println();
                    break;
            }
        }

    }

}
