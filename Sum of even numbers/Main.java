import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    if(a[i]%2==0)
    {
       sum=sum+a[i];
    }
    }
    System.out.println("The sum of the even numbers in the array is "+sum);
    
}}