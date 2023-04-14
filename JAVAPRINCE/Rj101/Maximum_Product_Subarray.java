public class Maximum_Product_Subarray {
    static int Maximum_Product_Subarrayis(int[] arr,int n){
        int i=0;
        Integer ans=Integer.MIN_VALUE;
        Integer pro=1;
        while(i<n){
            pro=pro*arr[i];
            if(ans<pro){
                ans=pro;
            }
            if(arr[i]==0 || arr[i]<0){
                if(ans<pro){
                    ans=pro;
                }
                pro=1;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int array[] = { 1,0,8,4,-1,50,3};
        int size = array.length;
        int count1 = Maximum_Product_Subarrayis(array, size);
        System.out.println(count1);

    }
}
