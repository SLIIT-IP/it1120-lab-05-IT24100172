import java.util.Scanner;
public class IT24100172Lab5Q1
{
 public static void main(String[] args)
 {
     int Num1,Num2,Num3,Max,Min;
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter the first integer:");
     Num1 = sc.nextInt();
     
     System.out.print("Enter the second integer:");
     Num2 = sc.nextInt();
     
     System.out.print("Enter the third integer:");
     Num3 = sc.nextInt();
     if(Num1>Num2){
         Min=Num2;
         Max=Num1;
    }else{
        Max=Num2;
        Min=Num1;
    } 
    if(Num3>Max){
        Max=Num3;
    }
    if(Num3<Min){
        Min=Num3;
    }
    System.out.println("User entered numbers are:"+ Num1 + " " + Num2+ " " + Num3);
    System.out.println("The Smallest number is:"+Min);
    System.out.println("The Largest number is:"+Max);
 }
} 