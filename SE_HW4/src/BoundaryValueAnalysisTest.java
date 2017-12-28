import junit.framework.Assert;

import org.junit.Test;



public class BoundaryValueAnalysisTest {
	
	@Test
	public void testBoundaryValueAnalysisGradeX(){
		int score;
		score = -1;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('X', actual);
		
		score = 101;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('X', actual);
	}
	
	@Test
	public void testBoundaryValueAnalysisGradeA(){
		int score;
		score = 90;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('A', actual);
		
		score = 95;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('A', actual);
		
		score = 100;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('A', actual);
	}
	
	@Test
	public void testBoundaryValueAnalysisGradeB(){
		int score;
		score = 80;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('B', actual);
		
		score = 85;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('B', actual);
		
		score = 89;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('B', actual);
	}
	
	@Test
	public void testBoundaryValueAnalysisGradeC(){
		int score;
		score = 70;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('C', actual);
		
		score = 75;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('C', actual);
		
		score = 79;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('C', actual);
	}
	
	@Test
	public void testBoundaryValueAnalysisGradeD(){
		int score;
		score = 60;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('D', actual);
		
		score = 65;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('D', actual);
		
		score = 69;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('D', actual);
	}
	
	@Test
	public void testBoundaryValueAnalysisGradeF(){
		int score;
		score = 0;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('F', actual);
		
		score = 30;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('F', actual);
		
		score = 59;
		actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('F', actual);
	}
}
