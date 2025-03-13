// Ejercicio 34: ¿Qué es un algoritmo? : Un algoritmo es un conjunto de pasos bien definidos, finitos y ordenados que permiten resolver un problema o realizar una tarea específica. Debe cumplir con ciertas propiedades:
//
//Definido: Cada paso debe estar claramente especificado.
//Finito: Debe terminar en algún momento.
//Preciso: Para la misma entrada, siempre produce la misma salida.
//Eficiente: Debe ejecutarse en un tiempo razonable.

// Ejercicio 35: Algoritmo iterativo y recursivo para la suma de los primeros n números naturales
class Ejercicio35 {
    // Iterativo
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Recursivo
    public static int sumaRecursiva(int n) {
        if (n == 0) return 0;
        return n + sumaRecursiva(n - 1);
    }
}

// Ejercicio 36: Definir O(n) en términos de un límite de funciones
// Se define como un límite superior asintótico de una función.

// Ejercicio 37: Complejidad temporal del cálculo del espacio recorrido
// La fórmula es e = (1/2)gt^2 -> O(1), ya que el cálculo es inmediato.
