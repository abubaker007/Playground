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
     
     double mean,sum=0.00;
     for(int i=0;i<n;i++)
     {
        sum=sum+a[i];
    }
     for(int i=0;i<n;i++)
     { 
       mean=sum/n;
      System.out.printf("The mean of the array is %.2f",mean);
       break;
     }
   }
 }
