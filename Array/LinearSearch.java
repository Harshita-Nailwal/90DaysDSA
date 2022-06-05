public class LinearSearch{
	public static void main(String[] args) {
		int[] nums = {23,32,14,64,11,0,78,22};
		int target = 23;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
	}

	// linear search 
	static int linearSearch(int[] arr, int target){
		if(arr.length == 0){
			return -1;
		}

		for(int element : arr){
			if(element == target){
				return i;
			}
		}

		//this will execute if none of the return statements executes
		return -1;
	}
}