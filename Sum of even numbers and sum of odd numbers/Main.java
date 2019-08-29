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
    int sum=0,sum1=0;
    for(int i=0;i<n;i++)
    {
          if(a[i]%2==0)
          {
            sum=sum+a[i];
          }
    }
        for(int i=0;i<n;i++)
    {
          if(a[i]%2!=0)
          {
            sum1=sum1+a[i];
          }
        }
    System.out.println("The sum of the even numbers in the array is "+sum);
    System.out.println("The sum of the odd numbers in the array is "+sum1);
  }}