import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            try {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.print("Enter operator (+, -, *, /): ");
                char op = sc.next().charAt(0);

                switch(op) {
                    case '+':
                        System.out.println("Sum = " + (a + b));
                        break;

                    case '-':
                        System.out.println("Difference = " + (a - b));
                        break;

                    case '*':
                        System.out.println("Product = " + (a * b));
                        break;

                    case '/':
                        System.out.println("Division = " + (a / b));
                        break;

                    default:
                        System.out.println("Invalid operator");
                }
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); 
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

            
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
    }
}