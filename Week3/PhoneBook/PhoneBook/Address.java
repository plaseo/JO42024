package PhoneBook;

public class Address {
    private String buildingNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;

    //constructor
    public Address(String buildingNumber, String streetName, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //getters and setters
    public String getBuildingNumber() {
        return buildingNumber;
    }
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return "Address:" + buildingNumber + " " + streetName + " City:" +  city + " State:" + state + " Zip:" + zipCode;
    }

    
    
    
}
