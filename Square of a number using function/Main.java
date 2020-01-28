import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.print(square_of_num(num));
	} 
  public static int square_of_num(int a)
  {
    int  m = a*a;
    return m;
  }
}