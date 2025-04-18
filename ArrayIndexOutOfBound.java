public class ArrayIndexOutOfBounds1 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index out of bounds!");
        } finally {

            System.out.println("Execution completed.");
        }
    }
}
