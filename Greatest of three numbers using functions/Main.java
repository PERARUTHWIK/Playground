import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2=sc.nextInt();
      int n3 =sc.nextInt();
      int max = Gretest_of_two_numbers(n1,n2);
      if(max>n3)
      {
        System.out.println(max);
      }
      else
      {
        System.out.println(n3);
      }
	}
  public static int Gretest_of_two_numbers(int n1,int n2)
  {
    int Gretest_of_two_numbers =0;
    if(n1>n2)
    {
      Gretest_of_two_numbers=n1;
    }
    else
    {
      Gretest_of_two_numbers = n2;
    }
    return Gretest_of_two_numbers;
  }
 
}