import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int s1 = num1%10;
      int s2 = num1/10;
      int sum = s1 + s2;
      System.out.println(sum);
	}
}