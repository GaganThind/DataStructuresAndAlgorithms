package in.gagan.algorithm.sort;

/**
 * Similar to arranging cards in a deck. Start with second element and then traverse to the left and swap the min value.
 * 
 * Complexity: 
 * 		Average - O(n^2)
 * 		Worst 	- O(n^2)
 * 
 * @author Gagan
 *
 */
public class InsertionSort {
	
	private InsertionSort() { }
	
	/**
	 * Similar to arranging cards in a deck. Start with second element and then traverse to the left and swap the min value
	 * 
	 * @param inputArr
	 */
	public static void insertionSort(int[] inputArr) {
		int size = inputArr.length;
		int swap; 
		int j;
		for(int baseLoop = 1; baseLoop < size; baseLoop++) {
			swap = inputArr[baseLoop];
			j = baseLoop;
			
			while(j > 0 && inputArr[j-1] > swap) {
				inputArr[j] = inputArr[j-1];
				j = j - 1;
			}
			inputArr[j] = swap;
		}
	}
}
