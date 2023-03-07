package day3;

public class Method {
        public static void main(String[] args) {
            hi(); //method calling
            int total=sum(2,3);
            System.out.println(total);
        }
        //Syntax:
        //[Access_Modifiers] return_Type method_Name([param_List])[throws Exception_List]
        //{
        // return something;
        // }
    
        //two types of methods:
        //1.concrete
        public static void hi(){ //definiton
            System.out.println("hi");
        }
    
        public static int sum(int x, int y ){
            return x+y;
        }
    
        // 2.abstract methods:
        // abstract public  int calculateArea();
    }
    

