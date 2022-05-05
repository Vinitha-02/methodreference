import java.util.*;

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class methodreference {
    public static int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
        Collections.sort(personList, methodreference::compareByName);
        System.out.println("Sort by name :");
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
        Collections.sort(personList, methodreference::compareByAge);

        System.out.println("Sort by age :");
        personList.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);
    }
}
