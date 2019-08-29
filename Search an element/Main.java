import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int key=s.nextInt();
      int flag=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==key)
        {
         flag=1;
          break;
        }
      }
        if(flag==1)
          System.out.print(key+" is present in the array");
        else
           System.out.print(key+" is not present in the array");
      
      
    }
}