package ni.edu.uam.ordenacioList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejem3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);
        numeros.add(30);

        System.out.println("Original: " + numeros);

        Collections.sort(numeros);

        Collections.reverse(numeros);

        System.out.println("Orden descendente (Mayor a menor): " + numeros);
    }
}
