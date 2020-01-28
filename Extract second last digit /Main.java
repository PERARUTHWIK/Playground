import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
           Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int num1 = (num%100)/10;
      System.out.println(num1);
	}
}