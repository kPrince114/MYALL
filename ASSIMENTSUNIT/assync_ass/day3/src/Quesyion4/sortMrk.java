package Quesyion4;

import java.util.Comparator;

class sortMrk implements Comparator<Student>{
    @Override
    public int compare(Student e1, Student e2){
        if(e1.getId()>e2.getId())
            return -1;
        else if(e1.getId()<e2.getId())
            return 1;
        else 
            return 0;
    }

	
}