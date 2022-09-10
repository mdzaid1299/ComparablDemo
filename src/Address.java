public class Address implements Comparable<Address> {
    private String name;
    private String street;
    private String city;
    private String country;
    private  int zipCode;

    private Address() {}

    Address(String name, String street, String city, String country, int zipCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;

    }


    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    @Override
    public int compareTo(Address address) {
        if (this.zipCode == address.zipCode) {
            return 0;
        }
        if (this.zipCode < address.zipCode) {
            return -1;
        }
        return 1;
    }
}
