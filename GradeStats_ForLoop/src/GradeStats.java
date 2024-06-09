import java.util.Scanner;

public class GradeStats {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double[] grades = new double[10] ;
		double maxGrade = 0;
		double minGrade = 0;
		double sumGrades = 0;
		
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Enter Grade" + (i + 1) + ": ");
			grades[i] = scnr.nextDouble();
		}

		for(int i = 0; i < grades.length; i++) {
			if(i == 0) {
				maxGrade = grades[0];
			}
			else if(grades[i] > maxGrade) {
				maxGrade = grades[i];
			}
			if(i == 0) {
				minGrade = grades[0];
			}
			else if(grades[i] < minGrade) {
				 minGrade = grades[i];
			}			
		}
		
		System.out.println("Max Grade: " + maxGrade);
		System.out.println("Min Grade: " + minGrade);
		
		for(int i = 0; i < grades.length; i++) {
			sumGrades += grades[i] ;
		}
		double avgGrades = sumGrades / grades.length;
		System.out.println("Grade Average: " + avgGrades);

	}
}
