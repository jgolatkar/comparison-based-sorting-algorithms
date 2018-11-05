
public class InsertionSort {

	public void insertionsort(int[] arr, int low, int right) {

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
