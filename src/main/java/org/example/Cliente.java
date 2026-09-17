package org.example;

import java.util.LinkedList;

public class Cliente {
    private LinkedList<String> clientes = new LinkedList<>();
    public void  agregarClienteNormal(String nombre){
        clientes.addLast(nombre);
        System.out.println("Cliente estandar agregado");
    }

    public void agregarClienteVIP(String nombre){
        clientes.addFirst(nombre);
        System.out.println("Cliente VIP agregado");
    }
    public void atenderSiguienteCliente(){
        if (clientes.isEmpty()){
            System.out.println("No se a registrado ningun cliente");
        }else {
            System.out.println("El siguiente cliente esta siendo atendido: " + clientes.getFirst());
        }
    }
}
