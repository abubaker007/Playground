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
      int l1=0,l2=0,l3=0;
      if(d<a&&d<b&&d<c)
      {
         l1=d-a;
        l2=d-b;
        l3=d-c;
      }
if(l1>l2)
{
if(l2>l3)
  System.out.println("L2");
else
  System.out.println("L3");
}
  else
    System.out.println("L1");
    }
      
    }
