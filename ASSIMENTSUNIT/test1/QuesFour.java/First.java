import java.io.*;
import java.util.ArrayList;
public class First {
    //ntermediate operators do not execute until a terminal operation is invoked
    public static void main(String args[]) throws InterruptedException, ExecutionException {
            List<String> printname = new ArrayList();
            printname.add("bihar");
            printname.add("sabal pur");
            printname.add("prince");
            printname.add("raj");
            printname.add("jyoti");
            printname.add("priya");
      
            
      
            // Terminal Operation
            printname.forEach(a -> {
               System.out.println(a);
            });
            // Intermediate operation
            printname.sort((p1, p2) -> p1.compareTo(p2));
        }     
}

    

