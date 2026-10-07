package basics;

public class Pascal_first {
    /*
    * fonctionne mais la formule de récursivité est bcp trop lourde pour un simple int
    * au-delà de 12!, un simple int ne passe plus
    * dans les facts, on utilise n-1 (et donc n-1-i) car l'exo compte àpd 1 et non 0 pour les lignes
     */
    public static int factorielleRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorielleRecursive(n - 1);
    }
    public static int[] pascal(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[n-1] = 1;
        for (int i = 1; i < n - 1; i++) {
            result[i] = factorielleRecursive(n-1) / ( factorielleRecursive(i) * factorielleRecursive(n-1-i));
        }
        return result;
    }
}
