package org.example;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Cliente obj = new Cliente();
        String nombre;
        do {
            System.out.println("\n---Bienvenidos---");
            System.out.println("Seleccione una opcion");
            System.out.println("1 Agregar Cliente Normal");
            System.out.println("2) Agregar CLientes VIps");
            System.out.println("3) Atender al siguiente Cliente");
            System.out.print("4) Salir del programa");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1:
                    System.out.println("Escribe el nombre del cliente normal: ");
                    nombre = scanner.nextLine();
                    obj.agregarClienteNormal(nombre);
                    break;

                case 2:
                    System.out.println("Escribe el nombre del cliente VIP: ");
                    nombre = scanner.nextLine();
                    obj.agregarClienteVIP(nombre);
                    break;

                case 3:
                    obj.atenderSiguienteCliente();
                    break;

                case 4:
                    System.out.println("Salir del Programa");
                    break;

                default:
                    System.out.println("Esa opcion no es valida");
                    break;

            }
        }
        while (opcion != 4) ;
        scanner.close();
    }
}