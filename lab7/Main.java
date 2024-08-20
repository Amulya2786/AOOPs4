package lab7;


public class Main {
	public static void main(String[] args) {
        // Using Set
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("Alice", "12345"));
        contactManager.addContact(new Contact("Bob", "67890"));
        contactManager.addContact(new Contact("Alice", "12345")); // Duplicate contact

        System.out.println("All Contacts (Set): " + contactManager.getAllContacts());

        // Using Map
        ContactManagerWithMap contactManagerWithMap = new ContactManagerWithMap();
        contactManagerWithMap.addContact(new Contact("Alice", "12345"));
        contactManagerWithMap.addContact(new Contact("Bob", "67890"));

        System.out.println("Find Contact by Name (Alice): " + contactManagerWithMap.findContactByName("Alice"));
        System.out.println("Find Contact by Phone Number (67890): " + contactManagerWithMap.findContactByPhoneNumber("67890"));
    }
}

