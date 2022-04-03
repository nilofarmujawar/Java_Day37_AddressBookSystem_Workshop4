package com.workshop4;

/**
 * import hashmap class
 */
import java.util.HashMap;

/**
 * create a class name as MultipleAddressBooks
 */
public class MultipleAddressBooks {
    /**
     * create a hashmap 
     */
    private HashMap<String, AddressBook> addressBooks;

    /**
     * create default constructor name as MultipleAddressBooks
     */
    public MultipleAddressBooks() {
        this.addressBooks = new HashMap<String, AddressBook>();
    }

    /**
     * create a method name as addAddressBook
     * @param addressBook - store information 
     */
    public void addAddressBook(AddressBook addressBook) {
        /**
         * put :-
         * Associates the specified value with the specified key in this map.
         * If the map previously contained a mapping for the key, the old value is replaced.
         *
         * calling put method from addressBook object
         */
        addressBooks.put(addressBook.getName(), addressBook);
    }

    /**
     *  create a method name as searchAddressBook
     *  this is parameterized method
     * @param name - addressbook name
     * @return addressbook name
     */
    public AddressBook searchAddressBook(String name) {
        for (String key: addressBooks.keySet()) {
            if (key.equalsIgnoreCase(name)) {
                return addressBooks.get(key);
            }
        }
        return null;
    }
}