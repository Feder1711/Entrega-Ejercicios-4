// Ejercicio 43: Complejidad de sumaElementosMatriz
class Ejercicio43 {
    public static double sumaElementosMatriz(double[][] matriz) {
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma; // O(n^2)
    }
}

