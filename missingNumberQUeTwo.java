public class missingNumberQUeTwo {
   
    public static void main(String[] args) {
        int  array[]= {1, 2, 3, 5};
        int ans = findMissingNumber(array);
        System.out.println(ans);
        // time complexity will be o(N);
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
