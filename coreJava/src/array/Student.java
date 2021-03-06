package array;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {

	this.name = name;
	this.marks = marks;
	
	
	}

	public int getNumber() {
		return marks.length;
	}

	public int getTotalMarks() {
		int sum =0;
		for(int mark:marks) {
		sum += mark;	
		}
		return sum;
	}
	
	public int getMaximumMarks() {
		int maximum =0;
		for(int mark:marks) {
			if(mark>maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<minimum) {
				minimum = mark;
			}
		}
	return minimum;
	}

	public BigDecimal getAvarage() {

		int sum = getTotalMarks();
		int number = getNumber();
		
		return new BigDecimal(sum/number);
	}

}
