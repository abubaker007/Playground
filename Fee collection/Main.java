import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int t=sc.nextInt();
      int b=sc.nextInt();
      int h=sc.nextInt();
      float th=t+h;
      float tb=t+b;
      if(s.equals("MSDS"))
        System.out.println(tb);
      else if(s.equals("MSH"))
        System.out.println(th);
     else if(s.equals("MGSDS"))
        System.out.println((1.5*t)+b);
      else if(s.equals("MGSH"))
        System.out.println((1.5*t)+h);
    }
}
    
