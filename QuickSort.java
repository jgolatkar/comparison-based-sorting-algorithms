import java.util.Random;

public class QuickSort {
	public void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			int p_index = partition(arr, start, end);
			quicksort(arr, start, p_index - 1);
			quicksort(arr, p_index + 1, end);
		}
	}

	/**
	 * Randomized partition function
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public int partition(int[] arr, int start, int end) {
		int x = new Random().nextInt(end - start + 1) + start;
		swap(arr, x, end);
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, j, i);
			}
		}
		swap(arr, i + 1, end);
		return i + 1;
	}

	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
