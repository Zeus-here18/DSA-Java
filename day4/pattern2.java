
public class pattern2 {
    public static void main(String[] args) {
        int n = 4; // Total rows
        int m = 5; // Total columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= m; j++) {
                // Check if the position is on the border
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    // If not on the border, print a space
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}