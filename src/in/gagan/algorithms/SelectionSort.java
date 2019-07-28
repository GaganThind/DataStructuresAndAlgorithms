package in.gagan.algorithms;

/**
 * Take first element of array, check if that element is least by comparing it with all the rest values.
 * Then take the second element check it with the rest of the array elements.
 * One iteration will result in the element being in correct position
 * 
 * @author lonedakoo
 *
 */
public class SelectionSort {
	
	/**
	 * Take first element of array, check if that element is least by comparing it with all the rest values.
	 * Then take the second element check it with the rest of the array elements.
	 * One iteration will result in the element being in correct position
	 * 
	 * @param inputArr
	 */
	public static void selectionSort(int[] inputArr) {
		int sizeOfArray = inputArr.length;
		int min, swap;
		for(int baseLoop = 0; baseLoop < sizeOfArray; baseLoop++) {
			min = baseLoop;
			for(int index = baseLoop+1; index < sizeOfArray; index++) {
				if(inputArr[index] < inputArr[min]) {
					min = index;
				}
			}
			swap = inputArr[baseLoop];
			inputArr[baseLoop] = inputArr[min];
			inputArr[min] = swap;
		}
	}
}
