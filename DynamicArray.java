import java.util.ArrayList;

public class DynamicArray {
    private ArrayList<Integer> array;

    public DynamicArray() {
        array = new ArrayList<>();
    }

    public void insert(int value) {
        array.add(value);
    }

    public void delete(int index) {
        if (index >= 0 && index < array.size()) {
            array.remove(index);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void traverse() {
        System.out.println(array);
    }
}
