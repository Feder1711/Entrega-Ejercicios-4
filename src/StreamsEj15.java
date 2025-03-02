import java.util.stream.IntStream;
import java.util.List;

public class StreamsEj15 {
    public static int suma(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static double media(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println("Suma hasta 5: " + suma(5));
        System.out.println("Factorial de 5: " + factorial(5));
    }
}
