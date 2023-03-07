import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Collector;
// // import javax.xml.stream.StreamFilter;
// // import java.util.stream.Stream;
public class Stream {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,4,5,6,20);
        List<Integer> lodd=new ArrayList<>();
        // without stream;
        for(Integer i:list){
            if(i%2!=0){
                lodd.add(i);
            }
        }
        // //usning stream ;--
        // Stream<Integer> stream=list.stream();
        // // stream.filter
        // List<Integer> newList=list.stream().filter(i->i%2!=0).collect(Collectors.toList());

        
        
    }
}
