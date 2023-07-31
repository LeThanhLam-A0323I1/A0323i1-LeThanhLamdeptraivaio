package ss10.B2LinkedList;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        LinkedList test = new LinkedList();
        integerMyLinkedList.addFirst(1);
        integerMyLinkedList.add(1, 2);
        integerMyLinkedList.add(2, 3);
        integerMyLinkedList.add(3, 4);
        integerMyLinkedList.addLast(5);

        System.out.println("Display linked list: ");
        for (int i = 0; i < integerMyLinkedList.numNodes; i++) {
            System.out.println("Node " + (i + 1) + ": " + integerMyLinkedList.get(i));
        }
    }
}