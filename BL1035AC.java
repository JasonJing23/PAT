package cn.jasonjing.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

public class BL1035AC {
	static int[] midArr;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
		int[] arr = new int[N];
		midArr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			midArr[i] = in.nextInt();
		}
		if (InsertionSort(arr, N) == 1) {
		} else {
			System.out.println("Merge Sort");
			MergeSort(arr, N);
		}
	}
	
	
	static void showNext(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[arr.length - 1]);
	}
	static int InsertionSort(int arr[], int N) {
		int[] temp = new int[N];
		temp = Arrays.copyOf(arr, N);
		int i = 1;
		while (Arrays.equals(temp, midArr) == false && i < N) {
			int t = temp[i];
			int j = i;
			while (j > 0 && t < temp[j - 1]) {
				temp[j] = temp[j - 1];
				j--;
			}
			temp[j] = t;
			i++;
		}
		if (i != N) {
			boolean tag = true;
			while (tag) {
				int j = i;
				int t = temp[i];
				while (j > 0 && t < temp[j - 1]) {
					temp[j] = temp[j - 1];
					j--;
				}
				temp[j] = t;
				if (j != i)
					tag = false;
				i++;
			}
			System.out.println("Insertion Sort");
			showNext(temp);
			return 1;
		}
		return 0;
	}

	static void Merge(int A[], int tempA[], int left, int mid, int right) {
		int length = right - left + 1;
		int i = left;
		int j = mid;
		int k = left;
		while (i < mid && j <= right) {
			if (A[i] < A[j])
				tempA[k++] = A[i++];
			else
				tempA[k++] = A[j++];
		}
		while (i < mid)
			tempA[k++] = A[i++];
		while (j <= right)
			tempA[k++] = A[j++];
	}
	static void realMerge(int[] A, int[] tempA, int length, int N) {
		int i;
		for (i = 0; i <= N - 2 * length; i += 2 * length) {
			Merge(A, tempA, i, i + length, i + 2 * length - 1);
		}
		if (i + length < N) {
			Merge(A, tempA, i, i + length, N - 1);
		} else
			for (int j = i; j < N; j++)
				tempA[j] = A[j];

	}
	static int MergeSort(int arr[], int N) {
		int[] A = new int[N];
		boolean tag = false;
		A = Arrays.copyOf(arr, N);
		int[] tempA = new int[N];
		int length = 1;
		while (length < N) {
			realMerge(A, tempA, length, N);
			if (tag == true) {
				showNext(tempA);
				break;
			}
			if (Arrays.equals(tempA, midArr) == true)
				tag = true;
			length *= 2;
			realMerge(tempA, A, length, N);
			if (tag == true) {
				showNext(A);
				break;
			}
			if (Arrays.equals(A, midArr) == true)
				tag = true;
			length *= 2;
		}
		return 0;
	}
	
}