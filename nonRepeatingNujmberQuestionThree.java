
//User function Template for Java
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class nonRepeatingNujmberQuestionThree{
    
    public static int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> fr=new  HashMap<Integer,Integer>();
        int ans=0;
        for(int a:arr){
            if(fr.containsKey(a)){
                fr.put(a,fr.get(a)+1);
            }else{
                fr.put(a,1);
            }
        }
        for(int a:arr){
            if (fr.get(a)==1){
                ans=a;
                break;
            }
        }
        return ans;
    }  

    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        System.out.println(firstNonRepeating(arr, arr.length));

    }
    
}