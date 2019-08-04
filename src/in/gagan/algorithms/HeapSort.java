package in.gagan.algorithms;

import in.gagan.util.Util;

/**
 * This is based on heap implementation of binary tree. The child node are smaller than the parent node.
 * 
 * Complexity: 
 * 		Average - O(n log(n))
 * 		Worst 	- O(n log(n))
 * 
 * @author Gagan
 *
 */
public class HeapSort {
	
	private HeapSort() { }
	
	/**
	 * This is based on heap implementation of binary tree. The child node are smaller than the parent node.
	 * Complexity is O(n log(n))
	 * 
	 * @param inputArr
	 */
	public static void heapSort(int[] inputArr) {
		int size = inputArr.length; 
		  
        // Build heap (rearrange array) 
        for (int i = size / 2 - 1; i >= 0; i--) {
        	heapify(inputArr, size, i); 
        }
  
        // One by one extract an element from heap 
        for (int i = size - 1; i >= 0; i--) { 
            // Move current root to end 
            int temp = inputArr[0]; 
            inputArr[0] = inputArr[i]; 
            inputArr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(inputArr, i, 0); 
        } 
	}
	
	/**
	 * Check if either of the children are bigger than the parent then swap them
	 * 
	 * @param inputArr
	 * @param size
	 * @param node
	 */
	private static void heapify(int[] inputArr, int size, int node) {
		int largest = node;
		int left = 2 * node + 1;
		int right = 2 * node + 2;
		
		if(left < size && inputArr[left] > inputArr[largest]) {
			largest = left;
		}
		
		if(right < size && inputArr[right] > inputArr[largest]) {
			largest = right;
		}
		
		if(largest != node) {
			Util.swap(inputArr, node, largest);
			
			// Recursively heapify the affected sub-tree 
            heapify(inputArr, size, largest); 
		}
	}
}
