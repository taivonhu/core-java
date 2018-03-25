import java.util.Scanner;
public class bai4{

   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double m = in.nextDouble();
int n=0;
   if(m!=0)
   {
     if(m>0)
     {
	n=1;
     }
     else
     {
	n=-1;
     }
}
   else
   {
     n=0;
   }
System.out.println("The value of m = "+m);
System.out.println("The value of n = "+n);
}
}