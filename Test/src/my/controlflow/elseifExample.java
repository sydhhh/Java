package my.controlflow;

public class elseifExample {
	public static void main(String[] args) {

        // Declaring a integer number (int)        
        int score = 90;

        System.out.println("Your score =" + score);

        // If the score is less than 50
        if (score < 50) {
            System.out.println("You are not pass");
        }

        // Else if the score more than or equal to 50 and less than 80.
        else if (score >= 50 && score < 80) {
            System.out.println("You are pass");
        }

        // Remaining cases (that is greater than or equal to 80)
        else {
            System.out.println("You are pass, good student!");
        }

    }
}
