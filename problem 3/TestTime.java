/**
 * TestTime - Test program for the Time class
 */
public class TestTime {
    public static void main(String[] args) {
        // Creates two time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        
        // This displays the times before they are changed
        System.out.println("Initial times:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
        System.out.println();
        
        t1.nextSecond();
        t2.previousSecond();
        
        // Display the final times using toString() method
        System.out.println("After nextSecond() for t1 and previousSecond() for t2:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
    }
}
