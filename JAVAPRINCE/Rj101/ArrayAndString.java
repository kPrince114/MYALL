public class ArrayAndString {
    public static void main(String[] args) {
        
        String str="hello";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }

        // if u are add string to another string then it is not possible but if u are add string in char then it is possible;

        str+=' ';
        str+='p';
        str+=10;
        System.out.println(str);// ans=(hello p10);
        // experriment;
        System.out.println("hello"+10+20);  // hello1020
        System.out.println(10+20+"prinrce");// 30hello

        // split function;-
        String bigstr="abc def ghi jkl";
        String[] part=bigstr.split(" ");
        for(int i=0;i<part.length;i++){
            System.out.println(part[i]);
        }


    }
}
