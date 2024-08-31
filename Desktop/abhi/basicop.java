import java.util.Scanner;

class basicop {
  public static void main(String[] args) {
    char op;
    Double num1, num2, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator:  ");
    op = input.next().charAt(0);
    System.out.println("Enter first number");
    num1 = input.nextDouble();
    System.out.println("Enter second number");
    num2 = input.nextDouble();

    switch (op) {
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}