package ni.edu.uam.arrayList;



import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(25);
        numeros.add(42);
        numeros.add(7);
        numeros.add(99);

        System.out.println("Lista de números: " + numeros);
    }
}

// El output que este script nos da es: Lista de números: [10, 25, 42, 7, 99]