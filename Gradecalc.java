
import java.util.Scanner;

public class Gradecalc {
    public static void main(String[] args) {
        System.out.println("Enter your marks in each subject ,for computation of total marks ,percentage and grade");
        Scanner sc = new Scanner(System.in);
        
          System.out.print("MATH"+"=");
          float sub_1 = sc.nextFloat();
          System.out.print("SCIENCE"+"=");
          float sub_2 = sc.nextFloat();
          System.out.print("ENGLISH"+"=");
          float sub_3= sc.nextFloat();
          System.out.print("HINDI"+"=");
          float sub_4 = sc.nextFloat();
          System.out.print("SOCIAL-SCIENCE"+"=");
          float sub_5 = sc.nextFloat();
           float overall_marks =500;
           // for printing total marks and percentage
          float total_marks =(sub_1+sub_2+sub_3+sub_4+sub_5);
          float average_percentage = (total_marks/overall_marks)*100;
          System.out.println("TOTAL MARKS"+"="+total_marks);
          System.out.println("AVERAGE PERCENTAGE"+"="+average_percentage+"%");
          if (average_percentage>80) System.out.println("GRADE"+"="+"A+");
          else if (average_percentage>70) System.out.println("GRADE"+"="+"A");
          else if (average_percentage>60) System.out.println("GRADE"+"="+"A-");
          else if (average_percentage>50) System.out.println("GRADE"+"="+"B");
          else if (average_percentage>40) System.out.println("GRADE"+"="+"c");
          else if (average_percentage>33) System.out.println("GRADE"+"="+"D");
          else System.out.println("GRADE"+"="+"FAIL");


          


        
    }
    
}
