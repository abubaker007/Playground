import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
      {
         System.out.println("Vowel");
    }
      else if(c=='b' || c=='c' || c=='d' || c=='f' || c=='g' || c=='h' || c=='j' || c=='k' || c=='l' || c=='m' || c=='n' || c=='o' || c=='p' || c=='q' || c=='r' || c=='s' || c=='t' || c=='v' || c=='w' || c=='x' || c=='y' || c=='z')
      {
         System.out.println("Consonant");
}
      else
      {
         System.out.println("Not an alphabet");
      } 
    }}