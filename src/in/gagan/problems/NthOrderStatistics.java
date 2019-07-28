package in.gagan.problems;
import java.util.Arrays;

public class NthOrderStatistics {

	final static int[] baseArr = { 3, 5, 7, 8, 10, 4, 6, 2 };

	public static void main(String[] args) {
		System.out.println(smallestNumberSorting(7));
	}

	public static int smallestNumberSorting(int index) {
		Arrays.sort(baseArr);
		return baseArr[index - 1];
	}
}