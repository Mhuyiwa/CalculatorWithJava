import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the First number: ");
    double number1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the Secound number: ");
    double number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("What operation do you want to perform: ");
    String operation = scanner.nextLine();

    if (operation.equals("Addition")) {
      System.out.printf("%f + %f = %.2f", number1, number2, number1 + number2);
    } else if (operation.equals("Subtraction")) {
      System.out.printf("%f - %f = %.2f", number1, number2, number1 - number2);
    } else if (operation.equals("Multiplication")) {
      System.out.printf("%f * %f = %.2f", number1, number2, number1 * number2);
    } else if (operation.equals("Division")) {
      if (number2 == 0) {
        System.out.println("Cannot divide by zero.");
      } else {
        System.out.printf("%f / %f = %.2f", number1, number2, number1 / number2);
      }
    } else {
      System.out.printf("%s is not a supported operation.", operation);
    }
    scanner.close();
  }
}