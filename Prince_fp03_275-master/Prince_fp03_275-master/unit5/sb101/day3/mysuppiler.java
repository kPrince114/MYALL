import java.util.function.Supplier;

public class mysuppiler implements Supplier<String> {
    // only return statement here;
    @Override
    public String get() {
        return "my name is prince kuamr";
    }
    
}
