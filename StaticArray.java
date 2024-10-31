public class StaticArray {
    private int[] array;
    private int size;
    private int count;

    public StaticArray(int size) {
        this.array = new int[size];
        this.size = size;
        this.count = 0;
    }

    public void insert(int value) {
        if (count < size) {
            array[count++] = value;
        } else {
            System.out.println("Array is full");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--count] = 0;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
