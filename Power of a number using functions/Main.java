import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
      int exponent = in.nextInt();
      System.out.println(result(base,exponent));
    }
  public static int result(int base,int exponent)
  {
	int power =1;
    while(exponent>=1)
    {
      power = power*base;
      exponent--;
    }
    return power;
  }
}
      