// Ejercicio 45: Búsqueda binaria recursiva en un array ordenado
class Ejercicio45 {
    public static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
        if (inicio > fin) return false;
        int medio = (inicio + fin) / 2;
        if (array[medio] == e) return true;
        if (array[medio] > e) return buscarRecursivo(e, array, inicio, medio - 1);
        return buscarRecursivo(e, array, medio + 1, fin); // O(log n)
    }
}