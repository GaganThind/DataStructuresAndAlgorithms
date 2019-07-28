package in.gagan.problems;

import java.util.Arrays;

public class MissingNumberFromArray {
	
	static final int[] baseArr = {4, 7, 2, 8, 12, 16};

	public static void main(String[] args) {
		int[] inputArr = {4, 2, 8, 12, 16};
		System.out.println(findMissingValue(inputArr));
	}
	
	public static int findMissingValue(int[] inputArr) {
		Arrays.sort(baseArr);
		Arrays.sort(inputArr);
		for(int i=0; i <= baseArr.length; i++) {
			if(baseArr[i] != inputArr[i]) {
				return baseArr[i];
			}
		}
		return 0;
	}

}
