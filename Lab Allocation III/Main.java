import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=0;
      if(a>d)e++;
      if(b>d)e++;
      if(c>d)e++;
         System.out.println(e);
    }
}
