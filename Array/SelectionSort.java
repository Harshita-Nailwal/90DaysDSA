import java.util.*;

public class SelectionSort{
	public static void main(String[] args) {
		int[] arr = {4,1,3,2,4,1};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
	public static int[] selectionSort(int[] arr){
		for(int i =0; i<arr.length; i++){
			//find the max item in remaining array and swap with corret index.
			int last = arr.length -i -1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
		return arr;
	}
	static int getMaxIndex(int[] arr, int start, int end){
		int max = start;
		for(int i=start;i<=end;i++){
			if(arr[max] < arr[i]){
				max = i;
			}
		}
		return max;
	}

	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}