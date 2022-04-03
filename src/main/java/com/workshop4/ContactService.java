package com.workshop4;

/**
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


    public Contact createContact() {
        Contact contact = new Contact();
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
        return contact;
    }

    /**
     * create a parameterized method name as editExistingContact
     * in this method we edit the existing person name
     * @param contact - all the information saved
     */
    public void editExistingContact(Contact contact) {
        /**
         * while condition is true
         */
        while(true) {
            /**
             * display those options on console
             * Select the option you want to edit
             */
            System.out.println("Options to update contact:");
            /**
             * options
             */
            System.out.println("1 (FirstName)\n2 (LastName)\n3 (Address)\n4 (City)\n5 (State)\n6 (Zip)\n7 (Phone)\n8 (Email)\n9 (Exit)");
            int options = Integer.parseInt(sc.nextLine());
            /**
             * using switch case
             */
            switch (options) {
                /**
                 * u choose option 1 in option to update contact
                 * enter new first name what u want then,
                 * The edited name is set on the previous name in the contact.
                 */
                case 1:
                    System.out.println("Enter New FirstName");
                    String newFirstName = sc.nextLine();
                    contact.setFirstName(newFirstName);
                    break;
                /**
                 * u choose option 2 in option to update contact
                 * enter person new last name what u want then,
                 * The edited last name is set on the previous last name in the contact.
                 */
                case 2:
                    System.out.println("Enter New LastName");
                    String newLastName= sc.nextLine();
                    contact.setLastName(newLastName);
                    break;
                /**
                 * u choose option 3 in option to update contact
                 * enter person new address what u want then,
                 * The edited address is set on the previous address in the contact.
                 */
                case 3:
                    System.out.println("Enter New Address");
                    String newAddress = sc.nextLine();
                    contact.setAddress(newAddress);
                    break;
                /**
                 * u choose option 4 in option to update contact
                 * enter new city name what u want then,
                 * The edited city name is set on the previous city name in the contact.
                 */
                case 4:
                    System.out.println("Enter New City");
                    String newCity = sc.nextLine();
                    contact.setCity(newCity);
                    break;
                /**
                 * u choose option 5 in option to update contact
                 * enter new state name what u want then,
                 * The edited state name is set on the previous state name in the contact.
                 */
                case 5:
                    System.out.println("Enter State");
                    String newState = sc.nextLine();
                    contact.setState(newState);
                    break;
                /**
                 * u choose option 6 in option to update contact
                 * enter new zip code what u want then,
                 * The edited zip code is set on the previous zip code in the contact.
                 */
                case 6:
                    System.out.println("Enter New Zip");
                    String newZip= sc.nextLine();
                    contact.setZip(newZip);
                    break;
                /**
                 * u choose option 7 in option to update contact
                 * enter new phone number what u want then,
                 * The edited phone number is set on the previous phone number in the contact.
                 */
                case 7:
                    System.out.println("Enter New Phone");
                    String newPhone = sc.nextLine();
                    contact.setPhoneNumber(newPhone);
                    break;
                /**
                 * u choose option 8 in option to update contact
                 * enter new email id what u want then,
                 * The edited email id is set on the previous email id in the contact.
                 */
                case 8:
                    System.out.println("Enter New Email");
                    String newEmail = sc.nextLine();
                    contact.setFirstName(newEmail);
                    break;
                /**
                 * if u choose option 9 then exist in this process
                 */
                case 9:
                    System.out.println("Exit");
                    return;
                /**
                 * if u choose option 10 ,11 like this,that time display this option on console
                 */
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
    }

    /**
     * create a method name as displayContact,this is parameterized method
     * A method that displays the data we have edited
     * @param contact - all person details stored
     */
    public void displayContact(Contact contact) {
        /**
         * if contact is empty
         */
        if (contact == null) {
            /**
             * then display this msg on console
             */
            System.out.println("Contact not found");
            return;
        }
        /**
         * display all details we have edited
         */
        System.out.println(contact);
    }
}