package in.gagan.algorithms;

import in.gagan.util.Util;

/**
 * Take first element of array, check if that element is least by comparing it with all the rest values.
 * Then take the second element check it with the rest of the array elements.
 * One iteration will result in the element being in correct position.
 * 
 * Complexity: 
 * 		Average - O(n^2)
 * 		Worst 	- O(n^2)
 * 
 * @author Gagan
 *
 */
public class SelectionSort {
	
	private SelectionSort() { }
	
	/**
	 * Take first element of array, check if that element is least by comparing it with all the rest values.
	 * Then take the second element check it with the rest of the array elements.
	 * One iteration will result in the element being in correct position
	 * 
	 * @param inputArr
	 */
	public static void selectionSort(int[] inputArr) {
		int sizeOfArray = inputArr.length;
		int min;
		for(int baseLoop = 0; baseLoop < sizeOfArray; baseLoop++) {
			min = baseLoop;
			for(int index = baseLoop+1; index < sizeOfArray; index++) {
				if(inputArr[index] < inputArr[min]) {
					min = index;
				}
			}
			Util.swap(inputArr, baseLoop, min);
		}
	}
}
