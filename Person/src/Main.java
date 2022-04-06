public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Akin");
        person.setLastName("Unver");
        person.setAge(15);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

    }

}
