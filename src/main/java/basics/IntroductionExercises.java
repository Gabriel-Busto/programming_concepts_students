package basics;

public class IntroductionExercises {

    public static int variable = 0;

    public static int[] squares;

    /*
     * Function that bound variable to value
     */
    public static void attribute(int value){
        variable = value;
    }

    /*
     * Function that return the addition of the two parameters
     */
    public static int add(int a, int b){
        return a + b;
    }

    /*
     * return true is a and b are equal
     */
    public static boolean equalsIntegers(int a, int b){
        return a == b;
    }

    /*
     * Function that return the max between a and b in one line
     * You must use a ternary operation
     * équivalent de if a > b: return a
     *               else: return b
     */
    public static int max(int a, int b){
        return a > b ? a : b;
    }

    /*
     * Function that return the middle value.
     * If a > b > c, the function must return b.
     * If two value are equals, return -1.
     * || : opérateur logique OU
     * && : opérateur logique ET
     */
    public static int middleValue(int a, int b, int c){
        if (a == b || b == c || a == c) {
            return -1;
        }
        if ((a > b && a < c) || (a < b && a > c)) {
            return a;
        }
        if ((b > a && b < c) || (b < a && b > c)) {
            return b;
        }
        return c;
    }

    /*
     * This function must return :
     * "Good morning, sir!" if str is "Morning"
     * "Good evening, sir!" if str is "Evening"
     * "Hello, sir!" otherwise
     * Use a switch case statement
     * Your implementation must be case sensitive
     * And you should not use if/else!
     * switch et case sont l'équivalent de if str = "Morning": return "Good morning, Sir !"
     * code plus lisible et facile de modification
     */
    public static String greetings(String str){
        switch (str) {
            case "Morning":
                return "Good morning, sir!";
            case "Evening":
                return "Good evening, sir!";
            default:
                return "Hello, sir!";
        }
    }

    /*
     * This function must return a new array of length 3
     * The first element of this new array is the last element of a
     * The second element is the first element of a
     * The last element is the middle element of a
     * a.length équivalent à len(a)
     * int[] : array de int
     *int[]{..., ..., ...} : instancie et initialise direct un tableau avec toutes les données déjà complétées
     * P.S. : array[3] permet d'accéder à l'indice 3 (le 4e) d'un array, comme en python
     */
    public static int[] lastFirstMiddle(int[] a){
        return new int[]{a[a.length - 1], a[0], a[a.length / 2]};
    }

    /*
     * This function must return the sum of the elements of array using a for loop
     * i++ équivalent à i += 1 (pour d'autres pas, i+= 2, i-- équivalent à i += -1, i += 0.5)
     * for (début, condition de fin, incrémentation): ...
     */
    public static int sum(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    /*
     * return the maximum element of array using a while loop
     */
    public static int maxArray(int[] array){
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }

    /*
     * Assign to the variable square, the square of the
     * parameters.
     * try et catch équivalents de try except en python
     * Integer.parseInt(...), avec ... un String : convertit un string en int si possible, sinon renvoie l'erreur vue dans le catch
     * String... args : permet d'inclure autant d'éléments que l'on veut, cela créera un array args rempli de Strings
     * ex : main(0 3 4) donnera args =
     */
    public static void main(String... args){
        squares = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                int val = Integer.parseInt(args[i]);
                squares[i] = val * val;
            }
            catch (NumberFormatException e) {
                squares[i] = 0;
            }
        }
    }
}