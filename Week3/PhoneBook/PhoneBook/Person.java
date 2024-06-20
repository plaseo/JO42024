package PhoneBook;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private Address address;
    private String phoneNumber;

    //constructor
    public Person(String firstName, String lastName, String middleName, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "PB Entry [last=" + lastName + " first=" + firstName + " middle=" + middleName + " address=" + address +  " phone" + phoneNumber + "]";
    }

    // private String firstName;
    // private String lastName;
    // private String middleName;
    // private Address address;
    // private String phoneNumber;
  

}
