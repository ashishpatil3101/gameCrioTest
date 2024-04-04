class peakElementQuestionOne {
    
    
    public static int peakElement(int[] nums) {
        
        if (nums.length < 3) // bcz there should be at least three elements
            return -1;    
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
       int  array[]= {10, 20};
       int idx = peakElement(array);
        // if peak element is present it will print peak element value  
       // if peak element is not present it will print -1;   
       System.out.println( idx > -1 ? array[idx] : -1);
       //time complexity will be O(logn) as i am using binary search 
       // linear sesarch can also be used to find element but time complexity will O(n)
    }
}