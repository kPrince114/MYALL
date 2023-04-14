import java.util.HashMap;
import java.util.HashSet;

public class ALLDistinctSbbarrayminDistance {
    public static void main(String[] args) {
        
        // String s1="dbaecbbabdcaafbddcabgha";
        String s1="zoomsessionmooz";
        // String s2="abbccd";
        HashSet<Character> set= new HashSet<>();
        int st=-1;
        int mv=-1;
        String ans="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
           set.add(ch);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(mv<s1.length()-1 && map2.size()<set.size()){
                mv++;
               char ch=s1.charAt(mv);
               map2.put(ch, map2.getOrDefault(ch, 0)+1);
                f1=true;
            }
            while(st<mv && map2.size()==set.size()){
                String changesubstring=s1.substring(st+1, mv+1);
                if(ans.length()==0 || changesubstring.length()<ans.length()){
                    ans=changesubstring;
                }
                st++;
                char ch=s1.charAt(st);
                if(map2.get(ch)==1){
                    map2.remove(ch);
                }
                else{
                    map2.put(ch, map2.get(ch)-1);
                }
                f2=true;
            }
            
            if(f1==false && f2==false){
                break;
            }
            
        }
        System.out.println("prince");
        System.out.println(ans);
    }
}
