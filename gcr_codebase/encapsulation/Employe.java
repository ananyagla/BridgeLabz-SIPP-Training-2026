import java.util.ArrayList;

class Employe {
    int id;
    String name;

    Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employe> list = new ArrayList<>();

        list.add(new Employe(1, "Ananya"));
        list.add(new Employe(2, "Rahul"));
        list.add(new Employe(3, "Priya"));

        for (Employe e : list) {
            System.out.println(e.id + " " + e.name);
        }
    }
}
