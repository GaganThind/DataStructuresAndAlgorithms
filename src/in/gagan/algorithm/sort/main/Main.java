package in.gagan.algorithm.sort.main;

import in.gagan.algorithm.sort.*;

import java.util.Arrays;

public class Main {
	
	static int[] baseArr;
	
	static{
		baseArr = Util.generateArray(50000);
	}

	public static void main(String[] args) {
		sorting();
	}
	
	public static void sorting() {
		long startTime;
		long endTime;
		
		System.out.println("Sorting Start");
		
		//Bubble Sort
		int[] bubbleSortArr = Arrays.copyOf(baseArr, baseArr.length);
		startTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(bubbleSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Bubble Sort Time: "+ (endTime - startTime) +" ms \n");
		Util.printArray(bubbleSortArr);
		
		Util.threadDefaultTimeSleep();
			
		//Optimized Bubble Sort
		int[] optBubbleSortArr = Arrays.copyOf(baseArr, baseArr.length);
		startTime = System.currentTimeMillis();
		BubbleSort.optimizedBubbleSort(optBubbleSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Optimized Bubble Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(optBubbleSortArr);
		
		Util.threadDefaultTimeSleep();
		
		//Selection Sort
		int[] selectionSortArr = Arrays.copyOf(baseArr, baseArr.length);
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(selectionSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Selection Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(selectionSortArr);
		
		Util.threadDefaultTimeSleep();
		
		//Insertion Sort
		int[] insertionSortArr = Arrays.copyOf(baseArr, baseArr.length);
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(insertionSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Insertion Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(insertionSortArr);
		
		Util.threadDefaultTimeSleep();
		
		//Quick Sort
		int[] quickSortArr = Arrays.copyOf(baseArr, baseArr.length);
		startTime = System.currentTimeMillis();
		QuickSort.quickSort(quickSortArr);
		endTime = System.currentTimeMillis();
		System.out.print("Quick Sort Time: "+ (endTime - startTime) + " ms \n");
		Util.printArray(quickSortArr);
		
		Util.threadDefaultTimeSleep();
		
		//Heap Sort
		int[] heapSortArr = Arrays.copyOf(baseArr, baseArr.length); startTime =
		System.currentTimeMillis();
		HeapSort.heapSort(heapSortArr);
		endTime = System.currentTimeMillis(); 
		System.out.print("Heap Sort Time: "+ (endTime - startTime) + " ms \n"); 
		Util.printArray(heapSortArr);
		
		Util.threadDefaultTimeSleep();
		
		//Array.Sort[Dual Pivot QuickSort]
		int[] baseJavaArr = Arrays.copyOf(baseArr, baseArr.length); 
		startTime = System.currentTimeMillis();
		Arrays.sort(baseJavaArr);
		endTime = System.currentTimeMillis(); System.out.print("Array Sort Time: "+ (endTime - startTime) + " ms \n"); 
		Util.printArray(baseJavaArr);
		 
		System.out.println("Sorting END");
	
	}
	
}
