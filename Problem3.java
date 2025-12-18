import java.util.Scanner;
public class Problem3 {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter value: " );
    int x = sc.nextInt();

    int limit;
    if(x % 2 == 0) {
      limit = x - 1;

    } else {
      limit = x;
    }

    for (int i  = 1; i <= limit; i+=2) {
      System.out.print(i);
      if(i + 2 <= limit) {
        System.out.print(", ");
      }
    }
  }
}
