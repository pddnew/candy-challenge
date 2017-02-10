package br.com.dsasoft.challenge;

public class SolutionTest {
	private Solution solution;
	int[] ratings = { 9, 6, 8, 6 };
	int expected = 7;

	public SolutionTest() {
		solution = new SolutionImpl();
	}

	public void testMinimumCandies() {
		if(solution.candy(ratings) == expected)
			System.out.println(expected);
		else
			throw new RuntimeException("Wrong amount");
	}
}
