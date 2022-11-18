package com.bibekdhungana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class CustomComparator implements Comparator<Person> {

//   public int compare(Person o1, Person o2) {
//     return o1.getLastName().compareTo(o2.getLastName());
//   }
// }

public class Unit1Exercise {

  public static void main(String[] args) {
    List<Person> people = new ArrayList();

    people.add(new Person("Charles", "Dickens", 60));
    people.add(new Person("Lewis", "Caroll", 42));
    people.add(new Person("Thomas", "Carlyle", 51));
    people.add(new Person("Charlotte", "Bronte", 45));
    people.add(new Person("charles", "Dickens", 39));

    //sort the list by last name using Java 7 using separate class
    // Collections.sort(people, new CustomComparator());

    //sort the list by last name uisng Java 7 using anonymous inner class
    // Collections.sort(
    //   people,
    //   new Comparator<Person>() {
    //     @Override
    //     public int compare(Person p1, Person p2) {
    //       return p1.getLastName().compareTo(p2.getLastName());
    //     }
    //   }
    // );

    //sort the list by the last name using lambda expression
    Collections.sort(
      people,
      (p1, p2) -> p1.getLastName().compareTo(p2.getLastName())
    );

    //create a method that print all element of the List\
    // printAllPeople(people);

    //create a method that prints all people that have last name begining with C
    printPeopleLastNameWithC(people, "C");
  }

  public static void printAllPeople(List<Person> list) {
    for (Person p : list) {
      System.out.println(p);
    }
  }

  public static void printPeopleLastNameWithC(List<Person> list, String c) {
    for (Person p : list) {
      if (p.getLastName().startsWith(c)) {
        System.out.println(p);
      }
    }
  }
}
