public class Person {
    private String lastName;
    private String firstName;
    private String birthdate;
    private int zipCode;

    public Person(String last, String first,
                  String birthdate, int zip) {
        this.lastName = last;
        this.firstName = first;
        this.birthdate = birthdate;
        this.zipCode = zip;
    }
}
