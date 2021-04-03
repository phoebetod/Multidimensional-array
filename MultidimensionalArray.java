import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] values = { {5, 10, 15},{8, 10, 12},{1, 2, 3} };
        Scanner userInput = new Scanner(System.in);
        System.out.println("What row would you like to look at?");
        int row = userInput.nextInt();

        System.out.println("What index would you like to look up?");
        int index = userInput.nextInt();

        if(row >= 0 && row <= 2 && index >= 0 && index <= 2){
            System.out.println("The value at row " + row + " and at index " + index + " is " + values[row][index]);
        } else {
            System.out.println("You have input a value that does not match this array, please try again.");
        }
    }
}