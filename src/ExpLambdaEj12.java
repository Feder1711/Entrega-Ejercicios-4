import java.util.function.BiFunction;
//Ejercicio 12: Expresiones lambda

// Una expresión lambda en Java es una forma concisa de representar funciones anónimas.
// Se introdujo en Java 8 y permite escribir código más limpio y funcional.

public class ExpLambdaEj12 {
        public static void main(String[] args) {
            // Expresión lambda para sumar dos números
            BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
            System.out.println(suma.apply(5, 3)); // Salida: 8
        }
}
