import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int columns=sc.nextInt();
      int trees=sc.nextInt();
      if(trees>=1&&trees<=rows||trees%rows==0||trees%rows==1)
       System.out.print("Yes");
      else
        System.out.println("No");
	}
}