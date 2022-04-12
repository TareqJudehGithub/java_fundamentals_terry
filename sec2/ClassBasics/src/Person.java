import business.Company;

public class Person {
    // Primitive classes
    private String firstName = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J';
    private byte myByte;

    // Actual classes - so creating instances out of these classes are called objects.
    static private Company company = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
    }
}

