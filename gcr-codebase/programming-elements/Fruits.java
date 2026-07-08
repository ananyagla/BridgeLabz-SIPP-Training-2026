class Fruits {
    String color;

    public Fruits(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Fruit color: " + color);
    }
}

class Apple extends Fruits {

    public Apple(String color) {
        super(color);
    }

    public void taste() {
        System.out.println("Apple is sweet.");
    }
}

class Banana extends Fruits {

    public Banana(String color) {
        super(color);
    }

    public void taste() {
        System.out.println("Banana is soft and sweet.");
    }
}

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Red");
        apple.display();
        apple.taste();

        System.out.println();

        Banana banana = new Banana("Yellow");
        banana.display();
        banana.taste();
    }
}