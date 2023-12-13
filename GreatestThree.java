import java.util.Scanner;

public class GreatestThree
{
   public static void main(String args[])
   {
     Scanner reader new Scanner(System.in);
     System.out.print("\nEnter the numbers-------");
     System.out.print("\nEnter the first number=");
     Int fn=reader nextInt();
     System.out.print("\nEnter the second number"); 
     int sn reader.nextInt();
     System.out.print("\nEnter the third number");
     int tn reader.nextInt();

     reader.close();

if(fn>sn)
  {
    if(fn>tn)
      {
         system.out.print("\nThe greatest no="+fn);
      }
      else
      {
         system.out.print("\nThe greatest no="+tn);
      }
}
else
{
  if(sn>tn)
    {
      system.out.print("\nThe greatest no="+sn);
    }
    else
    {
      system.out.print("\nThe greatest no="+tn);
    }
    }
}
//java
        