import java.util.ArrayList;
import java.util.Collections;

class Cities {
    public static void main(String[] args) {

        ArrayList<String> city=new ArrayList<String>();
        city.add("patna");
        city.add("Delhi");
        city.add("jaipur");
        city.add("Kolkata");

        Collections.sort(city,(c1,c2)->c1.compareTo(c2));
        System.out.println(city);

        PrintList pl = (c)-> {
            System.out.println(c);
        };
        System.out.println(1);

    }
}
