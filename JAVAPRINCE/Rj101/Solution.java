class Solution {
    public static int compress(char[] chars) {
       String ch=chars[0]+"";
       int c=1;
        char p;
        char b;
        for(int i=1;i<chars.length;i++){
          p=chars[i-1];
          b=chars[i];
            if(p==b){
              c++;
            }
            else{
                ch=ch+c;
                c=1;
                ch=ch+b+"";
            }
            
        }
        if(c>1){
            ch=ch+c;
        }
        String[] result=ch.split("");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        return result.length;
    }
    public static void main(String[] args) {
       char[] st={'a','a','b','b','c','c','c'};
        int p=compress(st);
        System.out.println(p);
    }

}
