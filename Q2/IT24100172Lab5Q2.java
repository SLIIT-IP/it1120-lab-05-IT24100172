import java.util.Scanner;
public class IT24100172Lab5Q2{

 public static void main(String[] args){
 
     int noofmembers;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of new members introduced:");
     noofmembers = sc.nextInt();
     
     if( noofmembers>=5)
     {
         System.out.print("Prize is a: Headphone");
     }
     else
     {
         switch (noofmembers)
         {
             case 0:System.out.print("No Prize");
             break;
             case 1:System.out.print("Prize is a: Pen");
             break;
             case 2:System.out.print("Prize is a: Umbrella");
             break;
             case 3:System.out.print("Prize is a: Bag");
             break;
             case 4:System.out.print("Prize is a: Travelling Chair");
             break;
             default:System.out.print("Input must be a number 0 or greater");
             break;
         }
     }
 }
}
