package my.javaStructure;

public class PersonTest {
	public static void main(String[] args) {

        // Create an object of class Person
        // Initialize this object via constructor of class Person
        // Specifically, Edison
        Person edison = new Person("Edison");

        // Class Person has the method getName()
        // Use the object to call getName():
        String name = edison.getName();
        System.out.println("Person 1: " + name);

        // Create an object of class Person
        // Initialize this object via constructor of class Person
        // Specifically, Bill Gates
        Person billGate = new Person("Bill Gates");

        // Class Person has field name (public)
        // Use objects to refer to it.
        String name2 = billGate.name;
        System.out.println("Person 2: " + name2);

    }
}
