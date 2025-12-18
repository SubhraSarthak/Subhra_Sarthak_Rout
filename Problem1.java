import java.util.Scanner;
class Problem1 {

  public static double calculate(double a, double b, String operation) {

    switch (operation.toLowerCase()) {
      case "add":
        return a + b ;

      case "subtract":
        return a - b;
      
      case "multiply":
        return a * b;

      case "divide":
        if( b == 0) {
          System.out.println("Division by zero not allowed");
          return 0;
        }  
        return a / b;

      default:
        System.out.println("Invalid Operation");  
        return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter a: ");
    double a  = sc.nextDouble();

    System.out.print("Enter b: ");
    double b = sc.nextDouble();

    System.out.print("Enter operation: ");
    String op = sc.next();
    
    Problem1 c = new Problem1();
    Double result = c.calculate(a, b, op);
    System.out.println("Result: " +result);
    
  }
}