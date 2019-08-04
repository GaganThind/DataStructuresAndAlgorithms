package in.gagan.problems;

public class NthOrderStatistics {
	
	private NthOrderStatistics() { }

	/**
	 * Find nth element in the provided array
	 * 
	 * @param inputArr
	 * @param index
	 * @return
	 */
	public static int nthOrderStatistics(int[] inputArr, int index) {
		int size = inputArr.length;
		int maxVal = inputArr[0];
		int swap;
		
		for(int baseLoop = 0; baseLoop < size - 1; baseLoop++) {
			for(int innerLoop = baseLoop + 1; innerLoop < size; innerLoop++) {
				if(inputArr[innerLoop] < inputArr[baseLoop]) {
					swap = inputArr[baseLoop];
					inputArr[baseLoop] = inputArr[innerLoop];
					inputArr[innerLoop] = swap;
				}
			}
			
			if(baseLoop == (index - 1)) {
				maxVal = inputArr[baseLoop];
				break;
			}
		}
		
		return maxVal;
	}
}