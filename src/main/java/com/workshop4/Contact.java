
package com.workshop4;

/**
 * create a class name as Contact
 * This class maintains contact information
 */
public class Contact {
    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    /**
     * create default constructor name as Contact
     */
    public Contact() {
    }

    /**
     * create parametrized constructor name as Contact
     * @param firstName - person first name in address book
     * @param lastName - person last name in address book
     * @param address - person address in address book
     * @param city - person city in address book
     * @param state - person state in address book
     * @param zip - person zip code in address book
     * @param phoneNumber - persons phoneNumber in address book
     * @param email - persons emailID in address book
     */
    public Contact(String firstName, String lastName, String address, String city, String state, String zip,
                   String phoneNumber, String email) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */



    /**
     * The set method takes a parameter (firstName) and assigns it to the firstName variable
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * crete a get method name as getFirstName
     * The get method returns the value of the variable
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }



    /**
     * The set method takes a parameter (lastName) and assigns it to the lastName variable
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * crete a get method name as getLastName
     * The get method returns the value of the variable
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }



    /**
     * The set method takes a parameter (address) and assigns it to the address variable
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * crete a get method name as getAddress
     * The get method returns the value of the variable
     * @return address
     */
    public String getAddress() {
        return address;
    }



    /**
     * The set method takes a parameter (city) and assigns it to the city variable
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * crete a get method name as getCity
     * The get method returns the value of the variable
     * @return city
     */
    public String getCity() {
        return city;
    }



    /**
     * The set method takes a parameter (state) and assigns it to the state variable
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * crete a get method name as getState
     * The get method returns the value of the variable
     * @return state
     */
    public String getState() {
        return state;
    }



    /**
     * The set method takes a parameter (zip) and assigns it to the zip variable
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * crete a get method name as getZip
     * The get method returns the value of the variable
     * @return zip
     */
    public String getZip() {
        return zip;
    }


    /**
     * The set method takes a parameter (phoneNumber) and assigns it to the phoneNumber variable
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * crete a get method name as getPhoneNumber
     * The get method returns the value of the variable
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }



    /**
     * The set method takes a parameter (email) and assigns it to the email variable
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * crete a get method name as getEmail
     * The get method returns the value of the variable
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * crete a get method name as getName
     * The get method returns the value of the variable
     * @return firstName + " " + lastName
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return String.format("Name: %s %s\nAddress: %s, %s, %s, %s\nPhone Number: %s\nEmail: %s", firstName, lastName,
                address, city, state, zip, phoneNumber, email);
    }

package com.workshop4;

/**
 * create a class name as Contact
 * This class maintains contact information
 */
public class Contact {
    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    /**
     * create default constructor name as Contact
     */
    public Contact() {
    }

    /**
     * create parametrized constructor name as Contact
     * @param firstName - person first name in address book
     * @param lastName - person last name in address book
     * @param address - person address in address book
     * @param city - person city in address book
     * @param state - person state in address book
     * @param zip - person zip code in address book
     * @param phoneNumber - persons phoneNumber in address book
     * @param email - persons emailID in address book
     */
    public Contact(String firstName, String lastName, String address, String city, String state, String zip,
                   String phoneNumber, String email) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */



    /**
     * The set method takes a parameter (firstName) and assigns it to the firstName variable
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * crete a get method name as getFirstName
     * The get method returns the value of the variable
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }



    /**
     * The set method takes a parameter (lastName) and assigns it to the lastName variable
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * crete a get method name as getLastName
     * The get method returns the value of the variable
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }



    /**
     * The set method takes a parameter (address) and assigns it to the address variable
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * crete a get method name as getAddress
     * The get method returns the value of the variable
     * @return address
     */
    public String getAddress() {
        return address;
    }



    /**
     * The set method takes a parameter (city) and assigns it to the city variable
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * crete a get method name as getCity
     * The get method returns the value of the variable
     * @return city
     */
    public String getCity() {
        return city;
    }



    /**
     * The set method takes a parameter (state) and assigns it to the state variable
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * crete a get method name as getState
     * The get method returns the value of the variable
     * @return state
     */
    public String getState() {
        return state;
    }



    /**
     * The set method takes a parameter (zip) and assigns it to the zip variable
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * crete a get method name as getZip
     * The get method returns the value of the variable
     * @return zip
     */
    public String getZip() {
        return zip;
    }


    /**
     * The set method takes a parameter (phoneNumber) and assigns it to the phoneNumber variable
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * crete a get method name as getPhoneNumber
     * The get method returns the value of the variable
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }



    /**
     * The set method takes a parameter (email) and assigns it to the email variable
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * crete a get method name as getEmail
     * The get method returns the value of the variable
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * crete a get method name as getName
     * The get method returns the value of the variable
     * @return firstName + " " + lastName
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return String.format("Name: %s %s\nAddress: %s, %s, %s, %s\nPhone Number: %s\nEmail: %s", firstName, lastName,
                address, city, state, zip, phoneNumber, email);
    }

}