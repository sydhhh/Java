package my.javaStructure;

public class MethodSample {
	public String text = "Some text";

    // Default Constructor
    public MethodSample()  {

    }

    // This method return a String
    // and has no parameter.
    public String getText() {
        return this.text;
    }

    // This is a method with one parameter String.
    // This method returns void (not return anything)    
    public void setText(String text) {
        // this.text reference to the text field.
        // Distinguish the text parameter.        
        this.text = text;
    }

    // Static method
    public static int sum(int a, int b, int c) {
        int d =  a + b + c;
        return d;
    }
}
