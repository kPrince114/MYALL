public class Subarray_Product_Less_Than_K {
    public static int countSubarrayinlessthankpro(int arr[],int n, int k){
        int start = 0, end = 0;
        int count = 0;
        Integer sum ;
        if(arr[0]==0){
            sum=1;
            start++;
            count++;
        }
        else{
            sum=arr[0];
        }
        while (start < n && end < n) {
            if (sum < k) {
                end++;
                if (end >= start){
                    count += end - start;
                }
                if(end<n){
                    sum=sum*arr[end];
               }
            }
            else {
                sum =sum/arr[start];
                start++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int array[] = { 0, 11, 2, 3, 2 };
        int k = 10;
        int size = array.length;
        int count1 = countSubarrayinlessthankpro(array, size, k);
        System.out.println(count1);

    }
    
}
