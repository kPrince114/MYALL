import java.util.*;

// import javax.xml.transform.SourceLocator;
public class stack {
    public static void main(String[] args) {
        /* 
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.push(30);
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.push(30);
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.push(40);
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.push(50);
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.pop();
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.pop();
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
        st.pop();
        System.out.println(st + "-> " + st.peek()+" "+ st.size());
         */
        /* 
        //1.***** Dublict Bracket;***********
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while (st.peek()!='(') {
                        st.pop();
                    }
                    st.pop();
                }

            }
            else{
                st.push(ch);

            }
        }
        System.out.println(false);
        */
        /* Ballanced Brackets;
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                st.push(ch);
            }
            else if(ch==']'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='['){
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==')'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='('){
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='{'){
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
            
            
        }
        if(st.size()==0)
        System.out.println(true);
        else{
            System.out.println(false);
        }
        */
        /* 
        //next greater element 
        Scanner scn= new Scanner(System.in);
        //Integer sc=scn.nextInt();
        int n=scn.nextInt();
        int[] arr = new int[n]; 
        int[] ans = new int[n]; 
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();  
        }
        ans[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while (st.size()>0&& arr[i]>=st.peek()) {
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);

        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        */
        // Span Problem in java
        int n;
        Scanner scn= new Scanner(System.in);
        n=scn.nextInt();  
        int[] array = new int[n]; 
        int[] ans = new int[n];  
        Stack<Integer> st = new Stack<>();
        ans[0]=1;
        st.push(0);
        for(int i=0;i<n;i++){
            array[i]=scn.nextInt();
        };
        for(int i=1;i<n;i++){
            while(st.size()>0 && array[i]>array[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        };
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        };
    }
}
