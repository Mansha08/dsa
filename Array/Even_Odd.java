public class Even_Odd {
    public static boolean EveN(int n) {

        if (n % 2 == 0) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        if (EveN(n)) {
            System.out.println("even number");
        } else {
            System.err.println("odd number");
        }

    }

}
