//Build an Address Book Management System that stores contact details such as name, phone number, and email address. 
//Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention.
//Build an Address Book Management System that stores contact details such as name, phone number, and email address. 
// Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention. 
// Your program should support the following functionalities: I Store all contacts in an ArrayList to maintain an ordered list. 
// Use a HashMap<String, Contact> for quick lookup of contacts by name. 
// Use a HashSet String> to ensure that duplicate phone numbers cannot be added. Implement functionality to add, search, delete, and display contacts. 
// Display all contacts sorted alphabetically by name using Collections.sort(). 
// Ensure that whenever a contact is added or deleted, all three collections remain synchronized and contain consistent data.
import java.util.*;

public class Main {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number not allowed");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phones.add(phone);

        System.out.println("Contact Added");
    }