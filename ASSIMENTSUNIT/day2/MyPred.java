package day1_ass1.day2.Firstqu;
import java.util.function.Predicate;
public class MyPred implements predicated<Integer>{
    // in interger use (***)
//    @Override
    public boolean test(Integer t) {
        return t>=0;
     }
}
