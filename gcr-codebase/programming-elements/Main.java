class Box<T> {

    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>("Hello");
        System.out.println(box1.getValue());

        box1.setValue("Java");
        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>(100);
        System.out.println(box2.getValue());
    }
}