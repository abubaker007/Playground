import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner s1=new Scanner(System.in);
      int n=s1.nextInt();
      int s[]=new int[n];
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
      for(int i=0;i<n;i++)
        s[i]=a1[i]+a2[i];
      for(int i=0;i<n;i++)
        System.out.println(s[i]);
      

  
    }
}