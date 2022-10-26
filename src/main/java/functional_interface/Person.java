package functional_interface;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    public String name ;
    public Integer age;
    public String pan;
    public Double salary;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pan='" + pan + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Person(String name, Integer age, String pan, Double salary) {
        this.name = name;
        this.age = age;
        this.pan = pan;
        this.salary = salary;
    }

    public static String getOrgName(){
        return "IT department";
    }

    public Integer getYOB(){
        return LocalDate.now().getYear() - this.age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPan() {
        return pan;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
