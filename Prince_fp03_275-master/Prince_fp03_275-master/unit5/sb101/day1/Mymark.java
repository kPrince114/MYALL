package day1;

import java.util.Comparator;

public class Mymark implements Comparator<Student>{
    
    //@Override
    public int compare(Student o1,Student o2){
        if(o1.getmark()>o2.getmark()){
            return 1;
        }
        else if(o1.getmark()<o2.getmark()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
