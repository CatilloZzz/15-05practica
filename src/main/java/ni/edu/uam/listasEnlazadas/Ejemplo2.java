package ni.edu.uam.listasEnlazadas;

import java.util.LinkedList;

public class Ejemplo2 {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("loki");
        nombres.add("thor");

        nombres.addFirst("tony");

        nombres.addLast("Peter");

        System.out.println("Lista de nombres organizada:");
        System.out.println(nombres);
    }
}
