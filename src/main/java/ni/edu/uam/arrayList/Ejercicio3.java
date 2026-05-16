package ni.edu.uam.arrayList;


import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Laptop");
        productos.add("Teclado");
        productos.add("Monitor");
        productos.add("Mouse");

        System.out.println("Productos registrados: " + productos);

        System.out.println("Total de productos: " + productos.size());
    }
}