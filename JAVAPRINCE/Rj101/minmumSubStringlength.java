import java.util.HashMap;

public class minmumSubStringlength {
    public static void main(String[] args) {
        String s1="dbaecbbabdcaafbddcabgha";
        String s2="abbccd";
        HashMap<Character,Integer> map1= new HashMap<>();
        int mc=0;
        int los2=s2.length();
        int st=-1;
        int mv=-1;
        String ans="";
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(mv<s1.length()-1 && mc<los2){
                mv++;
               char ch=s1.charAt(mv);
               map2.put(ch, map2.getOrDefault(ch, 0)+1);
                if(map2.getOrDefault(ch, 0)<=map1.getOrDefault(ch, 0)){
                    mc++;
                    // System.out.println(ch);
                }
                f1=true;
            }
            while(st<mv && mc==los2){
                String changesubstring=s1.substring(st+1, mv+1);
                if(ans.length()==0 || changesubstring.length()<ans.length()){
                    ans=changesubstring;
                    // System.out.println(ans);
                }
                st++;
                char ch=s1.charAt(st);
                if(map2.get(ch)==1){
                    map2.remove(ch);
                }
                else{
                    map2.put(ch, map2.get(ch)-1);
                }

                if(map2.getOrDefault(ch, 0)<map1.getOrDefault(ch,0)){
                    mc--;
                }
                f2=true;
            }
            
            if(f1==false && f2==false){
                break;
            }
            
        }
        System.out.println("prince");
        System.out.println(ans);

        
        /* 
        HashMap<String, Integer> map
            = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        System.out.println("HashMap: " + map.toString());
        int k = map.getOrDefault("f", 500);
        if(map.getOrDefault("b", 0)>map.getOrDefault("a", 0)){
            System.out.println("prince");
        }
        System.out.println(map.getOrDefault('b', 0));
        // System.out.println("Returned Value: " + k);
       
        String s="prince";

        System.out.println(s.substring(0, 2));
        */


    }
}
