package br.com.dsasoft.challenge;

public class SolutionImpl implements Solution {

	private void bubbleSortIntArray(int[] intArray) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < intArray.length - j; i++) {
				if (intArray[i] > intArray[i + 1]) {
					tmp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = tmp;
					swapped = true;
				}
			}
		}
	}

	public int candy(int[] ratings) {
		int sum = 0;
		int candy = 0;
		int lastGrade = 0;
		bubbleSortIntArray(ratings);
		for (int i = 0; i < ratings.length; i++) {
			if (ratings[i] > lastGrade)
				candy++;
			lastGrade = ratings[i];
			sum = sum + candy;
		}

		return sum;
	}

}
