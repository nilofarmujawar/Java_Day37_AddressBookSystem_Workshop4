package com.workshop4;

/**
 * UC1 :- Ability to create a Contacts in Address Book with first and last names, address,
 *        city, state, zip, phone number and email...
 * UC2 :- Ability to add a new Contact to Address Book
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
        AddressBook addressBook = new AddressBook();
        /**
         * create object for ContactService class,object name as contactService
         */
        ContactService contactService = new ContactService(sc);
        /**
         * create object for Contact class,object name as contact
         */
        Contact contact = new Contact();
        /**
         * calling createPerson method from contactService object
         */
        contactService.createPerson(contact, sc);
        System.out.println(contact+"\n");
        /**
         * calling addContact method from addressBook object
         */
        addressBook.addContact(contact);
        System.out.println("Contact is added to addressBook");

    }
}