package my.javaStructure;

public class Person {
	// This is field
    // The name of Person
    public String name;

    // This is a Constructor
    // Use it to initialize the object (Create new object)
    // This constructor has one parameter
    // Constructor always have the same name as the class.
    public Person(String personName) {
        // Assign the value of the parameter into the 'name' field
        this.name = personName;
    }

    // This method returns a String ..
    public String getName() {
        return this.name;
    }
}
