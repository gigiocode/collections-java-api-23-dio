// Create a class called "OrderPeople" that has a list of objects of type "Person" as an attribute. 
// Each person has attributes such as name, age and height. Implement the following methods:
// addPerson(String name, int age, double height): Adds a person to the list.
// sortByAge(): Sorts the people in the list by age using the Comparable interface.
// sortByHeight(): Sorts the people in the list by height using a custom Comparator.

package list.Order;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
    }

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
    }

}

class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
    
}
