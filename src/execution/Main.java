package execution;

import defination.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList<>();
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to insert a node :");
            System.out.println("Press 2 to remove a node :");
            System.out.println("Press 3 to search a node :");
            System.out.println("Press 4 to print the LinkedList :");
            System.out.println("Press 5 to get the size of LinkedList :");
            System.out.println("Press 6 to exit :");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Press 1 to insert a node at first :");
                    System.out.println("Press 2 to insert a node at middle :");
                    System.out.println("Press 3 to insert a node at last :");
                    int option = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the item :");
                    String item = scanner.nextLine();
                    switch (option) {
                        case 1:
                            stringSinglyLinkedList.addFirst(item);
                            break;
                        case 2:
                            System.out.println("Enter the position :");
                            int index = Integer.parseInt(scanner.nextLine());
                            stringSinglyLinkedList.addAfter(index, item);
                            break;
                        case 3:
                            stringSinglyLinkedList.add(item);
                            break;
                    }
                    break;

            }

        }

    }
}