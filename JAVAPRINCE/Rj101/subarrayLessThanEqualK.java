import java.util.HashMap;
import java.util.Map;

public class subarrayLessThanEqualK {
    public static int countSubarrayinlessthankadd(int arr[],int n, int k){
        int start = 0, end = 0;
        int count = 0, sum = arr[0];
        while (start < n && end < n) {
            if (sum < k) {
                end++;
                sum=sum+arr[end];
                if (end >= start){
                    count += end - start;
                }
               
            }
            else {
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        /* 
        int[] arr={3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
        int sum=0;
        int k=5;
        int c=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(map.containsKey(sum-k)){
               c=c+map.get(sum-k);
            //    System.out.println(c);
            //    System.out.println(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
           // System.out.println(sum);
        }
        // for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
        // System.out.println("Key = " + entry.getKey() +
        //                  ", Value = " + entry.getValue());
        System.out.println(c);
        */
        int array[] = { 0, 11, 2, 3, 2 };
        int k = 10;
        int size = array.length;
        int count = countSubarrayinlessthankadd(array, size, k);
        System.out.println(count);


    }
}
