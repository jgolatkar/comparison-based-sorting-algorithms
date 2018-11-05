public class MedianQuickSort {

	public void quicksort(int[] a, int left, int right) {
		if (left + 10 <= right) {
			int pivot = medianOfThreePivot(a, left, right);
			int i = left, j = right - 1;
			for (;;) {
				while (a[++i] < pivot)
					;
				while (pivot < a[--j])
					;
				if (i < j) {
					swap(a, i, j);
				} else {
					break;
				}

			}
			swap(a, i, right - 1);
			quicksort(a, left, i - 1);
			quicksort(a, i + 1, right);
		} else {
			insertionsort(a, left, right);
		}

	}

	private int medianOfThreePivot(int[] a, int left, int right) {
		int middle = (left + right) / 2;
		if (a[left] > a[middle]) {
			swap(a, left, middle);
		}
		if (a[left] > a[right]) {
			swap(a, left, right);
		}
		if (a[right] < a[middle]) {
			swap(a, right, middle);
		}
		swap(a, middle, right - 1);
		return a[right - 1];
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void insertionsort(int[] arr, int low, int right) {

		for (int i = low + 1; i <= right; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
