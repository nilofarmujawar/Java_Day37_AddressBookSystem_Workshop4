package com.workshop4;

/**
 * import test class
 * import Assertions class
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * create a class name as AddressBookTest
 */
public class AddressBookTest {
    /**
     * create an object for AddressBookMain class,object name as addressbook
     */
    AddressBookMain addressbook = new AddressBookMain();

    //UC1
    @Test
    public void givenDetails_WhenInFormat_ShouldReturnTrue() throws ContactRegistrationException {
        boolean result1 = addressbook.FirstNameCheck("Nilofar");
        boolean result2 = addressbook.LastNameCheck("Mujawar");
        boolean result3 = addressbook.MobileCheck("91 9860644366");
        boolean result4 = addressbook.AddressCheck("Karmveer Nagar,Nandre -416416");
        boolean result5 = addressbook.EmailCheck("nilofarmujawar1118@gmail.com");
        boolean result6 = addressbook.CityCheck("Nandre");
        boolean result7 = addressbook.StateCheck("Maharashtra");
        boolean result8 = addressbook.ZIPCheck("416416");
        Assertions.assertEquals(true, result8);
    }
}
