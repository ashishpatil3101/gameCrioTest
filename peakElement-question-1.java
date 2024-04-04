class Solution {
    
    
    public static int peakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1])
                left = mid + 1;//  upword slope
            else
                right = mid;//  mid==mid+1 possible
        }
        return left;// move upword
    }

    public static void main(String[] args) {
       int  array[]= {5, 10, 20, 15};
       int idx = peakElement(array);
       System.out.println(array[idx]);
    }
}