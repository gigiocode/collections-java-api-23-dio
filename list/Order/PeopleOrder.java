// Create a class called "OrderPeople" that has a list of objects of type "Person" as an attribute. 
// Each person has attributes such as name, age and height. Implement the following methods:
// addPerson(String name, int age, double height): Adds a person to the list. 
// sortByAge(): Sorts the people in the list by age using the Comparable interface.
// sortByHeight(): Sorts the people in the list by height using a custom Comparator.

package list.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrder {

    private List<Person> peopleList;

    public PeopleOrder() {
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        peopleList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> byAgePeople = new ArrayList<>(peopleList);
        Collections.sort(byAgePeople);
        return byAgePeople;
    }

    public List<Person> sortByHeight() {
        List<Person> byHeightPeople = new ArrayList<>(peopleList);
        Collections.sort(byHeightPeople, new ComparatorByHeight());
        return byHeightPeople;
    }

    // Unitary Tests
    public static void main(String[] args) {

        PeopleOrder peopleOrder = new PeopleOrder();

        peopleOrder.addPerson("Alice", 20, 1.56);
        peopleOrder.addPerson("Bob", 30, 1.80);
        peopleOrder.addPerson("Charlie", 25, 1.70);
        peopleOrder.addPerson("David", 17, 1.56);

        System.out.println(peopleOrder.peopleList);

        System.out.println(peopleOrder.sortByAge());

        System.out.println(peopleOrder.sortByHeight());
    }

}
