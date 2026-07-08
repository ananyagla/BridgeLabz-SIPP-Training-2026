

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();

        map.put(1, "Ananya");
        map.put(2, "Maya");
        map.put(3, "Priya");

        for (java.util.Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
