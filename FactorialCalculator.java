import java.util.Scanner;

class FactorialCalculator {
    public static long calculateFactorial(int n) {
        // Base case
        if (n == 0){
            long result;
            result = 1;
            return result;
        }
        // Applying recursion
        return n*calculateFactorial(n-1);
    }
    public static void main(String[] args) {
        // Declaring Scanner object
        Scanner scn = new Scanner(System.in);

        // Taking value of n from user
        System.out.print("Enter value of n: ");
        int n = scn.nextInt();

        // Calculating factorial of n
        long result = calculateFactorial(n);

        // Printing the result
        System.out.print("Factorial of n: ");
        System.out.println(result);        
        
    }
}