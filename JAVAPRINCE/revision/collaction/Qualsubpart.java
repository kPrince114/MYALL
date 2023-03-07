package collaction;

// import java.util.Comparator;
import java.util.Objects;

public class Qualsubpart implements Comparable<Qualsubpart> {
    int height;
    String color;


    public Qualsubpart(int height, String color) {
        this.height = height;
        this.color = color;
    }
    public Qualsubpart(){}

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Qualsubpart that = (Qualsubpart) o;
        return this.color==that.color && this.height==that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }

    @Override
    public int compareTo(Qualsubpart that) { // -1, 0, 1
        if(this.height==that.height)
            return 0;
        if(this.height> that.height)
            return -1;
        else
            return 1;
    }
}