package functional_interface;

import java.util.function.*;

public class TestClass {

    public static int increment(int num) {
        return num + 1;
    }

    public static Function<Integer, Integer> funcInterfaceFn = num -> num + 1;
    public static Function<Person, Double> updateSalary = person -> person.getSalary() + 1000;
    public static Function<Person, String> generateMailId = person
            -> (person.getName() + "@" + Person.getOrgName() + ".com").replace(" ", "");

    public static Function<Integer, Integer> incrementByOne = number -> number + 1;
    public static Function<Integer, Integer> multiplyByTen = number -> number * 10;
    public static Function<Integer, Integer> combined = incrementByOne.andThen(multiplyByTen);

    //Bifunction
    public static BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> (num1 * num2) + 100;

    //Consumer
    public static Consumer<Person> greetMessage = person -> System.out.println("Welcome " + person.getName());
    //Bi Consumer
    public static BiConsumer<Integer, Integer> greetMessageV2= (num1, num2) -> System.out.println("HI" + num1 + num2);

    //Predicates

    public static Predicate<Person> checkAgePredicate = person -> person.getAge() > 25;
    public static Predicate<Person> checkSalaryPredicate = person -> person.getSalary() > 2000;

    public static void main(String[] args) {
        System.out.println(increment(10));
        System.out.println(funcInterfaceFn.apply(10));
        Person person = new Person("jack", 26, "JMJNT5253P", 34543.35);
        System.out.println(updateSalary.apply(person));
        System.out.println(generateMailId.apply(person));
        System.out.println("Combined" + " " + combined.apply(1));
        System.out.println(incrementByOne.andThen(multiplyByTen).apply(10));
        System.out.println(biFunction.andThen(incrementByOne).apply(10,10));
        greetMessage.accept(person);
        greetMessageV2.accept(10,20);
        System.out.println(checkAgePredicate.and(checkSalaryPredicate).test(person));
        //Supplier
        Supplier<String> getConnectionString = ()-> "jdbc://oracle:localhost";
        System.out.println(getConnectionString.get());
        BiFunction<Integer, Integer, Integer> fn1 = (num1, num2) -> num1*num2;
        BiFunction<Integer, Integer, Integer> fn2 = (num1, num2) -> {
            if(num1>num2) return num1*num2;
            return num1/num2;
        };
        Function<Integer, String> fn3 = num -> {
            if (num >18) return "Age less than 18";
            return "Age more than 18";
        };

        Function<Integer, String> fn4 =  num ->"num more than 10";

    }
}
