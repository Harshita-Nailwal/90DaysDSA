import java.util.*;

public class InsertionSort{
	public static void main(String[] args) {
		int[] arr= {2, 32, 1, 33, 12, 11};
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	public static int[] insertionSort(int[] arr){
		for(int i=0;i<arr.length - 1; i++){
			for(int j = i+1; j>0;j--){
				if(arr[j] < arr[j-1]){
					swap(arr, j , j-1);
				}else{
					break;
				}
			}
		}
		return arr;
	}
	static void swap(int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}