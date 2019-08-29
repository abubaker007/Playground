import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner s=new Scanner(System.in);
      int n,max;
      n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
    }
      max=a[0];
      for(int i=0;i<n;i++)
      {
      if(a[i]>max)
      {
         max=a[i];
}
      }
      System.out.println(max+" is the maximum element in the array");
       
    }}