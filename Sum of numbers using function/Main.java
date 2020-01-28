import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.print(sum_of_numbers(num));
	}
  public static int sum_of_numbers(int x)
  {
    int sum = 0;
    for(int i=1;i<=x;i++)
    {
      sum = sum+i;
    }
     return sum;
  }
}