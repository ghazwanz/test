import java.util.Scanner;

public class Testing {
    public static int arithmetic(char opt, int x, int y) {
        int res = 0;
        switch (opt) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
            case '%':
                res = x % y;
                break;
        
            default:
                System.out.println("Input is not valid");
                break;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        int num,num2;

        System.out.print("Insert 1st number: ");
        num = input.nextInt();

        System.out.print("Insert 2nd number: ");
        num2 = input.nextInt();

        input.nextLine();
        System.out.print("Choose an arithmetic operator (+-*/%): ");
        operator = input.nextLine().charAt(0);

        System.out.println("Result for " + num + " " + operator + " " + num2 + " = " + arithmetic(operator, num, num2));
    }   
}