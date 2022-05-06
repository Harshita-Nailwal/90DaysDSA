//Kadane's Alogorithm!!

class MaxSubArrayKadane {
  static int MaxSubarraySum(int a[]){
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int i=0; i<a.length;i++){
      currentSum += a[i];
      if(currentSum < a[i]){
        currentSum = a[i];
      }
      if(currentSum > maxSum){
        maxSum = currentSum;
      } 
    }
    return maxSum;
  }
  public static void main(String[] args) {
    int a[] = {1,2,3,-6,6};
    System.out.println(MaxSubarraySum(a));
  }
}
