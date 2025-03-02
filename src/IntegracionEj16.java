
import java.util.function.Function;
import java.util.stream.IntStream;

public class IntegracionEj16 {
    public static double integral(double a, double b, double h, Function<Double, Double> function) {
        return IntStream.range(0, (int) ((b - a) / h))
                .mapToDouble(i -> function.apply(a + i * h) * h)
                .sum();
    }

    public static void main(String[] args) {
        double resultado = integral(0, 1, 0.1, x -> x * x);
        System.out.println("Resultado de la integral con Streams: " + resultado);
    }
}
