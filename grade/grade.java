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
        else if (average >= 98) System.out.println("Highest Honor");
        else if (average >= 95) System.out.println("High Honors");
        else if (average >= 90) System.out.println(" Honors");
        else if (average >= 75) System.out.println("Passed");
        else if (average >= 70) System.out.println("Failed");
    }
}
