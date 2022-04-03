package com.workshop4;

/**
 * UC1 :- Ability to create a Contacts in Address Book with first and last names, address,
 *        city, state, zip, phone number and email...
 * UC2 :- Ability to add a new Contact to Address Book
 * UC3 :- Ability to edit existing contact person using their name
 * UC4 :- Ability to delete a person using person's name
 * UC5 :- Ability to add multiple person to Address Book
 *
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
     * create an object for scanner class,object name as sc
     */
    private static Scanner sc = new Scanner(System.in);
    /**
     * create object for AddressBook class object name as addressBook
     */
    static AddressBook addressBook;


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
         * create object for AddressBookMultiplePerson class ,object name as addressBookService
         */
        AddressBookMultiplePerson addressBookService = new AddressBookMultiplePerson(sc);
        /**
         * create object for AddressBook class ,object name as addressBook
         */
        addressBook = new AddressBook();
        /**
         * calling addressBookOptions method from addressBookService object
         */
        addressBookService.addressBookOptions(addressBook);
    }
}