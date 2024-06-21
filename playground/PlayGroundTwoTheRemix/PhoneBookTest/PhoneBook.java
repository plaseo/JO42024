package PhoneBookTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneBook {
    List<PhoneEntry> contancts = new ArrayList<PhoneEntry>();

    public List<PhoneEntry> search(String lastName) {
        return contancts.stream()
                .filter(phoneEntry ->
                        phoneEntry.firstName.toLowerCase().equals(lastName.toLowerCase())
                                || phoneEntry.lastName.toLowerCase().equals(lastName.toLowerCase()))
                .collect(Collectors.toList());

    }

    public Optional<PhoneEntry> search(String firsName, String lastName){
        return contancts.stream()
                .filter(phoneEntry ->
                         phoneEntry.firstName.toLowerCase().equals(firsName.toLowerCase())
                                 && phoneEntry.lastName.toLowerCase().equals(lastName.toLowerCase()))
                .findFirst();
    }
}