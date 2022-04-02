package com.workshop4;

/**
 * create a class name as ContactInfo
 * This class maintains contact information
 */
public class ContactInfo {

    /**
     * variables
     */
    String fname;
    String lname;
    String address;
    String city;
    String state;
    String zip;
    String phoneno;
    String email;

    /**
     * create a parameterized constructor
     * @param fname- persons in address book
     * @param lname- persons in address book
     * @param address -persons in address book
     * @param city- persons in address book
     * @param state- persons in address book
     * @param zip- persons in address book
     * @param phoneno- persons in address book
     * @param email- persons in address book
     */
    public ContactInfo(String fname, String lname, String address, String city, String state, String zip,
                       String phoneno, String email) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phoneno = phoneno;
        this.email = email;
    }

    /**
     * create a default constructor name as ContactInfo
     */
    public ContactInfo() {

    }

    /**
     * here using getter setter method,
     * The get method returns the variable value, and the set method sets the value.
     */


    /**
     * crete a get method name as getFname
     * The get method returns the value of the variable
     * @return fname -employee firstname
     */
    public String getFname() {
        return fname;
    }

    /**
     * The set method takes a parameter (fname) and assigns it to the fname variable
     * @param fname-employee id
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * crete a get method name as getLname
     * The get method returns the value of the variable
     * @return lname -employee lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * The set method takes a parameter (lname) and assigns it to the lname variable
     * @param lname-employee lastname
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * crete a get method name as getAddress
     * The get method returns the value of the variable
     * @return address -employee address
     */
    public String getAddress() {
        return address;
    }

    /**
     * The set method takes a parameter (address) and assigns it to the address variable
     * @param address-employee address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * crete a get method name as getState
     * The get method returns the value of the variable
     * @return state -employee state
     */
    public String getState() {
        return state;
    }

    /**
     * The set method takes a parameter (state) and assigns it to the state variable
     * @param state-employee state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * crete a get method name as getCity
     * The get method returns the value of the variable
     * @return city -employee city
     */
    public String getCity() {
        return city;
    }

    /**
     * The set method takes a parameter (city) and assigns it to the city variable
     * @param city-employee city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * crete a get method name as getZip
     * The get method returns the value of the variable
     * @return zip -employee zip code
     */
    public String getZip() {
        return zip;
    }

    /**
     * The set method takes a parameter (zip) and assigns it to the zip variable
     * @param zip-employee zipcode
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * crete a get method name as getPhoneno
     * The get method returns the value of the variable
     * @return phoneno -employee phoneno
     */
    public String getPhoneno() {
        return phoneno;
    }

    /**
     * The set method takes a parameter (phoneno) and assigns it to the phoneno variable
     * @param phoneno-employee phone no
     */
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    /**
     * crete a get method name as getEmail
     * The get method returns the value of the variable
     * @return email -employee email
     */
    public String getEmail() {
        return email;
    }

    /**
     * The set method takes a parameter (email) and assigns it to the email variable
     * @param email-employee emailid
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * create a method name as show
     */
    public void show() {
        System.out.println("Contact details are as: \n First name:" + fname + " \n Last name: " + lname
                + " \n Address: " + address + " \n City: " + city + " \n State: " + state + " \n ZIP: " + zip
                + " \n Mobile no: " + phoneno + " \n Email id : " + email);
        System.out.println();
    }
}