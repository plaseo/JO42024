// maintain a collection of phone entries

import java.io.*;
import java.util.*;

public class PhoneBook implements Serializable
{
    protected ArrayList<PhoneEntry> entries = new ArrayList<PhoneEntry>();

    // Does the phone book contain an entry for the given target?
    //    Ignores case differences.
    public boolean contains(String target_name)
    {
        return lookupEntry(target_name) != null;
    }

    // Return the entry associated with this target
    //    Ignores case differences and returns null if not found.
    public PhoneEntry lookupEntry(String target_name)
    {
        for(PhoneEntry entry : entries) {
            if ( entry.getName().equalsIgnoreCase(target_name) )
                return entry;
        }
        return null;
    }

    // Return the phone number for a given target or null if there is 
    //    no match. Ignores case differences in names.
    public String lookupNumber(String target_name)
    {
        PhoneEntry ent = lookupEntry(target_name);
        if ( ent == null )
            return null;
        else
            return ent.getNumber();
    }
   
    // Add an entry into the phonebook; entries are inserted in 
    //   essentially random order
    public void addEntry(PhoneEntry ent)
    {
        entries.add(ent);
    }

    // Add an entry for the given name and number; entries are inserted in
    //    essentially random order
    public void addEntry(String name, String number)
    {
        addEntry(new PhoneEntry(name, number));
    }

    // Update the phone number for the given name; name matching is
    //   case-insensitive, but the entry must exist
    public void changeEntry(String name, String number)
    {
        PhoneEntry ent = lookupEntry(name);
        if ( ent == null )
            throw new IllegalArgumentException("Submitted name, " + name 
                                    + ", has no entry in the phone book.");
        ent.setNumber(number);
    }

}