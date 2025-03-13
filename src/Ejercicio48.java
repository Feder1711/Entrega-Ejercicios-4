class Ejercicio48 {
    public static int sumaNPPrimeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                suma += j;
            }
        }
        return suma; // O(n^2)
    }
}

// Ejercicio 49: Definición de O(f(n))
// Se define como la función de orden superior que representa el límite superior asintótico.

// Ejercicio 50: Análisis de logaritmos
// O(log2(n)) implica que crece lentamente respecto a n.

// Ejercicio 51: Comparación de crecimiento de funciones
// f4(x) = 2^x crece más rápido que todas las demás.