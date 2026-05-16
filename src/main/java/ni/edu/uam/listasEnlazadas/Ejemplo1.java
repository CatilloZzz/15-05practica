package ni.edu.uam.listasEnlazadas;

import java.util.LinkedList;

public class Ejemplo1 {
    public static void main(String[] args) {
    LinkedList<Integer> numeros = new LinkedList<>();

    numeros.add(15);
    numeros.add(30);
    numeros.add(45);
    numeros.add(60);

    System.out.println("Elementos del LinkedList de números:");
    System.out.println(numeros);
}
}
