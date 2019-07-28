package in.gagan.algorithms;

/**
 * Bubble Sort with O(n^2) complexity.
 * Compares 2 adjacent values and swap them if left is min than right
 * 
 * @author lonedakoo
 *
 */
public class BubbleSort {
	
	/**
	 * Bubble sort
	 * 
	 * @param baseArr
	 */
	public static void bubbleSort(int[] inputArr) {
		int swap;
		for(int baseLoop = 0; baseLoop < inputArr.length; baseLoop++) {
			for(int index = 0; index < inputArr.length-1; index++) {
				if(inputArr[index] > inputArr[index+1]) {
					swap = inputArr[index];
					inputArr[index] = inputArr[index+1];
					inputArr[index+1] = swap;
				}
			}
		}
	}
	
	/**
	 * Optimized bubble sort. This sorting removes the last sorted element as it's already at its correct place.
	 * 
	 * @param baseArr
	 */
	public static void optimizedBubbleSort(int[] inputArr) {
		int swap;
		int sizeOfArray = inputArr.length;
		boolean sorted = true;
		for(int baseLoop = 0; baseLoop < sizeOfArray; baseLoop++) {
			sorted = true;
			for(int index = 0; index < (sizeOfArray-1)-baseLoop; index++) {
				if(inputArr[index] > inputArr[index+1]) {
					swap = inputArr[index];
					inputArr[index] = inputArr[index+1];
					inputArr[index+1] = swap;
					sorted = false;
				}
			}
			
			if(sorted) {
				break;
			}
		}
	}
}
