// Ejercicio 44: Búsqueda en un array
class Ejercicio44 {
    public static boolean buscar(int e, int[] array) {
        for (int num : array) {
            if (num == e) return true;
        }
        return false; // O(n)
    }
}