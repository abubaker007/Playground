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
      String l=sc.next();
      if(l.equals("L1"))
      {
         if(b>c)
          System.out.println("L3");
        else
           System.out.println("L2");
      }
      else if(l.equals("L2"))
      {
         if(a>c)
          System.out.println("L3");
        else
           System.out.println("L1");
      }
      else
      {  if(a>b)
          System.out.println("L2");
        else
           System.out.println("L1");
    }
    }
}
