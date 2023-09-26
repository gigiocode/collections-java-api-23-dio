// Create a class called "NumberOrder" that has a list of integers as an attribute. Implement the following methods:
// addNumber(int number): Adds a number to the list.
// sortAscending(): Sorts the numbers in the list in ascending order using the Comparable interface and the Collections class.
// sortDescending(): Sorts the numbers in the list in descending order using a Comparable and the Collections class.

package list.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOrder {

    private List<Integer> numberList;

    public NumberOrder() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numberList.add(number);
    }

    public List<Integer> ascOrder() {
        List<Integer> ascNumbers = new ArrayList<>(this.numberList);
        if (!numberList.isEmpty()) {
            Collections.sort(ascNumbers);
            return ascNumbers;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> descOrder() {
        List<Integer> ascNumbers = new ArrayList<>(this.numberList);
        if (!numberList.isEmpty()) {
            ascNumbers.sort(Collections.reverseOrder());
            return ascNumbers;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void showNumbers() {
        if (!numberList.isEmpty()) {
            System.out.println(this.numberList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    // Unitary Tests
    public static void main(String[] args) {

        NumberOrder numbers = new NumberOrder();

        numbers.addNumber(2);
        numbers.addNumber(5);
        numbers.addNumber(4);
        numbers.addNumber(1);
        numbers.addNumber(99);

        numbers.showNumbers();

        System.out.println(numbers.ascOrder());

        numbers.showNumbers();

        System.out.println(numbers.descOrder());

        numbers.showNumbers();
    }
}
