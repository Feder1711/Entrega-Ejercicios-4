// Ejercicio 40: Resolver el ejercicio 11 y calcular su complejidad temporal
class Ejercicio40 {
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma; // O(n)
    }
}

// Ejercicio 41: Comparar complejidades de recursión vs iteración
// Depende del algoritmo del ejercicio 2, generalmente O(n) vs O(1) para algunas operaciones.

// Ejercicio 42: Complejidad de producto cartesiano A × A
// O(n^2) porque se realizan operaciones para cada par (a, b).