package ni.edu.uam.ordenacioList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejem1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(1);
        numeros.add(23);

        System.out.println("Lista original: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista ordenada (Ascendente): " + numeros);
    }
}
