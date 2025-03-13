import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando todos los ejercicios:\n");

        // Ejercicio 35
        System.out.println("Ejercicio 35:");
        System.out.println("Suma Iterativa (n=10): " + Ejercicio35.sumaIterativa(10));
        System.out.println("Suma Recursiva (n=10): " + Ejercicio35.sumaRecursiva(10));

        // Ejercicio 38
        System.out.println("\nEjercicio 38:");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println("Primer elemento: " + Ejercicio38.primero(lista));
        System.out.println("Elemento en posición 2: " + Ejercicio38.nEsimo(lista, 2));

        // Ejercicio 40
        System.out.println("\nEjercicio 40:");
        System.out.println("Suma Iterativa (n=10): " + Ejercicio40.sumaIterativa(10));

        // Ejercicio 43
        System.out.println("\nEjercicio 43:");
        double[][] matriz = {{1.0, 2.0}, {3.0, 4.0}};
        System.out.println("Suma de matriz: " + Ejercicio43.sumaElementosMatriz(matriz));

        // Ejercicio 44
        System.out.println("\nEjercicio 44:");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Buscar 3: " + Ejercicio44.buscar(3, array));
        System.out.println("Buscar 6: " + Ejercicio44.buscar(6, array));

        // Ejercicio 45
        System.out.println("\nEjercicio 45:");
        System.out.println("Buscar 3 (Recursivo): " + Ejercicio45.buscarRecursivo(3, array, 0, array.length - 1));

        // Ejercicio 46
        System.out.println("\nEjercicio 46:");
        System.out.println("Fibonacci Recursivo (n=10): " + Ejercicio46.fibonacciRecursivo(10));
        System.out.println("Fibonacci Iterativo (n=10): " + Ejercicio46.fibonacciIterativo(10));

        // Ejercicio 47
        System.out.println("\nEjercicio 47:");
        System.out.println("Suma de los primeros 10 números: " + Ejercicio47.sumaNPrimeros(10));

        // Ejercicio 48
        System.out.println("\nEjercicio 48:");
        System.out.println("Suma NP de los primeros 10 números: " + Ejercicio48.sumaNPPrimeros(10));

        // Ejercicio 52
        System.out.println("\nEjercicio 52:");
        System.out.println("f(10): " + Ejercicio52.f(10));

        System.out.println("\nEjecución completa.");
    }
}
