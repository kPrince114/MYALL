package Pattern;

import java.io.IOException;

class pattren {
    public static void main(String[] args) throws IOException {
        /* 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("**************************************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("**************************************");
        int sum1=2;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(sum1+" ");
                sum1=sum1+2;
            }
            System.out.println();
        }

        System.out.println("**********************************");
        for (int i = 0; i < 5; i++) {
            int sum2=1;
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print(sum2 + " ");
                    sum2++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("*************************");
        for (int i = 0; i < 5; i++) {
            int sum2=11;
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print(sum2 + " ");
                    sum2=sum2+10;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }     
        System.out.println("-------------------------------"); 
        int n2=5;
        for(int i=1;i<=n2;i++){
            for(int j=1;j<=n2*2+1;j++){
                if(n2+1-i>=j ){
                    System.out.print("*");
                }
                else if(j<=n2*2+1 && j>=n2+1+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        int n3=5;
        for(int i=1;i<=n3;i++){
            for(int j=1;j<=n3;j++){
                if(i==1 || i==n3 && j<=n3 ){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n3){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        int n5=5         ;
        for(int i=1;i<=n5;i++){
            for(int j=1;j<=n5*2;j++){
                if(i%2!=0){
                    if(j<=n5 && j>=n5-i+1 && j%2!=0 ){
                        System.out.print("*");
                    }
                    else if(j>n5 && j<n5+i && j%2!=0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j<=n5 && j>=n5-i+1 && j%2==0 ){
                        System.out.print("*");
                    }
                    else if(j>n5 && j<n5+i && j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        */
        int n6=5;
        for(int i=1;i<=n6;i++){
            int c1=0;
            for(int j=1;j<=n6*2-1;j++){
                if(i==1 || i==n6){
                    if(i==1){
                        if(j==n6){
                            System.out.print(i);
                        }else{
                            System.out.print(" ");
                        }
                    }
                    if(i==n6){
                        System.out.print(j);
                    }
                }
                else{
                    if(j==n6+1-i || j==n6+i-1){
                        c1++;
                        System.out.print(c1);
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }

    }

}