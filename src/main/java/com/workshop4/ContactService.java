package com.workshop4;

/**
 * import scanner class
 */
import java.util.Scanner;

/**
 * create a class name as ContactService
 */
public class ContactService {
    /**
     * scanner object sc
     * validator object validator
     */
    private Scanner sc;
    private Validator validator;

    /**
     * create a parameterized constructor name as ContactService
     * @param sc- scanner i/p
     */
    public ContactService(Scanner sc ) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.sc= sc;
        this.validator = new Validator();
    }

    /**
     * create a method name as createPerson
     * this is parameterized method
     * @param contact-  This is maintains contact information
     * @param sc - sacnner i/p
     */
    public void createPerson(Contact contact, Scanner sc) {
        /**
         * variables in all string data type
         */
        String firstName, lastName, address, city, state, zip, email, phoneNumber;
        /**
         * display on console first name,you put the 1st name
         */
        System.out.println("first name:");
        while (true) {
            try {
                firstName = sc.nextLine();
                /**
                 * calling validateFirstName method from validator object
                 * validateFirstName is a boolean method,this ans should be true or false
                 */
                validator.validateFirstName(firstName);
                /**
                 * calling setFirstName method from contact object
                 */
                contact.setFirstName(firstName); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console last name,you put the person last name
         */
        System.out.println("last name:");
        while (true) {
            try {
                lastName = sc.nextLine();
                /**
                 * calling validateLastName method from validator object
                 * validateLastName is a boolean method,this ans should be true or false
                 */
                validator.validateLastName(lastName);
                /**
                 * calling setLastName method from contact object
                 */
                contact.setLastName(lastName); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console address,you put the person address
         */
        System.out.println("address:");
        while (true) {
            try {
                address = sc.nextLine();
                /**
                 * calling validateLastName method from validator object
                 * validateLastName is a boolean method,this ans should be true or false
                 */
                validator.validateAddress(address);
                /**
                 * calling setAddress method from contact object
                 */
                contact.setAddress(address); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console person city ,you put the person city name
         */
        System.out.println("city:");
        while (true) {
            try {
                city = sc.nextLine();
                /**
                 * calling validateCity method from validator object
                 * validateCity is a boolean method,this ans should be true or false
                 */
                validator.validateCity(city);
                /**
                 * calling setCity method from contact object
                 */
                contact.setCity(city); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console person state,you put the person state name
         */
        System.out.println("state:");
        while (true) {
            try {
                state = sc.nextLine();
                /**
                 * calling validateState method from validator object
                 * validateState is a boolean method,this ans should be true or false
                 */
                validator.validateState(state);
                /**
                 * calling setState method from contact object
                 */
                contact.setState(state); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console first name,you put the 1st name
         */
        System.out.println("zip:");
        while (true) {
            try {
                zip = sc.nextLine();
                /**
                 * calling validateZip method from validator object
                 * validateZip is a boolean method,this ans should be true or false
                 */
                validator.validateZip(zip);
                /**
                 * calling setZip method from contact object
                 */
                contact.setZip(zip); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console first name,you put the 1st name
         */
        System.out.println("Phone Number:");
        while (true) {
            try {
                phoneNumber = sc.nextLine();
                /**
                 * calling validatePhoneNumber method from validator object
                 * validatePhoneNumber is a boolean method,this ans should be true or false
                 */
                validator.validatePhoneNumber(phoneNumber);
                /**
                 * calling setPhoneNumber method from contact object
                 */
                contact.setPhoneNumber(phoneNumber); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**
         * display on console first name,you put the 1st name
         */
        System.out.println("email:");
        while (true) {
            try {
                email = sc.nextLine();
                /**
                 * calling validateEmail method from validator object
                 * validateEmail is a boolean method,this ans should be true or false
                 */
                validator.validateEmail(email);
                /**
                 * calling setEmail method from contact object
                 */
                contact.setEmail(email); break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nContact is added successfully\n");
    }
}