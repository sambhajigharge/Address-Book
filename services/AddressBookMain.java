package AddressBook.services;

import AddressBook.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Person> personMap = new HashMap();

    //This is the main method, Here is the starting point of the program.

    public static void main(String[] args) {
        addPersonDetail();
    }

    //Method for taking person details and store them into storage.
    //In this program used hashmap.
    private static void addPersonDetail() {
        Person person = new Person();
        System.out.print("Enter First Name : ");
        person.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name : ");
        person.setLastName(scanner.nextLine());
        System.out.print("Enter Address : ");
        person.setAddress(scanner.nextLine());
        System.out.print("Enter City : ");
        person.setCity(scanner.nextLine());
        System.out.print("Enter State : ");
        person.setState(scanner.nextLine());
        System.out.print("Enter ZipCode : ");
        person.setZip(scanner.nextLine());
        System.out.print("Enter Phone Number : ");
        person.setPhone(scanner.nextLine());

        personMap.put(person.getFirstName(), person);
        System.out.println(personMap.toString());
    }
}

