public class Assignment1 {
    public static void main(String[] args) {

        StaticArray staticArray = new StaticArray(5);
        staticArray.insert(1);
        staticArray.insert(2);
        staticArray.insert(3);
        System.out.print("StaticArray after insertion: ");
        staticArray.traverse();
        staticArray.delete(1);
        System.out.print("StaticArray after deletion: ");
        staticArray.traverse();

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.insert(1);
        dynamicArray.insert(2);
        dynamicArray.insert(3);
        System.out.print("DynamicArray after insertion: ");
        dynamicArray.traverse();
        dynamicArray.delete(1);
        System.out.print("DynamicArray after deletion: ");
        dynamicArray.traverse();

        System.out.println("Concatenation: " + StringOperations.concatenate("hello", "world"));
        System.out.println("Substring: " + StringOperations.substring("hello", 1, 4));
        System.out.println("Comparison: " + StringOperations.compare("hello", "world"));
        System.out.println("Character Frequency: " + StringOperations.characterFrequency("hello"));
    }
}
