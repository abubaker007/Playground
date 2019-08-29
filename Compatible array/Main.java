import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code her
      Scanner s1=new Scanner(System.in);
      int n=s1.nextInt();
    //  int s[]=new int[n];
      int a1[]=new int[n];
      int a2[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a1[i]=s1.nextInt();
      }
       for(int j=0;j<n;j++)
       {
          a2[j]=s1.nextInt();
    }
    int flag=0;
      for(int i=0;i<n;i++)
      {
         if(a1[i]<a2[i])
         {  
            flag=1;
             break;
         }
      }
    if(flag==1)
      System.out.println("Incompatible");
     else
        System.out.println("Compatible"); 
  }
}