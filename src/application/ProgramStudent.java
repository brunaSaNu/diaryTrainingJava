package application;

import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE: " + student.finalGrade());
		student.finalGrade();
		
		if(student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + student.missingPoints() + " POINTS");
		}
		
		
		sc.close();

	}

}
