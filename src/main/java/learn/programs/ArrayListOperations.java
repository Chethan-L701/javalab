package learn.programs;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListOperations {
    public static void execute() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice : ");
            System.out.println("1. Append");
            System.out.println("2. Remove");
            System.out.println("3. Insert at index");
            System.out.println("4. Search");
            System.out.println("5. Search with first letter.");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be appended : ");
                    list.add(sc.next());
                    break;
                case 2:
                    System.out.println("Enter the element to be removed : ");
                    list.remove(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted : ");
                    String element = sc.next();
                    System.out.println("Enter the index : ");
                    int index = sc.nextInt();
                    list.add(index, element);
                    break;
                case 4:
                    System.out.println("Enter the element to be searched : ");
                    String element1 = sc.next();
                    System.out.println(
                            (list.contains(element1)) ? "The element is present" : "The element is not present");
                    break;
                case 5:
                    System.out.println("Enter the first letter of element to be filtered : ");
                    char firstLetter = sc.next().charAt(0);
                    for (String item : list) {
                        if (item.charAt(0) == firstLetter) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
