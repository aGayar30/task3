package persons;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        String input = scanner.next();
        while (!input.equals("0")) {
            StringTokenizer token = new StringTokenizer(input, ",");
            Person p = new Person(token.nextToken(), Integer.valueOf(token.nextToken()));
            people.add(p);
            input = scanner.next();
        }
        for (Person element: people) {
            System.out.println(element);
        }
    }
}
