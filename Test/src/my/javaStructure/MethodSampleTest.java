package my.javaStructure;

public class MethodSampleTest {
	public static void main(String[] args) {

        // Create instance of MethodSample
        MethodSample obj = new MethodSample();

        // Call getText() method
        String text = obj.getText();

        System.out.println("Text = " + text);

        // Call method setText(String)
        obj.setText("New Text");

        System.out.println("Text = " + obj.getText());

        // Static method can be called through the class.
        // This way is recommended. (**)
        int sum = MethodSample.sum(10, 20, 30);

        System.out.println("Sum  10,20,30= " + sum);

        // Or call through objects
        // This way is not recommended. (**)        
        int sum2 = obj.sum(20, 30, 40);

        System.out.println("Sum  20,30,40= " + sum2);
    }

}
