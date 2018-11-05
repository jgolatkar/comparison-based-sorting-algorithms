import java.util.Arrays;
import java.util.Random;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InsertionSort ins = new InsertionSort();
		MergeSort mgs = new MergeSort();

		Random random = new Random();
		int[] input1 = random.ints(50000, -50000, 50000).toArray();
		int[] input2 = Arrays.copyOf(input1, input1.length);
		int[] input3 = Arrays.copyOf(input1, input1.length);
		int[] input4 = Arrays.copyOf(input1, input1.length);
		int[] input5 = Arrays.copyOf(input1, input1.length);
		int[] input6 = new int[input5.length];

		Arrays.sort(input5);
		for (int i = input5.length - 1, j = 0; i >= 0 && j < input5.length; i--, j++) {
			input6[j] = input5[i];
		}
		int[] input7 = Arrays.copyOf(input6, input6.length);
		int[] input8 = Arrays.copyOf(input6, input6.length);
		int[] input9 = Arrays.copyOf(input6, input6.length);

		// Insertion Sort Run Time
		long start = System.currentTimeMillis();
		ins.insertionsort(input1, 0, input1.length - 1);
		long end = System.currentTimeMillis();
		System.out.println("Insertion Sort Time: " + (end - start) + " ms");

		// Merge Sort Run Time
		start = System.currentTimeMillis();
		mgs.mergeSort(input2, new int[input2.length], 0, input2.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Merge Sort Time: " + (end - start) + " ms");

		// Quicksort Run Time
		QuickSort qs = new QuickSort();
		start = System.currentTimeMillis();
		qs.quicksort(input3, 0, input3.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Quick Sort Time: " + (end - start) + " ms");

		// Median of Three Quick Sort Run Time
		MedianQuickSort mqs = new MedianQuickSort();
		start = System.currentTimeMillis();
		mqs.quicksort(input4, 0, input4.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Median Quick Sort Time: " + (end - start) + " ms");

	
		//Input as a sorted array.

		System.out.println("\nSorted Order:");
		start = System.currentTimeMillis();
		ins.insertionsort(input5, 0, input5.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Insertion Sort Time: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		mgs.mergeSort(input5, new int[input5.length], 0, input5.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Merge Sort Time: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		qs.quicksort(input5, 0, input5.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Quick Sort Time: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		mqs.quicksort(input5, 0, input5.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Median Quick Sort Time: " + (end - start) + " ms");

		System.out.println("\nReverese Sorted Order:");
		start = System.currentTimeMillis();
		ins.insertionsort(input6, 0, input6.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Insertion Sort Time: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		mgs.mergeSort(input7, new int[input7.length], 0, input7.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Merge Sort Time: " + (end - start) + " ms");

		start = System.currentTimeMillis();
		qs.quicksort(input8, 0, input8.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Quick Sort Time: " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		mqs.quicksort(input9, 0, input9.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Median Quick Sort Time: " + (end - start) + " ms");
		

	}

}
