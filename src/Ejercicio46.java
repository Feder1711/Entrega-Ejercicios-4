// Ejercicio 46: Complejidad del Fibonacci recursivo (O(2^n)) y iterativo (O(n))
class Ejercicio46 {
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static int fibonacciIterativo(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}