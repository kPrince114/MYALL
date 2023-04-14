import java.util.ArrayDeque;
import java.util.Deque;

// import collaction.Stack;

public class rotatedArray {
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4};
        int k=2;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            deque.addLast(arr[i]);
        }
        for(int i=0;i<k;i++){
            int p=deque.pollLast();
            deque.addFirst(p);
        }
        for(Integer s:deque){
            System.out.print(s+" ");
        }
        

    }
}
