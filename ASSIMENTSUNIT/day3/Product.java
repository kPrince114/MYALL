package day3;
class Product {

    int ProductId;
    String ProducName;
    int Price;
    int Quantity;

    Product(int ProductId,String ProducName,int Price,int Quantity){
        this.ProductId=ProductId;
        this.ProducName=ProducName;
        this.Price=Price;
        this.Quantity=Quantity;
    }
    @Override
    public String toString(){
        return "ProductDetails{"+" ProductId :- : "+ProductId+" ProducName:- :"+ProducName+" Price:- : "+Price+" Quantity:- "+ Quantity + "}";
    }
}