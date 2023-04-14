import java.util.ArrayList;
import java.util.Scanner;

public class removeprimeinArraylist {
    public static boolean checkprime(int n){
        for(int i=2;i<=Math.floor(Math.sqrt(n));i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> arrayListPrimeremove(ArrayList<Integer> l){
        System.out.println(l);
        for(int i=l.size()-1;i>=0;i--){
            if(checkprime(l.get(i))){
                l.remove(i);
            }
        }
        System.out.println(l);
        return l;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> l= new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println(arrayListPrimeremove(l));
       

    }
}