public class Contact {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;

    public Contact(String firstName, String lastName, String  phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nPhone: " + phoneNumber +
                "\nEmail: " + email + "\n";
    }
}