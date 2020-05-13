package execution;

import defination.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> stringSinglyLinkedList = new SinglyLinkedList<>();
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + "Press 1 to insert a item :");
            System.out.println("Press 2 to remove a item :");
            System.out.println("Press 3 to search a item :");
            System.out.println("Press 4 to print the LinkedList :");
            System.out.println("Press 5 to get the size of LinkedList :");
            System.out.println("Press 6 to exit :");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Press 1 to insert a item at first :");
                        System.out.println("Press 2 to insert a item at middle :");
                        System.out.println("Press 3 to insert a item at last :");
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
                        System.out.print("LinkedList : ");
                        stringSinglyLinkedList.print();
                        System.out.println("\n" + "Do you want to insert another item : (y/n)");
                        if (scanner.nextLine().equals("n"))
                            flag = false;
                    }
                    break;
                case 2:
                    flag = true;
                    while (flag) {
                        System.out.println("Press 1 to remove a item from first :");
                        System.out.println("Press 2 to remove a item from middle :");
                        System.out.println("Press 3 to remove a item from last :");
                        int option = Integer.parseInt(scanner.nextLine());
                        switch (option) {
                            case 1:
                                stringSinglyLinkedList.removeFirst();
                                break;
                            case 2:
                                System.out.println("Enter the item :");
                                String item = scanner.nextLine();
                                stringSinglyLinkedList.removeAfter(item);
                                break;
                            case 3:
                                stringSinglyLinkedList.remove();
                                break;
                        }
                        System.out.print("LinkedList : ");
                        stringSinglyLinkedList.print();
                        System.out.println("\n" + "Do you want to remove another item : (y/n)");
                        if (scanner.nextLine().equals("n"))
                            flag = false;
                    }
                    break;
                case 3:
                    System.out.println("Enter the item to search :");
                    String item = scanner.nextLine();
                    if (stringSinglyLinkedList.search(item) == 0)
                        System.out.println("Item found" + "\n");
                    else
                        System.out.println("Item not found!" + "\n");
                    break;
                case 4:
                    System.out.print("LinkedList : ");
                    stringSinglyLinkedList.print();
                    break;
                case 5:
                    System.out.println("Size of LinkedList : " + stringSinglyLinkedList.size());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice!" + "\n");
            }
        }
    }
}
