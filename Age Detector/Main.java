import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(b<a)
      {
        b=b+100;
      }
      System.out.println(b-a);
    }
}