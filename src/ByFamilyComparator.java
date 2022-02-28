import java.util.Comparator;

public class ByFamilyComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFamily().compareTo(person2.getFamily());
    }
}
