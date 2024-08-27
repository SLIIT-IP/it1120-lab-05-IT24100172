import java.util.Scanner;
public class IT24100172Lab5Q3
{
 public static void main(String[] args)
 {
     final float ROOMCHARGES=48000;
     int sdate, edate,reserveddays;
     float amount;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Start Date (1-31):");
     sdate = sc.nextInt();
     System.out.print("Enter End Date (1-31):");
     edate = sc.nextInt();
     
     if(sdate>=1 && sdate<=31 && edate>=1 && edate<=31)
     {
       if(sdate<edate){
          reserveddays=edate-sdate;
          if(reserveddays>=5){
              amount=ROOMCHARGES*reserveddays*80/100;
          }
          else if (reserveddays>=3){
              amount=ROOMCHARGES*reserveddays*90/100;
          }
          else{
              amount=ROOMCHARGES*reserveddays;
          }

       System.out.println();
       System.out.println("Room Charge Per Day:"+ROOMCHARGES+"/=");
       System.out.println("Number of Days Reserved:"+reserveddays);  
       System.out.println("Total Amount to be Paid:"+amount);  
       }
       else{
          System.out.print("Error: Start Date must be less than End Date");  
       }
     }
     else{
          System.out.print("Error: Days must be between 1 and 31");  
     }
 }
}
              
         
         
         
     
     