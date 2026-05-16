package ni.edu.uam.ordenacioList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejem2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("George");
        nombres.add("Pedro");
        nombres.add("Tony");
        nombres.add("Peter");
        nombres.add("Steve");

        System.out.println("Nombres originales: " + nombres);

        // Ordenamos alfabéticamente
        Collections.sort(nombres);

        System.out.println("Nombres ordenados (A-Z): " + nombres);
    }
}
