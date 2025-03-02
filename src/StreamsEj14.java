import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.Random;
// Ejercicio 14: Streams
// Los streams son una secuencia de elementos que soportan operaciones secuenciales y paralelas.
// Se introdujeron en Java 8 y permiten trabajar con colecciones de datos de forma más eficiente.
// En este ejemplo se muestran algunas operaciones básicas con streams.
// Referencia: https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html

public class StreamsEj14 {
    public static void main(String[] args) {
        // 1. Stream con rangeClosed()
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        // 2. Stream con range()
        IntStream.range(1, 10).forEach(System.out::println);

        // 3. Stream con iterate()
        IntStream.iterate(2, n -> n + 2).limit(10).forEach(System.out::println);

        // 4. Stream con números aleatorios
        DoubleStream randomNumbers = new Random().doubles(5);
        randomNumbers.forEach(System.out::println);
    }
}