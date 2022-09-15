import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);

        System.out.print(" English : ");
        float englishGrade = s. nextFloat();

        System.out.print(" Math : ");
        float mathGrade = s. nextFloat();

        System.out.print(" Science : ");
        float scienceGrade = s. nextFloat();

        System.out.print(" MAPEH : ");
        float mapehGrade = s. nextFloat();

        float average = (englishGrade + mathGrade + scienceGrade + mapehGrade) / 4;
       
        System.out.println();
        System.out.println("Average : " + average);

        if (average > 100) System.out.println("Invalid Grade");
        else if (average >= 98 && average <= 100) System.out.println(" With Highest Honor");
        else if (average >= 95 && average <=  97.99) System.out.println(" With High Honors");
        else if (average >= 90 && average <= 94.99) System.out.println(" With Honors");
        else if (average >= 75 && average <= 89.99 ) System.out.println("Passed");
        else  {
             System.out.println("Failed");
    }
}
}