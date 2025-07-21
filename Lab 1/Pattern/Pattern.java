import java.util.Scanner;

public class Pattern {
    public static void getUserData() {
       Scanner myObj = new Scanner(System.in);
       System.out.println("Enter amount of rows to print: ");
       int rows = myObj.nextInt();
       printRows(rows);
    }
    
    public static void printRows(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        getUserData();
    }
}