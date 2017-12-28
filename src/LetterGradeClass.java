import java.util.Scanner;


public class LetterGradeClass {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int score;
		String con = "y";
		while(con.equals("y") || con.equals("Y")){
			System.out.println("Please input a score:");
			score = scanner.nextInt();
			System.out.println("Your grade is : " + letterGrade(score));
			System.out.println("Continue?(y/n):");
			con = scanner.next();
		}
		System.out.println("test end");
	}
	public static char letterGrade(int score) {
		char grade;
		if (score <0 || score > 100)
		grade = 'X';
		else if (score>=90 && score <=100)
		grade = 'A';
		else if (score>=80 && score <90)
		grade = 'B';
		else if (score>=70 && score <80)
		grade = 'C';
		else if (score>=60 && score <70)
		grade = 'D';
		else
		grade ='F';
		return grade;
	}
}
