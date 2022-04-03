
package com.workshop4;

/**
 * import pattern class
 */
import java.util.regex.Pattern;

/**
 * create a class name as Validator
 */
public class Validator {
    /**
     * regex pattern for name, first name,lastname,city name, state name
     */
    private String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
    /**
     * regex pattern for address
     */
    private String addressPattern = "^[a-zA-Z0-9-, ]+";
    /**
     * regex pattern for zip code
     */
    private String zipPattern = "^[0-9]{2,}";
    /**
     * regex pattern for email id
     */
    private String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
    /**
     * regex pattern for phoneNumber
     */
    private String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";

    /**
     * create a method name as validateFirstName
     * it is boolean data type method which means this method output must be true or false
     * @param firstName - person first name in address book
     * @return true - pattern match with first name
     * @throws ContactRegistrationException
     */
    public boolean validateFirstName(String firstName) throws ContactRegistrationException {
        /**
         * if regrex name patter match with first name then return true first name
         */
        if (Pattern.matches(namePattern, firstName))
            return true;
        /**
         * if they are not matched with 1st name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid First Name, Please enter valid first name");
    }

    /**
     * create a method name as validateLastName
     * it is boolean data type method which means this method output must be true or false
     * @param lastName - person lastName in address book
     * @return true - pattern match with lastName
     * @throws ContactRegistrationException
     */
    public boolean validateLastName(String lastName) throws ContactRegistrationException {
        /**
         * if regrex name patter match with last name then return true last name
         */
        if (Pattern.matches(namePattern, lastName))
            return true;
        /**
         * if they are not matched with last name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Last Name, Please enter valid last name");
    }

    /**
     * create a method name as validateAddress
     * it is boolean data type method which means this method output must be true or false
     * @param address - person address in address book
     * @return true - pattern match with address
     * @throws ContactRegistrationException
     */
    public boolean validateAddress(String address) throws ContactRegistrationException {
        /**
         * if regrex address patter match with address then return true address
         */
        if (Pattern.matches(addressPattern, address))
            return true;
        /**
         * if they are not matched with address then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Address, Please enter valid address");
    }

    /**
     * create a method name as validateCity
     * it is boolean data type method which means this method output must be true or false
     * @param city - person city in address book
     * @return true - pattern match with city name
     * @throws ContactRegistrationException
     */
    public boolean validateCity(String city) throws ContactRegistrationException {
        /**
         * if regex name patter match with person city name then return true city name
         */
        if (Pattern.matches(namePattern, city))
            return true;
        /**
         * if they are not matched with city name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid City, Please enter valid city");
    }

    /**
     * create a method name as validateState
     * it is boolean data type method which means this method output must be true or false
     * @param state - person state in address book
     * @return true - pattern match with state
     * @throws ContactRegistrationException
     */
    public boolean validateState(String state) throws ContactRegistrationException {
        /**
         * if regrex name patter match with last name then return true last name
         */
        if (Pattern.matches(namePattern, state))
            return true;
        /**
         * if they are not matched with state name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid State, Please enter valid state");
    }

    /**
     * create a method name as validateZip
     * it is boolean data type method which means this method output must be true or false
     * @param zip - person zip code in address book
     * @return true - pattern match with zip
     * @throws ContactRegistrationException
     */
    public boolean validateZip(String zip) throws ContactRegistrationException {
        /**
         * if regrex zip patter match with zip code then return true zip
         */
        if (Pattern.matches(zipPattern, zip))
            return true;
        /**
         * if they are not matched with last name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Zip, Please enter valid zip");
    }

    /**
     * create a method name as validateEmail
     * it is boolean data type method which means this method output must be true or false
     * @param email - person emailID in address book
     * @return true - pattern match with emailID
     * @throws ContactRegistrationException
     */
    public boolean validateEmail(String email) throws ContactRegistrationException {
        /**
         * if regrex email patter match with email then return true email
         */
        if (Pattern.matches(emailPattern, email))
            return true;
        /**
         * if they are not matched with email then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Email, Please enter valid email");
    }

    /**
     * create a method name as validatePhoneNumber
     * it is boolean data type method which means this method output must be true or false
     * @param phoneNumber - person phoneNumber in address book
     * @return true - pattern match with phoneNumber
     * @throws ContactRegistrationException
     */
    public boolean validatePhoneNumber(String phoneNumber) throws ContactRegistrationException {
        /**
         * if regrex phoneNumber patter match with phoneNumber then return true phoneNumber
         */
        if (Pattern.matches(phoneNumberPattern, phoneNumber))
            return true;
        /**
         * if they are not matched with phoneNumber then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Phone Number, Please enter valid phone number");
    }
}

package com.workshop4;

/**
 * import pattern class
 */
import java.util.regex.Pattern;

/**
 * create a class name as Validator
 */
public class Validator {
    /**
     * regex pattern for name, first name,lastname,city name, state name
     */
    private String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
    /**
     * regex pattern for address
     */
    private String addressPattern = "^[a-zA-Z0-9-, ]+";
    /**
     * regex pattern for zip code
     */
    private String zipPattern = "^[0-9]{2,}";
    /**
     * regex pattern for email id
     */
    private String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
    /**
     * regex pattern for phoneNumber
     */
    private String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";

    /**
     * create a method name as validateFirstName
     * it is boolean data type method which means this method output must be true or false
     * @param firstName - person first name in address book
     * @return true - pattern match with first name
     * @throws ContactRegistrationException
     */
    public boolean validateFirstName(String firstName) throws ContactRegistrationException {
        /**
         * if regrex name patter match with first name then return true first name
         */
        if (Pattern.matches(namePattern, firstName))
            return true;
        /**
         * if they are not matched with 1st name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid First Name, Please enter valid first name");
    }

    /**
     * create a method name as validateLastName
     * it is boolean data type method which means this method output must be true or false
     * @param lastName - person lastName in address book
     * @return true - pattern match with lastName
     * @throws ContactRegistrationException
     */
    public boolean validateLastName(String lastName) throws ContactRegistrationException {
        /**
         * if regrex name patter match with last name then return true last name
         */
        if (Pattern.matches(namePattern, lastName))
            return true;
        /**
         * if they are not matched with last name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Last Name, Please enter valid last name");
    }

    /**
     * create a method name as validateAddress
     * it is boolean data type method which means this method output must be true or false
     * @param address - person address in address book
     * @return true - pattern match with address
     * @throws ContactRegistrationException
     */
    public boolean validateAddress(String address) throws ContactRegistrationException {
        /**
         * if regrex address patter match with address then return true address
         */
        if (Pattern.matches(addressPattern, address))
            return true;
        /**
         * if they are not matched with address then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Address, Please enter valid address");
    }

    /**
     * create a method name as validateCity
     * it is boolean data type method which means this method output must be true or false
     * @param city - person city in address book
     * @return true - pattern match with city name
     * @throws ContactRegistrationException
     */
    public boolean validateCity(String city) throws ContactRegistrationException {
        /**
         * if regex name patter match with person city name then return true city name
         */
        if (Pattern.matches(namePattern, city))
            return true;
        /**
         * if they are not matched with city name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid City, Please enter valid city");
    }

    /**
     * create a method name as validateState
     * it is boolean data type method which means this method output must be true or false
     * @param state - person state in address book
     * @return true - pattern match with state
     * @throws ContactRegistrationException
     */
    public boolean validateState(String state) throws ContactRegistrationException {
        /**
         * if regrex name patter match with last name then return true last name
         */
        if (Pattern.matches(namePattern, state))
            return true;
        /**
         * if they are not matched with state name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid State, Please enter valid state");
    }

    /**
     * create a method name as validateZip
     * it is boolean data type method which means this method output must be true or false
     * @param zip - person zip code in address book
     * @return true - pattern match with zip
     * @throws ContactRegistrationException
     */
    public boolean validateZip(String zip) throws ContactRegistrationException {
        /**
         * if regrex zip patter match with zip code then return true zip
         */
        if (Pattern.matches(zipPattern, zip))
            return true;
        /**
         * if they are not matched with last name then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Zip, Please enter valid zip");
    }

    /**
     * create a method name as validateEmail
     * it is boolean data type method which means this method output must be true or false
     * @param email - person emailID in address book
     * @return true - pattern match with emailID
     * @throws ContactRegistrationException
     */
    public boolean validateEmail(String email) throws ContactRegistrationException {
        /**
         * if regrex email patter match with email then return true email
         */
        if (Pattern.matches(emailPattern, email))
            return true;
        /**
         * if they are not matched with email then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Email, Please enter valid email");
    }

    /**
     * create a method name as validatePhoneNumber
     * it is boolean data type method which means this method output must be true or false
     * @param phoneNumber - person phoneNumber in address book
     * @return true - pattern match with phoneNumber
     * @throws ContactRegistrationException
     */
    public boolean validatePhoneNumber(String phoneNumber) throws ContactRegistrationException {
        /**
         * if regrex phoneNumber patter match with phoneNumber then return true phoneNumber
         */
        if (Pattern.matches(phoneNumberPattern, phoneNumber))
            return true;
        /**
         * if they are not matched with phoneNumber then throw error and display this msg
         */
        else
            throw new ContactRegistrationException("Invalid Phone Number, Please enter valid phone number");
    }
}

