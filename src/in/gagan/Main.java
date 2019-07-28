package in.gagan;

import java.util.Arrays;

import in.gagan.algorithms.BubbleSort;
import in.gagan.algorithms.SelectionSort;
import in.gagan.util.Util;

public class Main {
	
	static int[] baseArr;
	
	static{
		baseArr = Util.generateArray(10000);
	}

	public static void main(String[] args) {
		
		int[] bubbleSortArr = Arrays.copyOf(baseArr, baseArr.length);
		int[] OptBubbleSortArr = Arrays.copyOf(baseArr, baseArr.length);
		int[] selectionSortArr = Arrays.copyOf(baseArr, baseArr.length);
		long startTime, endTime;
		
		//Bubble Sort
		startTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(bubbleSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Bubble Sort Time: "+ (endTime - startTime) +" ms \n");
		Util.printArray(bubbleSortArr);
		
		Util.threadSleep(2000);
				
		startTime = System.currentTimeMillis();
		BubbleSort.optimizedBubbleSort(OptBubbleSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Optimized Bubble Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(OptBubbleSortArr);
		
		Util.threadSleep(2000);
		
		//Selection Sort
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(selectionSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Selection Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(selectionSortArr);
		
	}
	
}
