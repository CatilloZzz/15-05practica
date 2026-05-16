package ni.edu.uam.arrayList;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Fabiola");
        estudiantes.add("Sara");
        estudiantes.add("Gabriela");

        System.out.println("Lista inicial: " + estudiantes);

        estudiantes.remove("Sara");

        System.out.println("Lista después de eliminar a un estudiante: " + estudiantes);
    }
}