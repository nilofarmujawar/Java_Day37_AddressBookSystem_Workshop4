package com.workshop4;

/**
 * create a class name as ContactRegistrationException
 */
public class ContactRegistrationException extends Exception {

    /**
     * custom exception class for invalid contact entry
     *
     */
    public ContactRegistrationException(String message) {
        super(message);
    }
}
