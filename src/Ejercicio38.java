// Ejercicio 38: Complejidad de los métodos
import java.util.ArrayList;
class Ejercicio38 {
    public static String primero(ArrayList<String> lista) {
        return lista.get(0); // O(1)
    }

    public static String nEsimo(ArrayList<String> lista, int n) {
        return lista.get(n); // O(1)
    }
}

// Ejercicio 39: Complejidad de los algoritmos del Ejercicio 35
// Iterativo: O(n), Recursivo: O(n)