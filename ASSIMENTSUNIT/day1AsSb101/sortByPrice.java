import java.util.Comparator;

class sortByPrice implements Comparator<Product>{
    @Override
    public int compare(Product e1, Product e2){
        if(e1.price>e2.price)
            return -1;
        else if(e1.price<e2.price)
            return 1;
        else 
            return 0;
    }

    
   
}

