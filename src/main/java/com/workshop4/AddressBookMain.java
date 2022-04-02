package com.workshop4;

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
        /**
         * print contact
         */
        System.out.println(contact);
    }
}
