package day3;
public class second {
    public static void main(String[] args) {
        BankAcount acco1=new BankAcount();
        acco1.blance=20;
        BankAcount acco2=new BankAcount();
        acco2.blance=15;
        System.out.println(BankAcount.bankname);
        System.out.println(acco1.blance);


    }
}
class BankAcount{
    int blance;
    static String bankname="city";
}