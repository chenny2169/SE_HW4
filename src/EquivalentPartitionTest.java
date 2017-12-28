import junit.framework.Assert;

import org.junit.Test;

public class EquivalentPartitionTest {
	
	@Test
	public void testEquivalentPartitionGradeX(){
		int score;
		score = -1;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('X', actual);
	}
	
	@Test
	public void testEquivalentPartitionGradeA(){
		int score;
		score = 95;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('A', actual);
	}
	
	@Test
	public void testEquivalentPartitionGradeB(){
		int score;
		score = 85;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('B', actual);
	}
	
	@Test
	public void testEquivalentPartitionGradeC(){
		int score;
		score = 75;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('C', actual);
	}
	
	@Test
	public void testEquivalentPartitionGradeD(){
		int score;
		score = 65;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('D', actual);
	}
	
	@Test
	public void testEquivalentPartitionGradeF(){
		int score;
		score = 30;
		char actual = LetterGradeClass.letterGrade(score);
		Assert.assertEquals('F', actual);
	}
}
