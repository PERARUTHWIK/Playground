import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
        Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int s1 = num1/100;
      int s2 = num1%10;
      int s = s1+s2;
      System.out.println(s);
	}
}