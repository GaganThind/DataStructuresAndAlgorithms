package in.gagan.algorithm.sort;

public class MergeSort {
	
	private MergeSort() { }
	
	public static void mergeSort(int[] inputArr, int left, int right) {
		if (left > right) {
			return;
		}

		int mid = left + (right - left)/2;

		mergeSort(inputArr, left, mid);
		mergeSort(inputArr, mid + 1, right);

		merge(inputArr, left, mid, right);
	}

	private static void merge(int[] arr, int left, int mid, int right) {

	}
}
