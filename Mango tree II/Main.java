import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int t=sc.nextInt();
      if(t>=1&&t<=r||t%r==0||t%r==1)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}