package array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = {10,50,80};
		
		Student student = new Student("Ranga",marks);
		
		int number = student.getNumber();
		System.out.println("Student marks : "+number);
		
		
		int sum = student.getTotalMarks();
		System.out.println("Student's Total marks : "+sum);

		int maximum = student.getMaximumMarks();
		System.out.println("Student's Maximum marks : "+maximum);
	
		int minimum = student.getMinimumMarks();
		System.out.println("Student's Minimum marks : "+minimum);
		
		BigDecimal avarage = student.getAvarage();
		System.out.println("Avarage : "+avarage);

		
	}

}
