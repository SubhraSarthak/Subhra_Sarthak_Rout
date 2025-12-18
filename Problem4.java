
import java.util.*;

public class Problem4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

    }

    Map<Integer, Integer> result = new HashMap<>();

    for(int i = 1; i <= 9 ; i++) {
      int count  = 0;
      for (int num : arr) {
        if(num % 1 == 0 ) {
          count++;
        }
      }
      result.put(i, count);
    }
    System.out.println(result);
    sc.close();
  }
}
