package dataStructures;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Mr. X");
        linkedList.add("Mr. Y");
        linkedList.add("Mr. A");
        linkedList.add("Mr. B");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("***********After***********");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        //peek return top
        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());
        //NoSuchElement exception thrown for element()

        System.out.println(linkedList.remove());
        System.out.println("*************After 2nd**********");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("*********Set*******");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.set(0,"Mr.Random"));
        System.out.println(linkedList.getFirst());
    }
}

