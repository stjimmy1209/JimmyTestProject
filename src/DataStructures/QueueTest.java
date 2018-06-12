package DataStructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        LinkedListDemo();
        ArrayDequeDemo();

    }

    public static void LinkedListDemo(){

        Queue<String> queue = new LinkedList<>();
        queue.offer("Michael Jackson");
        queue.offer("George Washington");
        queue.offer("John Adams");
        queue.offer("Thomas Jefferson");
        queue.offer("James Monroe");

        queue.forEach(str-> System.out.println(str));
        System.out.println("\n");

        queue.poll();
        System.out.println("\n");

        queue.forEach(str-> System.out.println(str));
        System.out.println("\n");

        System.out.println(queue.peek());
        System.out.println("\n");
        queue.forEach(str-> System.out.println(str));


    }

    public static void ArrayDequeDemo(){

        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.push("Michael Jackson");
        queue.push("George Washington");
        queue.push("John Adams");
        queue.push("Thomas Jefferson");
        queue.push("James Monroe");

        System.out.println("\n" + "****************");

        System.out.println("Pop: " + queue.pop());
        queue.forEach(str-> System.out.println(str));
        System.out.println("Push:" );
        queue.push("Kobe Bryant");
        System.out.println("________________"+"\n");
        queue.forEach(str-> System.out.println(str));


    }



}
