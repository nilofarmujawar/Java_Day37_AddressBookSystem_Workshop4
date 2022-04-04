package com.workshop4;

/**
 * import scanner class
 * import object class
 */

import java.util.Objects;
import java.util.Scanner;

/**
 * create a class name as AddressBookMultiplePerson
 */
public class AddressBookMultiplePerson {

    /**
     * create object for scanner class object name as sc
     */
    private Scanner sc;
    /**
     * create object for Validator class object name as validator
     */
    private Validator validator;
    /**
     * create object for ContactService class object name as contactService
     */
    private ContactService contactService;
    /**
     * create object for AddressBook class object name as addressBook
     */
    private AddressBook addressBook;

    /**
     * create a parameterized constructor named as AddressBookMultiplePerson
     * @param sc - input from user
     */
    public AddressBookMultiplePerson(Scanner sc) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.sc = sc;
        this.validator = new Validator();
    }


    /**
     * create a method name as findContact
     */
    public void findContact() {
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
    public  void editContact() {
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
    public void deleteContact() {
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
    public void createContact() {
        Contact contact = contactService.createContact();
        if (contact==null) {
            System.out.println("Already exist in Address Book");
            return;
        }
        addressBook.addContact(contact);
    }


    /**
     * create a method name as addressBookOptions
     * this is parameterized method
     * @param addressBook - all data stored
     */
    public void addressBookOptions(AddressBook addressBook) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.addressBook = addressBook;
        /**
         * create object for ContactService class,object name as contactService
         */
        contactService = new ContactService(sc,addressBook);

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