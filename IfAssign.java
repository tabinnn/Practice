// Java Program to Enter Marks of Five Subjects and Calculate Total, Percentage, and Grade
import java.util.Scanner;

public class IfAssign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        // To store the values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();
		
		
		

      

        float total;
        float percentage;
        

        // Calculate total, average and percentage
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        System.out.println("\nThe Total marks   = " + total + "/500.0");
        percentage = (float)((total / 500.0) * 100);

        // It will calculate the Grade
         if (percentage >= 80 )
		 {
			 System.out.println("\nExceptional");
		 }
			 
     
         if (percentage >= 70 )
		 {
            System.out.println("\nVery Good");
		 }
         if (percentage>= 60 )
		 {
			 System.out.println("\nGood");
		 }
        if (percentage>=50)
		{
			System.out.println("\nPass");
		}
		if(percentage<50)
		{
			System.out.println("\nFail");
		}
            

       
        
       
    }
}