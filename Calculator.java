import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting makes testing easier
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        double r;
        switch (op) {
            case '+':
                r = a + b;
                System.out.println("Addition is  = "+r);
                break;
            case '-':
                r = a - b;
                System.out.println("Subtraction is = "+r);
                break;
            case '*':
                r = a * b;
                System.out.println("Multiplication is = "+r);
                break; 
                
            case '/':
                if(b!=0){
                    r = a/b;
                    System.out.println("Division is = "+r);
                }
                else r = Double.NaN; // division by zero -> NaN
                break;
            default:
                r = 0; // default value for unknown operator
        }

        
        sc.close();
    }
}

