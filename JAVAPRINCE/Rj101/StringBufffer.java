import java.io.FileReader;
import java.util.HashMap;

import javax.sql.rowset.spi.SyncResolver;

public class StringBufffer {
    public static void main(String[] args) {
        /* 
        StringBuffer s= new StringBuffer("pr");
        // s.append(null)
        s.insert(s.length(), 'p');
        s.insert(0, 'w');
        System.out.println(s);
        
        String p="345";
        for(int i=0;i<p.length();i++){
            System.out.println(p.charAt(i)-'0');
        }
        // char c='1';
        // System.out.println(c-'0');
        // FileReader sc = new FileReader();
        int min=Integer.MIN_VALUE;
        System.out.println();
        // min=Math.min(min, min)

        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        */

        /*
         Masai Palindromic Substring
         function masaiPalSubString(S){
    var max = -199999;
    for (var i=0;i<S.length;i++) {
        for (var j=i;j<S.length;j++) {
            var b = "";
            for (var k=i; k<=j;k++) {
                b=b+S[k];
            }
            var c=0;
            for (var p=0; p < b.length; p++) {
                if (b[p] !=b[b.length-1-p]) {
                    c++;
                    break;
                }
            }
            if (c==0) {
                var l = b.length;
                if (l > max) {
                max = l;
                }
            }
        }
    }
    console.log(max);
}

         */

         String s2="abbccd";
         HashMap<Character,Integer> map1= new HashMap<>();
         for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        System.out.println(map1.getOrDefault('a', 0));
    }
}
