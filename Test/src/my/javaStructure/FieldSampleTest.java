package my.javaStructure;

public class FieldSampleTest {
	public static void main(String[] args) {

        // Create the first object.
        FieldSample obj1 = new FieldSample("Value1");

        System.out.println("obj1.myValue= " + obj1.myValue);

        // Print out static value, access via instance of class (an object).
        System.out.println("obj1.MY_STATIC_FIELD= " + obj1.MY_STATIC_FIELD);

        // Print out static value, access via class.
        System.out.println("FieldSample.MY_STATIC_FIELD= "
                + FieldSample.MY_STATIC_FIELD);

        // Create second object:
        FieldSample obj2 = new FieldSample("Value2");

        System.out.println("obj2.myValue= " + obj2.myValue);

        // Print out static value, access via instance of class (an object)
        System.out.println("obj2.MY_STATIC_FIELD= " + obj2.MY_STATIC_FIELD);

        System.out.println(" ------------- ");

        // Set new value for static field.
        // (Or using: FieldSample.MY_STATIC_FIELD = 200)
        obj1.MY_STATIC_FIELD = 200;

        // It will print out the value 200.
        System.out.println("obj2.MY_STATIC_FIELD= " + obj2.MY_STATIC_FIELD);
    }
}
