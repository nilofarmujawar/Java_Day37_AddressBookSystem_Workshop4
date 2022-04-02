package com.workshop4;

/**
 * import Test class
 * import assertEquals class
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * create a class name as ValidatorTest
 */
class ValidatorTest {

    /**
     * test cases
     */
    @Test
    public void testValidateFirstName() {
        try {
            Validator obj = new Validator();
            String firstName = "Nilofar";
            assertEquals(true, obj.validateFirstName(firstName));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateLastName() {
        try {
            Validator obj = new Validator();
            String lastName = "Mujawar";
            assertEquals(true, obj.validateLastName(lastName));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateAddress() {
        try {
            Validator obj = new Validator();
            String address = "Knagar,Nandre";
            assertEquals(true, obj.validateAddress(address));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateCity() {
        try {
            Validator obj = new Validator();
            String city = "Nandre";
            assertEquals(true, obj.validateCity(city));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateState() {
        try {
            Validator obj = new Validator();
            String state = "Maharashtra";
            assertEquals(true, obj.validateState(state));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateZip() {
        try {
            Validator obj = new Validator();
            String zip = "416416";
            assertEquals(true, obj.validateZip(zip));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidateEmail() {
        try {
            Validator obj = new Validator();
            String email = "abc.xyz@cg.com";
            assertEquals(true, obj.validateEmail(email));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testValidatePhoneNumber() {
        try {
            Validator obj = new Validator();
            String phoneNumber = "91 9469091234";
            assertEquals(true, obj.validatePhoneNumber(phoneNumber));
        } catch (ContactRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

}