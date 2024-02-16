public class Main {
    public static void main (String[] args) {
        int rows = 4; // Number of rows for the pattern

        int i = 1;
        // While loop to print the stars
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}