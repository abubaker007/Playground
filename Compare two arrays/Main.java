import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a1[]=new int[n];
    int a2[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a1[i]=sc.nextInt();
  }
    for(int i=0;i<n;i++)
    {
         a2[i]=sc.nextInt();
    }
    int flag=0;
   for(int i=0;i<n;i++)
   {
       if(a1[i]==a2[i])
         flag=1;
   }
    if(flag==1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }}