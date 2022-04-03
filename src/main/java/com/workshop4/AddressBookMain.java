package com.workshop4;

/**
 * UC1 :- Ability to create a Contacts in Address Book with first and last names, address,
 *        city, state, zip, phone number and email...
 * UC2 :- Ability to add a new Contact to Address Book
 * UC3 :- Ability to edit existing contact person using their name
 * UC4 :- Ability to delete a person using person's name
 *
 */


/**
 * import scanner class
 */
import java.util.Objects;
import java.util.Scanner;

/**
 * create a class name as AddressBookMain
 */
public class AddressBookMain {
    /**
     * create an object for scanner class,object name as sc
     */
    private static Scanner sc = new Scanner(System.in);
    /**
     * create object for ContactService class object name as contactService
     */
    static ContactService contactService;
    /**
     * create object for AddressBook class object name as addressBook
     */
    static AddressBook addressBook;

    /**
     * create a method name as findContact
     */
    public static void findContact() {
        /**
         * enter the person name
         */
        System.out.println("Enter Person Name");
        String name = sc.nextLine();
        /**
         * search this person by name in address book and display contact
         */
        contactService.displayContact(addressBook.searchByName(name));
    }

    /**
     * create a method name as editContact
     */
    public static void editContact() {
        /**
         * enter the person name
         */
        System.out.println("Enter Person Name");
        String name = sc.nextLine();
        /**
         * search this person by name in addressbook and if this is found then store in contact
         */
        Contact contact = addressBook.searchByName(name);
        /**
         * Object :-
         * This class consists of static utility methods for operating on objects.
         * These utilities include null-safe or null-tolerant methods for computing the hash code of an object,
         * returning a string for an object, and comparing two objects.
         */
        if (Objects.nonNull(contact)) {
            /**
             * calling editExistingContact method from contactService object
             */
            contactService.editExistingContact(contact);
            return;
        }
        /**
         * you given person name, and they can't be available in address book then display this msg
         */
        System.out.println("Person Not Found");
    }

    /**
     * create a method name as delete Contact
     */
    public static void deleteContact() {
        /**
         * enter the person name which name you want to delete
         */
        System.out.println("Enter Person Name");
        String name = sc.nextLine();
        /**
         * will find that person by his name in the address book,
         * then delete that name from the address book
         */
        if (Objects.nonNull(addressBook.searchByName(name))) {
            /**
             * calling deleteContact method for delete person name in addressBook object
             */
            addressBook.deleteContact(name);
            return;
        }
        /**
         * you given person name, and they can't be available in address book then display this msg
         */
        System.out.println("Person Not Found");
    }

    /**
     * create a method name as createContact
     */
    public static void createContact() {
        /**
         * calling addContact method for add new contact in address book from addressBook object
         */
        addressBook.addContact(contactService.createContact());
    }

    /**
     * create a main method,all program execute in main method
     * @param args- no arguments its default
     */
    public static void main(String[] args) {
        /**
         * 1st display welcome msg on console
         */
        System.out.println("Welcome to Address Book Program");
        System.out.println("--------------------------------");
        /**
         * create object for AddressBook class ,object name as addressBook
         */
        addressBook = new AddressBook();
        /**
         * create object for ContactService class,object name as contactService
         */
        contactService = new ContactService(sc);

        /**
         * repeat is true
         */
        boolean repeat = true;
        /**
         * condition is true then
         */
        while (repeat) {
            /**
             * display address book option on console, choose the option what u want
             * options :- 1) add new contact
             *            2) edit existing contact
             *            3) delete a contact
             *            4) View all contact
             *            5) Display contact
             *            6) exist
             */
            System.out.println(
                    "\nAddress Book Options:\n1 (Add new contact)\n2 (Edit existing contact)\n3 (Delete a contact)\n4 (View all contact)\n5 (Display contact)\n6 Exit");
            int option = Integer.parseInt(sc.nextLine());
            /**
             * using switch case
             */
            switch (option) {
                /**
                 * if u choose option 1 in address book options
                 */
                case 1:
                    /**
                     * then create a contact
                     */
                    createContact();
                    break;
                /**
                 * if u choose option 2 in address book options
                 */
                case 2:
                    /**
                     * then edit existing contact in address book
                     */
                    editContact();
                    break;
                /**
                 * if u choose option 3
                 */
                case 3:
                    /**
                     * delete contact in address book
                     */
                    deleteContact();
                    break;
                /**
                 * if u choose option 4
                 */
                case 4:
                    /**
                     * show all contacts in address book
                     */
                    System.out.println(addressBook);
                    break;
                /**
                 * if u choose option 5
                 */
                case 5:
                    /**
                     * find contact which u want in address book
                     */
                    findContact();
                    break;
                /**
                 * if u choose option 6
                 */
                case 6:
                    /**
                     * exist in all this options
                     */
                    repeat = false;
                    System.out.println("Exit");
                    break;
                /**
                 * if choose incorrect option like 7,8 that time display this msg on console
                 */
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }
}