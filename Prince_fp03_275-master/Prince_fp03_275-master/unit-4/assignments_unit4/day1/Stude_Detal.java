import java.util.Scanner;
class Stu_set{
    String name;
    int mark;
    int roll_no;
    Stu_set(String p,int n, int m){
        this.name=p;
        this.roll_no=n;
        this.mark=m;
    }
    public void display()
    {
        System.out.println("Student name is: " + this.name + " "
                           + "and Student roll_no is: "
                           + roll_no+" "+" Student mark is "+ mark+" .");
        System.out.println();
    }
}

public class Stude_Detal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howmany=sc.nextInt();
        sc.nextLine();
        Stu_set[] arr;
        arr = new Stu_set[howmany];
        for(int i=0;i<howmany;i++){
            System.out.println("Enter your "+i+" Student Name:= ");
            String nam=sc.nextLine();
            System.out.println("Enter your "+i+" Student mark:= ");
            int mar=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your "+i+" Student Roll_Number:= ");
            int roll=sc.nextInt();
             arr[i] =new Stu_set(nam,roll,mar);
        }
        for(int i=0;i<howmany;i++){
            arr[i].display();
        }
       
    }
}
