import java.util.*;

public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	public static int[] bubbleSort(int[] arr){
		boolean swap=true;
		for(int i=0;i<arr.length;i++){
			for(int j =1; j < arr.length - i; j++){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap = true;
				}
			}
			if(!swap){
				break;
			}
		}
		return arr;
	}
}