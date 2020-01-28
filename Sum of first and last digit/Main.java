import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int last_digit = num%10;
      while(num>10)
      {
        num = num/10;
      }
      int first_digit = num;
      int sum = last_digit + first_digit;
      System.out.println(sum);
	}
}