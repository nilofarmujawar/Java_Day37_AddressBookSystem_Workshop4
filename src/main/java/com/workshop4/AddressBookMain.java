package com.workshop4;

/**
 * UC1 :- Ability to create a Contacts in Address Book with first and last names, address,
 *        city, state, zip, phone number and email...
 * UC2 :- Ability to add a new Contact to Address Book
 * UC3 :- Ability to edit existing contact person using their name
 * UC4 :- Ability to delete a person using person's name
 * UC5 :- Ability to add multiple person to Address Book
 * UC6 :- Refactor to add multiple Address Book to the System Each Address Book has a unique Name
 * UC7 :- Ability to ensure there is no Duplicate Entry of the same Person in a particular Address Book
 * UC8 :- Ability to search Person in a City or State across the multiple AddressBook
 * UC9 :- Ability to view Persons by City or State
 * UC10 :- Ability to get number of contact persons i.e. count by City or State
 */

/**
 * import scanner class
 */

import java.util.Scanner;

/**
 * create a class name as AddressBookMain
 */
public class AddressBookMain {
    /**
     * create a method name as addNewAddressBook
     * this is parameterized method
     * @param addressBooks -multiple persons in address book
     * @param addressBookService - multiple address book
     * @param sc - user i/p
     */
    public static void addNewAddressBook(MultipleAddressBooks addressBooks, AddressBookMultiplePerson addressBookService, Scanner sc) {
        /**
         * enter address book name what u want
         */
        System.out.print("Enter Name:");
        String name;
        name = sc.nextLine();
        /**
         * given name address book already present in address book system
         * then display this msg on console
         */
        if (addressBooks.searchAddressBook(name) != null) {
            System.out.println("Already exist");
            return;
        }
        /**
         * create object for AddressBook class,object name as addressBook
         */
        AddressBook addressBook = new AddressBook(name);

        /**
         * calling addAddressBook method from addressBooks object
         */
        addressBooks.addAddressBook(addressBook);
        /**
         * display on console
         */
        System.out.print("Added new Address Book\n");
    }

    /**
     * create a method name as viewExistingAddressBook, this method is parameterized
     * @param addressBooks - multiple address book
     * @param addressBookService - multiple persons
     * @param sc - user i/p
     */
    public static void viewExistingAddressBook(MultipleAddressBooks addressBooks, AddressBookMultiplePerson addressBookService,
                                               Scanner sc) {
        /**
         * previous address book name
         */
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        /**
         * calling searchAddressBook method from addressBOoks object, and result store in
         * address book
         */
        AddressBook addressBook = addressBooks.searchAddressBook(name);
        /**
         * if address book is not null then
         */
        if (addressBook != null) {
            /**
             * show address book options
             * here calling addressBookOptions method from addressBookService method
             */
            addressBookService.addressBookOptions(addressBook);
            return;
        }
        /**
         * if u put  wrong previous address book name then display this msg
         */
        System.out.print("No addres book found\n");
    }

    /**
     * create a method name as searchByCity,this is parameterized method
     * in this method we search person by there city name
     * @param addressBooks - diff address book data stored
     * @param sc - sacnner i/p
     */
    public static void searchByCity(MultipleAddressBooks addressBooks, Scanner sc) {
        /**
         * enter persons city name
         */
        System.out.println("Enter the city:");
        String city = sc.nextLine();
        System.out.println("Contact for given city:");
        /**
         * variable
         */
        int count = 1;
        for (Contact contact: addressBooks.searchByCity(city)) {
            if (contact!=null) {
                System.out.println(count+"\n"+contact+"\n");
                count++;
            }
        }
        /**
         * Ability to get number of contact persons i.e. count by City
         */
        if (count==1) {
            System.out.println("Not found");
            return;
        }
        count--;
        System.out.println("Count of Persons from given City: "+count);
    }

    /**
     * create a method name a viewByState,this is parameterized method
     * in this method we view a person by there state in address book
     * @param addressBooks - all data saved
     * @param sc - sacnner i/p
     */
    public static void viewByState(MultipleAddressBooks addressBooks, Scanner sc) {
        System.out.println("Enter the state:");
        String state = sc.nextLine();
        System.out.println("Contact for given state:");
        int count = 1;
        for (Contact contact: addressBooks.viewByState(state)) {
            if (contact!=null) {
                System.out.println(count+"\n"+contact+"\n");
                count++;
            }
        }
        /**
         * Ability to get number of contact persons i.e. count by State
         */
        if (count==1) {
            System.out.println("Not found");
            return;
        }
        count--;
        System.out.println("Count of Persons from given State: "+count);
    }

    /**
     * create a main method,all program execute in main method
     * @param args - no arguments its default
     */
    public static void main(String[] args) {
        /**
         * 1st display welcome msg on console
         */
        System.out.println("Welcome to Address Book Program");
        System.out.println("--------------------------------");
        /**
         * create scanner class object name as sc
         * scanner class used for taking i/p frome user
         */
        Scanner sc = new Scanner(System.in);
        /**
         * create MultipleAddressBooks class object,object name as addressBooks
         */
        MultipleAddressBooks addressBooks = new MultipleAddressBooks();
        /**
         * create AddressBookMultiplePerson  class object,object name as addressBookService
         */
        AddressBookMultiplePerson addressBookService = new AddressBookMultiplePerson(sc);

        /**
         * boolean repeat is true
         */
        boolean repeat = true;
        /**
         * while loop is used if condition is true, then
         */
        while (repeat) {
            /**
             * display main option on console
             * main option :-
             *            1) add new AddressBook
             *            2) View or open existing AddressBook
             *            3) search and view by city
             *            4) search and view by state
             *            5) exist
             */
            System.out
                    .println("Main Options:\n1 (Add new AddressBook)\n2 (View or open existing AddressBook)\n3 (Search and view by city) \n4 (Search and view by state)\n5 (Exit)");
            int option = Integer.parseInt(sc.nextLine());
            /**
             * using switch case for option
             */
            switch (option) {
                /**
                 * if u choose option 1 then
                 */
                case 1:
                    /**
                     * added new address book
                     */
                    addNewAddressBook(addressBooks, addressBookService, sc);
                    break;
                /**
                 * if u choose option 2 then
                 */
                case 2:
                    /**
                     * view existing address book or add new contact details in this address book
                     */
                    viewExistingAddressBook(addressBooks, addressBookService, sc);
                    break;
                /**
                 * if u choose option 3 then
                 */
                case 3:
                    /**
                     * person search by city in address book
                     */
                    searchByCity(addressBooks, sc);
                    break; //todo
                case 4:
                    viewByState(addressBooks, sc);
                    break;
                /**
                 * if u choose option 4 ,then exist in all this process
                 */
                case 5:
                    repeat = false;
                    break;
                /**
                 * if u choose 5 like this that time default statement is execute
                 */
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }
}