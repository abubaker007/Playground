import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
           int x = sc.nextInt();

          boolean isEven = x%2 == 0 ? true:false;

          if(isEven)

             System.out.println("Even");

          else

             System.out.println("Odd"); // prints Odd

     }

}
    
