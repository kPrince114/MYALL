import java.util.Comparator;

public class Product {
     int id;
    String name;
    int quantity;
     int price;
    public Product(int id,String name,int quantity,int price){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    } 
    
    @Override
    public String toString(){
        return "ProductDetails{"+"product Id : "+id+" procuct Name :"+name+" procuct price : "+price+" procuct quantity : "+quantity+"}"+"\n";
    }
    class Sortbyprice implements Comparator<Product>
    {
        public int compare(Product a, Product b)
        {
            return a.price - b.price;
        }
    }
    // public int compareTo(Product value) {
    //     return 0;
    // }

    // public Object getName() {
    //     return null;
    // }

    // public String getname() {
    //     return null;
    // }
}
