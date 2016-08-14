package my.array;

public class arrayExample {
	public static void main(String[] args) {

        // Declare an array with 5 elements
        int[] myArray = new int[5];

        // Note: the first element of the array index is 0:

        // Assigning values to the first element (index 0)
        myArray[0] = 10;

        // Assigning values to the second element (index 1)
        myArray[1] = 14;

        myArray[2] = 36;
        myArray[3] = 27;

        // Value for the 5th element (the last element in the array)
        myArray[4] = 18;

        // Print out element count.
        System.out.println("Array Length=" + myArray.length);

        // Print to Console element at index 3 (4th element in the array)
        System.out.println("myArray[3]=" + myArray[3]);

        // Use a for loop to print out the elements in the array.
        for (int index = 0; index < myArray.length; index++) {
            System.out.println("Element " + index + " = " + myArray[index]);
        }
    }
}
