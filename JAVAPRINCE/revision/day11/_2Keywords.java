package day11;

public class _2Keywords {
    //keywords
    //try
    //catch (always after the try block) There shouldn't be any other statement bn try catch
    // class Plant{
        
    // }
    public static void main(String[] args) {
        //Plant plant = null;
        
        try
        {
            // System.out.println(plant.hashCode());;
            System.out.println(3/0);
            System.out.println("one more line");

        }
        //System.out.println(4);
        catch (ArithmeticException e){
            System.out.println("catch block");
        }


        finally {
            //always executed.
            System.out.println("resource clean up");
        }
    }
    //throw => used to create and throw an exception object
    //throws => declare an exception
}