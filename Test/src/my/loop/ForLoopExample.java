package my.loop;

public class ForLoopExample {
	public static void main(String[] args) {
		 
        // Declare a variable, step in loop
        int step = 1;
 
        // Declare a variable value with the start value is 0
        // After each iteration, value will increase 3
        // And the loop will end when the value greater than or equal to 10
        for(int value = 0; value < 10; value = value + 3) {
 
            System.out.println("Step ="+ step + "  value = "+ value);
 
            // Increase 1
            step = step + 1;
 
        }
 
    }
}
