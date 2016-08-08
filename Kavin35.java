public static int fixedPoint(int[] array, int start, int end) {
		if (end < start || start < 0 || end >= array.length) {
			return -1;
		}
		int midIndex = start +(end-start)/ 2;
		int midValue = array[midIndex];
		if (midValue == midIndex) {
			return midIndex;
		}
		/* Search left */
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = fixedPoint(array, start, leftIndex);
		if (left >= 0) {
			return left;
		}
		
		/* Search right */
		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = fixedPoint(array, rightIndex, end);
		
		return right;
	}
	
	public static int fixedPoint(int[] array) {
		return fixedPoint(array, 0, array.length - 1);
	}
