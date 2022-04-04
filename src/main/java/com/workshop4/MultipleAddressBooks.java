package com.workshop4;

/**
 * import hashmap class
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    /**
     * create a method name as search city,this is parameterized method
     * in this method we search the person by there city name
     * @param city - persons city
     * @return-list
     */
    public List<Contact> searchByCity(String city) {
        /**
         * create a list object name as list
         */
        List<Contact> list = new ArrayList<Contact>();
        for (Map.Entry entry: addressBooks.entrySet()) {
            List<Contact> contactList = ((AddressBook)entry.getValue()).searchByCity(city);
            /**
             * using for each loop for contact
             */
            for (Contact contact: contactList) {
                /**
                 * calling add method from list object
                 */
                list.add(contact);
            }
        }
        return list.stream().filter(contact->contact!= null).distinct().collect(Collectors.toList());
    }
}