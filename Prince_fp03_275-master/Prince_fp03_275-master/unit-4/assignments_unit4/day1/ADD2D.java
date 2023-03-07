import java.util.Scanner;

public class ADD2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<3;j++){
            int sum=0;
            for(int i=0;i<3;i++){
                if(arr[i][j]%2==0){
                    sum=sum+arr[i][j];
                }
            }
            System.out.println(sum);
        }

    }
    
}
