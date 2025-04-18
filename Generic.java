
public class Generic {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {23.5, 1.4, 7.9, 35.0};
        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("\nInteger array contains:");
        printArray(intArray);

        System.out.println("\nDouble array contains:");
        printArray(doubleArray);

        System.out.println("\nCharacter array contains:");
        printArray(charArray);
    }
}
