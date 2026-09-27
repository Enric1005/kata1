package software.ulpgc;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Enrique", LocalDate.of(2005, 11, 10));
        System.out.println(person.age());
    }
}
