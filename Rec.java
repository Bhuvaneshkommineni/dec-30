public class Rec {
    // Recursive method to print the pattern
    public static void printPattern(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }
        // Print the current row
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line
        // Recursive call for the next row
        printPattern(n - 1);
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        printPattern(rows);
    }
}