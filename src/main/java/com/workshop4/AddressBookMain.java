package com.workshop4;

/**
 * import scanner class
 * import all classes in util package
 * import all classes in regex package
 */
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;

/**
 * create a class name as AddressBookMain
 */
public class AddressBookMain {
    /**
     * create a object name as contact for ContactInfo class
     */
    public static ContactInfo contact;
    /**
     * create scanner class object name as sc
     */
    private static Scanner sc;
    /**
     * create array list ,object name as Addbook
     */
    ArrayList<ContactInfo> Addbook;

    /**
     * create a default constructor name as AddressBookMain
     */
    public  AddressBookMain() {
        Addbook = new ArrayList<ContactInfo>();
    }

    /**
     * create a method name as addContact
     */
    public void addContact() {

        /**
         * calling add method from addbook object
         */
        Addbook.add(contact);
        /**
         * contact add successfully then display this msg on console
         */
        System.out.println("Contact Added successfully!!");
    }

    /**
     * Create a method name as firstName, this method is boolean type that means its return op is true or false
     * it is parameterized method
     * @param firstName of person
     * @return - flag -persons firstname matched the regex
     * @throws ContactRegistrationException
     */
    public boolean FirstNameCheck(String firstName) throws ContactRegistrationException {
        /**
         * Regex to check valid firstname
         * 1) First name starts with Cap and has minimum 3 characters
         */
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher m = p.matcher(firstName);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of first name !! please re-try!");
        /**
         * flag is always true ,return patter matching persons first name
         */
        return flag;
    }

    /**
     * Create a method name as LastNameCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     *
     * @param lastName - persons last name
     * @return userlastname matched the Regex
     */
    public boolean LastNameCheck(String lastName) throws ContactRegistrationException {
        /**
         *  Regex to check valid userlastname.
         *  1) Last name starts with Cap and has minimum 3 character
         */
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher m = p.matcher(lastName);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of last name !! please re-try!");
        /**
         * flag is always true ,return patter matching persons Last name
         */
        return flag;
    }

    /**
     * Create a method name as emailAddress, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param email - persons email
     * @return - useremail matched the Regex
     */
    public boolean EmailCheck(String email) throws ContactRegistrationException {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher m = p.matcher(email);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of Email ID !! please re-try!");
        /**
         * flag is always true ,return patter matching persons email
         */
        return flag;
    }

    /**
     * Create a method name as CityCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param city - persons city
     * @return city name matced the regex
     * @throws ContactRegistrationException
     */
    public boolean CityCheck(String city) throws ContactRegistrationException {
        /**
         *  Regex to check valid City name.
         *  1) City name starts with Cap and has minimum 3 character
         */
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        /**
         * Pattern class contains matcher() method to find matching between given city name
         * and regular expression.
         */
        Matcher m = p.matcher(city);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of City !! please re-try!");
        /**
         * flag is always true ,return patter matching persons city name
         */
        return flag;
    }

    /**
     * Create a method name as AddressCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param add - persons address
     * @return persons address matched the regex
     * @throws ContactRegistrationException
     */
    public boolean AddressCheck(String add) throws ContactRegistrationException {
        /**
         * regex patter for persons addres
         */
        Pattern p = Pattern.compile("^[0-9a-zA-Z\\s,-]+$");
        /**
         * Pattern class contains matcher() method to find matching between given address
         * and regular expression.
         */
        Matcher m = p.matcher(add);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of Address !! please re-try!");
        /**
         * flag is always true ,return patter matching persons address
         */
        return flag;
    }

    /**
     * Create a method name as AddressCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param state - persons state
     * @return persons address matched the regex
     * @throws ContactRegistrationException
     */
    public boolean StateCheck(String state) throws ContactRegistrationException {
        /**
         *  Regex to check valid state name.
         *  1) state name starts with Cap and has minimum 3 character
         */
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{3,}");
        /**
         * Pattern class contains matcher() method to find matching between given state name
         * and regular expression.
         */
        Matcher m = p.matcher(state);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of State !! please re-try!");
        /**
         * flag is always true ,return patter matching persons address
         */
        return flag;
    }

    /**
     * Create a method name as MobileCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param zip - persons zip code
     * @return - zip code matched the Regex
     * @throws ContactRegistrationException
     */
    public boolean ZIPCheck(String zip) throws ContactRegistrationException {
        /**
         * regex patter for persons zip code
         * 1) zip code is only 6 digit
         */
        Pattern p = Pattern.compile("[0-9]{6}");
        /**
         * Pattern class contains matcher() method to find matching between given persons zip code
         * and regular expression.
         */
        Matcher m = p.matcher(zip);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of ZIP !! please re-try!");
        /**
         * flag is always true ,return patter matching persons zip code
         */
        return flag;
    }

    /**
     * Create a method name as MobileCheck, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param mobile - persons mobile no
     * @return - mobileNo matched the Regex
     * @throws ContactRegistrationException
     */
    public boolean MobileCheck(String mobile) throws ContactRegistrationException {
        /**
         * regex pattern for mobile no
         * 1) Country code follow by space and 10 digit number
         */
        Pattern p = Pattern.compile("[0-9]{2}[\\s][7-9][0-9]{9}");
        /**
         * Pattern class contains matcher() method to find matching between given phoneNumber
         * and regular expression.
         */
        Matcher m = p.matcher(mobile);
        boolean flag = m.matches();
        if (!flag)
            throw new ContactRegistrationException("Invalid entry of Mobile no. !! please re-try!");
        /**
         * flag is always true ,return patter matching persons address
         */
        return flag;
    }

    /**
     * create a main method,all program execute in main method
     * @param args - no arguments, its default
     */
    public static void main(String[] args) {
        /**
         * create scanner object
         * scanner used for taking input from user
         */
        sc = new Scanner(System.in);
        /**
         * 1st display welcome msg on console
         */
        System.out.println("Welcome to Address Book System!");
        System.out.println("-------------------------------");
        /**
         * create object for AddressBookMain class object name is ab
         */
        AddressBookMain ab = new AddressBookMain();
        /**
         * boolean pattern is true then print the data
         */
        boolean p = true;
        String fname = "";
        String lname = "";
        String add = "";
        String city = "";
        String state = "";
        String zip = "";
        String phone = "";
        String email = "";
        String choice = "";
        /**
         * 1st display on console do u want to create a contact in address book
         * and given 2 option Y means yes and N means no,chosen 1.
         */
        while (p) {
            System.out.println("Do you want to create a contact in Address book? (Y/N)");
            choice = sc.nextLine();
            /**
             * if u choose Y=yes then
             */
            if (choice.equalsIgnoreCase("y")) {
                while (true) {
                    try {
                        /**
                         * enter persons first name
                         */
                        System.out.print("Enter first name: ");
                        fname = sc.nextLine();
                        /**
                         * calling the firstname check method from ab object
                         */
                        if (ab.FirstNameCheck(fname)) {
                            break;
                        }
                        /**
                         * if u put wrong name opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }

                while (p) {
                    try {
                        /**
                         * enter persons last name
                         */
                        System.out.print("Enter last name: ");
                        lname = sc.nextLine();
                        /**
                         * calling the lastname check method from ab object
                         */
                        if (ab.LastNameCheck(lname)) {
                            break;
                        }
                        /**
                         * if u put wrong name opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (p) {
                    try {
                        /**
                         * enter persons address
                         */
                        System.out.print("Enter Address: ");
                        add = sc.nextLine();
                        /**
                         * calling the AddressCheck  method from ab object
                         */
                        if (ab.AddressCheck(add)) {
                            break;
                        }
                        /**
                         * if u put wrong address opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (p) {
                    try {
                        /**
                         * enter persons state name
                         */
                        System.out.print("Enter State: ");
                        state = sc.nextLine();
                        /**
                         * calling the state check method from ab object
                         */
                        if (ab.StateCheck(state)) {
                            break;
                        }
                        /**
                         * if u put wrong state name opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (p) {
                    try {
                        /**
                         * enter persons city name
                         */
                        System.out.print("Enter city: ");
                        city = sc.nextLine();
                        /**
                         * calling the city check method from ab object
                         */
                        if (ab.CityCheck(city)) {
                            break;
                        }
                        /**
                         * if u put wrong city name opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (true) {
                    try {
                        /**
                         * enter persons zip code
                         */
                        System.out.print("Enter ZIP: ");
                        zip = sc.nextLine();
                        /**
                         * calling the zip check method from ab object
                         */
                        if (ab.ZIPCheck(zip)) {
                            break;
                        }
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (true) {
                    try {
                        /**
                         * enter persons mobile no
                         */
                        System.out.print("Enter Mobile no.: ");
                        phone = sc.nextLine();
                        /**
                         * calling the mobile check method from ab object
                         */
                        if (ab.MobileCheck(phone)) {
                            break;
                        }
                        /**
                         * if u put wrong mobile no opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                while (true) {
                    try {
                        /**
                         * enter persons email id
                         */
                        System.out.print("Enter Email: ");
                        email = sc.nextLine();
                        /**
                         * calling the email check method from ab object
                         */
                        if (ab.EmailCheck(email)) {
                            break;
                        }
                        /**
                         * if u put wrong email Id opposite regex pattern then contactregistrationexception thrown
                         */
                    } catch (ContactRegistrationException e) {
                        System.out.println("contactregistrationexception thrown!!");
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                }
                contact = new ContactInfo();
                contact.setFname(fname);
                contact.setLname(lname);
                contact.setAddress(add);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setEmail(email);
                contact.setPhoneno(phone);
                ab.addContact();
                break;
            } else {
                System.out.println("Thankyou for visiting!");
                System.exit(0);
            }
        }
    }
}
