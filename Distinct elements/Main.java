import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
       }
        int count=0,i,j;
        for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
          {
          if(a[i]==a[j])
            break;
        }
          if(i==j)
            count++;
        }
        System.out.println(count);
}}