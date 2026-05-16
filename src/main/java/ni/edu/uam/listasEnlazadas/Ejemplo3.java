package ni.edu.uam.listasEnlazadas;

import java.util.LinkedList;

public class Ejemplo3 {
    public static void main(String[] args) {
        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse ");
        productos.add("Teclado ");
        productos.add("Monitor ");

        System.out.println("Inventario inicial: " + productos);

        productos.remove("Mouse ");

        System.out.println("Inventario actualizado: " + productos);
        System.out.println("Total de productos: " + productos.size());
    }
}
