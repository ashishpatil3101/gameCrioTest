import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questionFive {
    
    static List<List<Integer>> ans;
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 2, 1, 5, 3, 6, 7, 8, 2};
        int target =10;
        ans= new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        Arrays.sort(nums);

        make_list(0, nums, target, 0, t);

       System.out.println(ans);
    }
    static void make_list(int idx, int[] arr, int target, int sum , List<Integer> t){
      
        if(sum==target)ans.add(new ArrayList<>(t));

        for(int i=idx;i<arr.length;i++){
 
            if(i>idx && arr[i]==arr[i-1])continue;
 
            if(sum + arr[i] > target)break;//bcz we r sorted the array
            sum +=arr[i];
            t.add(arr[i]);
 
            make_list(i,arr,target,sum,t);
            t.remove(t.size()-1);
            sum -=arr[i];
            
        }
    }
}

