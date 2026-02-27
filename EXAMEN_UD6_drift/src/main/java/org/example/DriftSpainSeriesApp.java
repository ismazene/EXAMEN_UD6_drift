package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DriftSpainSeriesApp {
    public static String nombre;
    public static String pais;
    static Scanner teclado = new Scanner(System.in);

    public static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();

    static void main() {

        Piloto skoda = new Piloto("SKODA");
        Piloto mercedes = new Piloto("MERCEDES");
        Piloto toyota = new Piloto("TOYOTA");


        System.out.println("=== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ===");

        System.out.println("Inscribiendo participante");
        System.out.println();
        System.out.println("Nombre");
        String nombre = teclado.next();

        System.out.println("Pais");
        String pais = teclado.next();

        System.out.println("Piloto " + nombre + " de la marca " + skoda);

        System.out.println("Piloto " + nombre + " realizando una inscripcion");
        System.out.println("Elige la catgoria [STREET, PRO, HYPER_DRIFT]");
        String opcionCategoria = teclado.next().toUpperCase();
        System.out.println();

        switch (opcionCategoria){

            case "STREET":
                System.out.println("Piloto " + nombre + " inscrito en STREER. Pendiente de pago: ");
                break;
            case "PRO":
                System.out.println("Piloto " + nombre + " inscrito en PRO. Pendiente de pago: " );
                break;
            case "HYPER_DRIFT":
                System.out.println("Piloto " + nombre + " inscrito en HYPER_DRIFT. Pendiente de pago: ");
            default:
                System.out.println("Tienes que poner una opcion valida");
                System.out.println();
        }



        System.out.println("Juez " + nombre + " creado");

    }
}
//    public static void verGanador(CategoriaDrift categoria){}
