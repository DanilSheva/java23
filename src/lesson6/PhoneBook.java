package lesson6;

import java.util.Locale;

public class PhoneBook {
    //характеристики данного типа

    private Contact[] contacts = new Contact[1000];


    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;


            }

        }

    }

    public void search(String forSearch) {
        for (Contact c : contacts) {
            if (c != null) {
                String nameOfCurrentContact = c.getName().toLowerCase();
                if (nameOfCurrentContact!=null) {
                    if (nameOfCurrentContact.contains(forSearch)) {
                        System.out.println(c.getName()+""+c.getPhoneNumber());

                    }
                }
                String phoneOfCurrentContact = c.getPhoneNumber().toLowerCase();
                if (phoneOfCurrentContact!=null) {
                    if (phoneOfCurrentContact.contains(forSearch)) {
                        System.out.println(c.getName()+" "+c.getPhoneNumber());

                    }
                }

            }


        }

    }


}
