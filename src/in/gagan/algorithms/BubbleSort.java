package in.gagan.algorithms;

import in.gagan.util.Util;

/**
 * Bubble Sort compares 2 adjacent values and swap them if left is min than right.
 * 
 * Complexity: 
 * 		Average - O(n^2)
 * 		Worst 	- O(n^2)
 * 
 * @author Gagan
 *
 */
public class BubbleSort {
	
	private BubbleSort() { }
	
	/**
	 * Bubble sort
	 * 
	 * @param baseArr
	 */
	public static void bubbleSort(int[] inputArr) {
		for(int baseLoop = 0; baseLoop < inputArr.length; baseLoop++) {
			for(int index = 0; index < inputArr.length-1; index++) {
				if(inputArr[index] > inputArr[index+1]) {
					Util.swap(inputArr, index, index + 1);
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
		int sizeOfArray = inputArr.length;
		boolean sorted = true;
		for(int baseLoop = 0; baseLoop < sizeOfArray; baseLoop++) {
			sorted = true;
			for(int index = 0; index < (sizeOfArray-1)-baseLoop; index++) {
				if(inputArr[index] > inputArr[index+1]) {
					Util.swap(inputArr, index, index + 1);
					sorted = false;
				}
			}
			
			if(sorted) {
				break;
			}
		}
	}
}
