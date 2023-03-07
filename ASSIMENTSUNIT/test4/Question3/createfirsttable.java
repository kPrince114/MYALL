import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createfirsttable {
    public static void main(String[] args) {
        try(Connection conn= commonFun.provideConnection()) {
                   Statement stmt = con.createStatement();
                   String sql="CREATE TABLE Customer ( customerId int primary key,customerName varchar(12) not null,address varchar(20), roomNumber int,foreign key(roomNumber) references room(roomNumber))";
                 
                   stmt.executeUpdate(sql);
                   System.out.println("Created table Customer in given database...");
                   //con.close();
           } catch (Exception e) {
               e.printStackTrace();
               
           }
    }
}

