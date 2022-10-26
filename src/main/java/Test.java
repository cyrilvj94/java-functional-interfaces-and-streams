import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args){
        Person p = new Person("Joe", 24, "AABDE4534N", 3000.34);
        System.out.println(p.getSalary());
        System.out.println(p.getYOB());
        System.out.println(Person.getOrgName());
        System.out.println();
        System.out.println("Hi hello");
        List<Person> personList = List.of(new Person("Joe", 24, "AABDE4534N", 3000.34),
                        new Person("jack", 26, "JMJNT5253P", 34543.35),
                        new Person("Jill", 45, "UUKEO9870I", 989374.44),
                        new Person("Josh", 34, "IOKUM78165J", 70375.98)
                );
        personList.stream().forEach(person -> System.out.println(person.getYOB()));
        List<Person> filterPerson= personList.stream().filter(person -> person.getYOB() > 1990).collect(Collectors.toList());
        filterPerson.stream().forEach(person -> System.out.println( "HI" + person.getYOB()));
        List<Integer> integerList = List.of(1,2,3,4,5,600);
        System.out.println(Math.pow(45,4));
        List<Integer> newList = integerList.stream().map(number -> (int)Math.pow(number, 2)).collect(Collectors.toList());
        System.out.println(newList);
        personList.stream().map(person -> person.getPan().toLowerCase()).forEach(i-> System.out.println(i));
        List<Double> updatedSalary =
                    personList.stream().map(person -> person.getSalary() + 10000).collect(Collectors.toList());
        List<Person> salAbove70kList = personList.stream().filter(person -> person.getSalary() > 70_000).collect(Collectors.toList());
        System.out.println(salAbove70kList);

    }
}
