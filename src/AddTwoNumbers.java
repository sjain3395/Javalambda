import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create A Scanner Object
        System.out.println("Type a number");
        x = myObj.nextInt();  // Read User Input

        System.out.println("Type a another number");
        y = myObj.nextInt(); // Read User Input

        sum = x+y;
        System.out.println("Sum is: " + sum);
    }
}
