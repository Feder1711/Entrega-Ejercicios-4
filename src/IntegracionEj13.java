import java.util.function.Function;
// Ejercicio 13: Integración numérica
// La integración numérica es un método para calcular el área bajo una curva.
// En este ejemplo se muestra cómo calcular la integral de una función en un intervalo dado.
// Referencia: https://en.wikipedia.org/wiki/Numerical_integration

public class IntegracionEj13 {
    public static double integral(double a, double b, double h, Function<Double, Double> function) {
        double suma = 0.0;
        for (double x = a; x < b; x += h) {
            suma += function.apply(x) * h;
        }
        return suma;
    }

    public static void main(String[] args) {
        // Ejemplo: Integral de f(x) = x^2 en el intervalo [0,1] con paso 0.1
        double resultado = integral(0, 1, 0.1, x -> x * x);
        System.out.println("Resultado de la integral: " + resultado);
    }
}
