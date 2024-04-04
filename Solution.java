public class Solution {
   
    public static void main(String[] args) {
        int  array[]= {4, 2, 3, 5};
        int ans = findMissingNumber(array);
        System.out.println(ans);
        
     }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }
}
