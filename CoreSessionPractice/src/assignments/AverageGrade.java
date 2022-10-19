package assignments;

public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer, science, math;
		computer = 90;
		science = 80;
		math = 80;
		
		int totalMarks;
		totalMarks = computer + science + math;
		
		float averageGrade;
		averageGrade = totalMarks / 3f;
		
//		System.out.println("The average of students is " + averageStudents);
		
		if(averageGrade >=90 && averageGrade <=100) {
			System.out.println("Average grade of student is = A");
		}else if (averageGrade >=80 && averageGrade <=89) {
			System.out.println("Average grade of student is = B");
		}else if (averageGrade >=70 && averageGrade <=89) {
			System.out.println("Average grade of student is = C");
		}else {
			System.out.println("Failling grade, better work harder.");
		}

	}

}
