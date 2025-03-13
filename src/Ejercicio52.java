// Ejercicio 52: Complejidad de función recursiva f
class Ejercicio52 {
    public static int f(int n) {
        if (n == 0) return 1;
        if (n < 0) return -1;
        int m = n / 2;
        return f(m) * f(m); // O(log n) aproximadamente
    }
}

// Ejercicio 53: Comparación de inserción en ArrayList
// Si está ordenado: O(n), si no: O(1) en promedio.

// Ejercicio 55: Problema del ajedrez
// No está resuelto debido a su complejidad combinatoria exponencial.