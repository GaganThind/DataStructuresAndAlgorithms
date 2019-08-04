package in.gagan.algorithms;

import in.gagan.util.Util;

/**
 * Take a pivot value in our implementation is middle element and then sort the elements such that left values are less 
 * and right values are greater.
 * 
 * Complexity: 
 * 		Average - O(n log(n))
 * 		Worst 	- O(n^2)
 * 
 * @author Gagan
 *
 */
public class QuickSort {
	
	private QuickSort() { }
	
	/**
	 * Take a pivot value in our implementation is middle element and then sort the elements such that left values are less 
	 * and right values are greater.
	 * 
	 * @param inputArr
	 */
	public static void quickSort(int[] inputArr) {
		quickSort(inputArr, 0, inputArr.length - 1);
	}
	
	/**
	 * Take a pivot value in our implementation is middle element and then sort the elements such that left values are less 
	 * and right values are greater.
	 * 
	 * @param inputArr
	 * @param left
	 * @param right
	 */
	private static void quickSort(int[] inputArr, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = inputArr[(left + right) / 2];
		int index = partitionArray(inputArr, left, right, pivot);
		quickSort(inputArr, left, index - 1);
		quickSort(inputArr, index, right);
	}
	
	/**
	 * Check if the left value is less than pivot and right value is greater than pivot
	 * Swap them if not
	 * 
	 * @param inputArr
	 * @param left
	 * @param right
	 * @param pivot
	 * @return
	 */
	private static int partitionArray(int[] inputArr, int left, int right, int pivot) {
		while(left <= right) {
			while(inputArr[left] < pivot) {
				left++;
			}
			
			while(inputArr[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				Util.swap(inputArr, right, left);
				left++;
				right--;
			}
		}
		return left;
	}

}
