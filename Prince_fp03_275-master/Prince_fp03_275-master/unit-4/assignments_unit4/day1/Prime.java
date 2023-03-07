import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    boolean p=true;
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            p=false;
            break;
        }
    }
    if(p==true){
        System.out.println("Yes"+" it is prime nob");
    }
    else{
        System.out.println("No"+" it is not prime nob");
    }
}

}
