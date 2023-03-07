package day1_ass1.Day1;

class Product {
    int productid;
    String productName;
    int quantity;
    int price;

    Product(int productid, String productName, int quantity, int price){
        this.productid=productid;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    public String toString(){

        return "price "+price;
    }
}
