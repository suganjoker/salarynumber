import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GovernmentSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            while (age < 0) {
                System.out.println("Age cannot be negative. Enter a valid age: ");
                age = scanner.nextInt();
            }

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            while (salary < 0) {
                System.out.println("Salary cannot be negative. Enter a valid salary: ");
                salary = scanner.nextDouble();
            }

            people.add(new Person(name, age, salary));
        }

        double totalSalary = 0;
        int totalAge = 0;

        for (Person person : people) {
            totalSalary += person.getSalary();
            totalAge += person.getAge();
        }

        double averageSalary = totalSalary / numberOfPeople;
        double averageAge = (double) totalAge / numberOfPeople;

        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Average Age: " + averageAge);
    }
}
